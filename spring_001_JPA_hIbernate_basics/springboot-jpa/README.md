# JPA Basic Example

## Description

JPA (Java Persistence API) is Java's standard for Object-Relational Mapping (ORM), enabling database interactions through objects and annotations (like @Entity and @Table) rather than manual SQL. JDBC serves as the underlying layer JPA uses to execute queries, offering more control but requiring verbose code. Spring Data JPA further simplifies this through repository interfaces that auto-generate queries from method names (e.g., findByName()), minimizing boilerplate.
It includes the following key topics:

- @Query: Defines custom queries (JPQL or native SQL) in repositories, ideal for complex operations.
- @Transactional: Manages transactions declaratively (auto-rollback on errors), applicable at method or class level.
- DTO


## Quick Start

### Prerequisites

- Java 17+ (recommended for Spring Boot 3+)
- Spring Boot version: 3.1.4
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
   - Default URL: `http://localhost:8080/`

3. Execute tests:
   ```bash
   mvnw test
   ```

4. Dependencies used:
   - spring-boot-starter-web
   - spring-boot-devtools
   - mysql-connector-j
   - spring-boot-starter-data-jpa
