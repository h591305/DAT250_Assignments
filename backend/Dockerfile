FROM gradle:8.8-jdk21 AS builder

WORKDIR /home/gradle

COPY settings.gradle.kts gradlew build.gradle.kts ./

COPY src src
COPY gradle gradle

RUN gradle bootJar

RUN mv build/libs/demo-0.0.1-SNAPSHOT.jar app.jar


FROM eclipse-temurin:21-alpine

RUN addgroup -g 1010 app
RUN adduser -G app -D -u 1010 -h /app appuser

USER appuser
WORKDIR /app

COPY --from=builder --chown=1010:1010 /home/gradle/app.jar .

CMD ["java", "-jar", "app.jar"]
