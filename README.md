# simple-crm-app

## Introduction

- A minimal REST Application project performing basic CRUD functionalities.
- It serves for the purpose of investigating and studying web programming based on Java technologies and Spring framework.
- This web-app is written based on RESTful style with basic API listed in the table below.

![alt text](https://github.com/trdngy/img-pool/blob/master/simple-crud-app.png?raw=true)

## Start up

1. Set up network `simple-net` (you need to figure out by yourself)
2. Setup database by locating to `.\config` and run `docker-compose up`
3. Build docker image and run

``` bash
docker image build --build-arg JAR_FILE=build/libs/*.jar --build-arg POSTGRESQL_USERNAME=postgres --build-arg POSTGRESQL_PASSWORD=postgres --tag simple-crm-app .

docker container run --net=simple-net --publish 8080:8080 simple-crm-app
```

## APIs

| HTTP Action        | Endpoint                    | Description                                |
| -------------------| ----------------------------| -------------------------------------------|
| POST               | /api/customers              | Create a new customer                      |
| GET                | /api/customers/{customerId} | Read a specific customer based on an ID    |
| GET                | /api/customers              | Read all of customers                      |
| PUT                | /api/customers              | Update a new customer                      |
| DELETE             | /api/customers/{customerId} | Delete a particular customer based on an ID|
