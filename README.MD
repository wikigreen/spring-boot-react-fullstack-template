
# Java Fullstack Template

This repository serves as a template for a Java application using Spring Boot. It includes a basic setup with a simple `ping` resource. You can clone this repository to use as a starting point for your own projects.

## Prerequisites

- Java 21 or higher
- Maven 3.6.0 or higher

## Getting Started

### 1. Clone the Repository

First, clone the repository to your local machine:

```bash
git clone https://github.com/wikigreen/spring-boot-react-fullstack-template
cd spring-boot-react-fullstack-template
```

```bash
mvn clean install
```

### 3. Run the Application

After successfully compiling the project, run the application using the following command:

```bash
java -jar ./target/spring-boot-react-fullstack-template-*-SNAPSHOT.jar
```

### 4. Access the Ping Endpoint

You can test the application by accessing the ping endpoint:

```
GET /ping
```

This should return a simple `pong` message. You can use a web browser or a tool like `curl` to access this endpoint:

```bash
curl http://localhost:8080/ping
```

## Technologies

### Backend

- **Framework**: Spring Boot
- **Language**: Java
- **Build Tool**: Maven

### Frontend

*To be added*

### Database

*To be added*

### Docker

*To be added*
