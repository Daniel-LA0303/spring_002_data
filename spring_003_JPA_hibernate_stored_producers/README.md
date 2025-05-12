# JPA Asociations

## Description

Aproducer is a method or field that generates objects managed by the container. Producers are typically marked with @Produces and allow flexible object creation (eg., custom DB connections or configurable beans). While not native to Spring, similar patterns exist via @Bean in Spring configuration classes.
It includes the following key topics:

- @Procedure: Calls stored procedures in databases directly from repository methods.
- @Modifying: Marks repository methods that modify data (UPDATE/DELETE/INSERT) instead of queries.

## Quick Start

### Prerequisites

- Java 17+ (recommended for Spring Boot 3+)
- Spring Boot version: 3.2.9
- Maven (optional, since `mvnw` is included)
- IDE: IntelliJ, Eclipse, or VS Code

### Run the Application

1. Execute the application:
   - **Windows**:
     ```bash
     mvnw.cmd clean spring-boot:run
     ```
   - **Linux/macOS**:
     ```bash
     ./mvnw clean spring-boot:run
     ```
   - **Using global Maven installation**:
     ```bash
     mvn clean spring-boot:run
     ```

   - **Run with a specific profile**:
     ```bash
     mvnw spring-boot:run -Dspring-boot.run.profiles=dev
     ```

2. Access the application:
   - Default URL: `http://localhost:8080`

3. Execute tests:
   ```bash
   mvnw test
   ```

4. Dependencies used:
   - thymeleaf
   - spring-boot-starter-web
   - spring-boot-devtools
   - spring-boot-starter-actuato
   - mysql-connector-j
   - spring-boot-starter-data-jpa
