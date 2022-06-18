# simple-crm-app

## Introduction
This project is a simple CRUD Java-based web application. It serves for the purpose of investigating and studying web programming based on Java technologies and Spring framework. This web-app is written based on RESTful style with basic API listed in the table below. Regarding database perspective, MySQL and Hibernate are adopted to persist data during executing the web-app.

![alt text](https://github.com/trdngy/img-pool/blob/master/simple-crud-app.png?raw=true)

The remaining following sections are about prerequisite, installation, and execution instruction.


## Prerequisite
- openjdk-8-jdk
- Spring framework: 5.0.9.RELEASE
- Hibernate: 5.0.9.RELEASE
- MySQL connector: 0.9.5.2
- Apache Tomcat
- Postman app for client side
## Installation

It is easy when creating a maven project and everything will be downloaded automatically based on `pom.xml`.

## Execution
- Run the project on local host
- Go to Postman to test corresponding APIs.

| HTTP Action        | Resource                    | Description  |
| -------------      |-------------                | -----|
| POST               | /api/customers              | Create a new customer |
| GET                | /api/customers/{customerId} | Read a specific customer based on an ID |
| GET                | /api/customers              | Read all of customers |
| PUT                | /api/customers              | Update a new customer |
| DELETE             | /api/customers/{customerId} | Delete a particular customer based on an ID|
