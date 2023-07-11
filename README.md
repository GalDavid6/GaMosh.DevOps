# GaMosh.DevOps
GaMosh - DevOps project for HIT
The project is a Spring Boot web application that serves as a logging service. It provides three GET routes that create a new log entry each time they are hit.
The application is integrated with an H2 database to store all the logs.
The project utilizes Maven to automate the build process, making it easier to manage dependencies and streamline the development workflow.
To ensure the correct functioning of the server, the project includes automated tests written in Python. These tests make HTTP requests to the server and validate the responses, checking the status codes, response formats, and content.

# Features
- Spring Boot web application with three GET routes for log creation.
- Integration with H2 database for persistent storage of logs.
- Maven for build automation and dependency management.
- Automated tests in Python to validate server functionality.

## Installation
-Maven

## Usage
use "mvn spring-bot:run" to run the server from CMD 
URLs = 'http://localhost:9000/logs',
    'http://localhost:9000/transaction',
    'http://localhost:9000/'
H2 DB = "http://localhost:9000/h2-console/"
*inside application.properties you can set up server port, username and password.


