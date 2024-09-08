package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Poll {

    @JsonProperty("question")
    private String question;

    @JsonProperty("publishedAt")
    private Instant publishedAt;

    @JsonProperty("validUntil")
    private Instant validUntil;

    @JsonProperty("options")
    private List<VoteOption> options = new ArrayList<>();

    public Poll() {
    }

    public Poll(String question, Instant publishedAt, Instant validUntil) {
        this.question = question;
        this.publishedAt = publishedAt;
        this.validUntil = validUntil;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Instant getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Instant publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Instant getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(Instant validUntil) {
        this.validUntil = validUntil;
    }

    public List<VoteOption> getOptions() {
        return options;
    }

    public void setOptions(List<VoteOption> options) {
        this.options = options;
    }
}
