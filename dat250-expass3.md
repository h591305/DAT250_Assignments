# Oblig 5 - MongoDB

## Introduction
For this assignment I used MongoDB to get familiar with NoSQL databases. I downloaded the MongoDB Compass to create the database and perform queries to it. 
I could have used the UI to query the database, but I decided to use MongoDB Shell (`mongosh`).

## Validation Of MongoDB-Installation
After realizing that the tutorial used an older version of MongoDB, I did manage to get the right SHA-256 signature for the newest version of MongoDB and verifying the MongoDB packages.

![screenshot](https://github.com/user-attachments/assets/879fd22e-7e60-4c1a-af41-97ec01b9a132)

## Screenshots From CRUD Operations
For the examples I did for the most part use the Pizza database, but for the read-example I used the Orders database.

### Create:

![screenshot](https://github.com/user-attachments/assets/40f72d88-907c-461c-9c38-3e51a6fd88f9)

### Read:
![screenshot](https://github.com/user-attachments/assets/2482994c-a6b3-470b-93df-6160e3a5c52b)

### Update:
![screenshot](https://github.com/user-attachments/assets/6e9e3949-f9b6-4c70-8a90-7e5f29c417ba)

### Delete:
![screenshot](https://github.com/user-attachments/assets/6ef8b56f-7230-40a0-be6b-5ec2c5c8c16a)

### Bulk-Write
![screenshot](https://github.com/user-attachments/assets/2d1388d6-9228-4ad1-ae61-3ea948aa4ae5)

## Screenshots from Map-Reduce 
When I first tried to complete the Map-Reduce tutorial, I got an error stating that it could not output Map-Reduce to internal DB local. Then I created a new database, and then it worked.
Here is the screenshot from the tutorial:

![screenshot](https://github.com/user-attachments/assets/f47f04cc-ac45-4c4f-86e9-299a06c49ffd)

### My Own Map-Reduce Operation
I decided to implement an operation that adds up how many of each item that has been ordered.
I believe this is important for business analytics. If a business knows what's selling and what's not, they can make adjustments accordingly.

![screenshot](https://github.com/user-attachments/assets/c6e61936-bc10-4d0a-9a69-446bcda7ce09)




