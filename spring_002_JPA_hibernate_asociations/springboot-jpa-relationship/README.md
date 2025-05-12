# JPA Asociations

## Description

JPA and Spring Data annotations provide declarative database access through object-relational mapping. They automate entity management, relationship handling, query execution, and transaction control while eliminating boilerplate code. These annotations seamlessly integrate persistence operations with Spring's ecosystem, enabling clean data access layers with minimal configuration.
It includes the following key topics:

Core JPA Annotations
- @Entity - Marks a class as a JPA entity (maps to DB table)
- @Table - Specifies the DB table name (optional if matching class name)
- @Id - Designates the primary key field
- @GeneratedValue - Configures primary key generation strategy
- @Column - Customizes column mapping (name, nullable, length, etc.)
- @Transient - Excludes a field from persistence
- @Temporal - Maps temporal types (DATE, TIME, TIMESTAMP)
- @Enumerated - Persists enum values (STRING or ORDINAL)

Relationship Annotations
- @OneToOne - Defines a one-to-one association
- @OneToMany - Maps a one-to-many relationship
- @ManyToOne - Maps a many-to-one relationship
- @ManyToMany - Configures many-to-many with join table
- @JoinColumn - Specifies the foreign key column
- @JoinTable - Customizes the join table for many-to-many
- @MapsId - Shares primary key between associated entities



## Quick Start

### Prerequisites

- Java 17+ (recommended for Spring Boot 3+)
- Spring Boot version: 3.1.3
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
