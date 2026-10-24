# Spring Boot AOP Project

## Overview
This project demonstrates Aspect-Oriented Programming (AOP) in Spring Boot. AOP helps separate cross-cutting concerns, such as logging, performance monitoring, and exception handling, from the main business logic.

## Technologies Used
- Java 17
- Spring Boot
- Spring AOP
- Maven
- Eclipse / Spring Tools Suite

## Concepts Covered
- `@Aspect` – Defines an aspect class.
- `@Before` – Executes advice before a method runs.
- `@After` – Executes advice after a method finishes, whether normally or exceptionally.
- `@AfterReturning` – Executes advice after a method completes successfully.
- `@AfterThrowing` – Executes advice when a method throws an exception.
- `@Around` – Executes advice before and after a method and can control its execution.
- `@Pointcut` – Defines reusable expressions for selecting methods.

## Project Structure
```text
src/main/java
└── com.example.demo
    ├── AopApplication.java
    ├── service
    │   └── BusinessService.java
    └── aspect
        └── LoggingAspect.java
```

## How It Works
1. The application starts using the Spring Boot main class.
2. The service class contains the main business logic.
3. The aspect class defines advice that runs at selected method execution points.
4. Spring AOP applies the advice to matching Spring-managed beans.
5. The console displays the advice execution messages.

## Example Use Cases
- Logging method execution.
- Monitoring execution time.
- Tracking successful method calls.
- Handling and logging exceptions.
- Separating cross-cutting concerns from business logic.

## How to Run
1. Clone or download this repository.
2. Import the project into Eclipse or Spring Tools Suite as a Maven project.
3. Ensure the Spring AOP dependency is available in `pom.xml`.
4. Run the main application class as a Spring Boot application.
5. Check the Eclipse Console for the AOP execution messages.

## Maven Dependency
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-aop</artifactId>
</dependency>
```

## Learning Outcome
This project provides practical experience with Spring AOP, advice annotations, pointcuts, and separation of concerns in Java applications.
