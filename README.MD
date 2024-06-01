
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

- [3.1 Run Java Application with static frontend](#run-java-app)
- [3.2 Run Java Application with Node Frontend Dev Server](#run-java-and-front-dev)


### <a id="run-java-app"></a> 3.1 Run Java Application with static frontend

```bash
mvn clean install
```

After successfully compiling the project, run the application using the following command:

```bash
java -jar ./target/spring-boot-react-fullstack-template-*-SNAPSHOT.jar
```

Now frontend should be accessible by the next url: http://localhost:8080\
Backend ping endpoint should be accessible by the next call:

```bash
curl http://localhost:8080/api/ping
```

### <a id="run-java-and-front-dev"></a> 3.2 Run Java Application with Node Frontend Dev Server

Same as for [3.1](#run-java-app) plus
```bash
npm --prefix ./src/main/frontend/ run dev
```
Now frontend should be accessible by the next url: http://localhost:5173

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
