
# Java Fullstack Template

This project is a Java application utilizing Spring Boot for the backend and React for the frontend. Unlike typical projects that require a separate server to serve frontend files, this application integrates the static frontend files directly into the final JAR during the build process. This streamlined approach ensures that both the backend and frontend run seamlessly on the same host, simplifying deployment and reducing the need for additional infrastructure.

## Key Features

- Unified Build Process: With a single command `mvn clean install`, the application automatically handles the build processes for both the backend and frontend. This includes building the frontend and incorporating its static files into the final JAR.
- Simplified Deployment: No need for a separate server to host the frontend. The application serves both the backend and frontend from the same host, reducing complexity and resource requirements.
- Spring Boot and React Integration: Leverages the power and flexibility of Spring Boot for the backend and React for a dynamic, responsive frontend experience.

This integration provides an efficient, hassle-free deployment process, making it easier to manage and run the application.

## Prerequisites

- Java 21 or higher
- Apache Maven 3.6.3 or higher
- Docker 24.0.5 or higher

## Technologies

### Backend

- **Framework**: Spring Boot 3.3.0
- **Language**: Java 21
- **Build Tool**: Apache Maven 3.6.3

### Frontend

- **Library**: React 18.2.0
- **Build Tool**: Vite
- **Package Manager**: npm
- **Code Formatter**: Prettier
- **Linter**: ESLint
- **Language**: TypeScript

### Database

*To be added*

### Docker

docker-compose


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

### 2. Run the Application

- [2.1 Run Java Application with static frontend](#run-java-app)
- [2.2 Run Java Application in Docker](#run-java-and-front-dev)
- [2.3 Run Java Application with Node Frontend Dev Server](#run-docker)


### <a id="run-java-app"></a> 2.1 Run Java Application with static frontend

```bash
mvn clean install
```

After successfully compiling the project, run the application using the following command:

```bash
java -jar ./target/spring-boot-react-fullstack-template-*-SNAPSHOT.jar
```

Now frontend should be accessible by the next url: http://localhost:8080 \
Backend ping endpoint should be accessible by the next call:

```bash
curl http://localhost:8080/api/ping
```

### <a id="run-java-and-front-dev"></a> 2.2 Run Java Application in Docker

```bash
mvn clean install
```

After successfully compiling the project, run the application using the following command:
```bash
docker-compose up --build
```
Now frontend should be accessible by the next url: http://localhost:8181\
Backend ping endpoint should be accessible by the next call:

```bash
curl http://localhost:8181/api/ping
```


### <a id="run-docker"></a> 2.3 Run Frontend Dev Server

Frontend dev server requires Backend to be run. You can follow guide specified in [2.1](#run-java-app)
as well as in [2.2](#run-docker).\
Once backend is running in **Docker** run frontend dev server using the following command:
```bash
npm --prefix ./src/main/frontend/ run dev
```
If backend is running as **standalone** server use the next command:
```bash
npm --prefix ./src/main/frontend/ run dev:standalone
```
Now frontend should be accessible by the next url: http://localhost:5173
