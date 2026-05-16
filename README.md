# Spring Boot Beginner Project

A beginner-friendly REST API project built using Spring Boot and PostgreSQL.  
This project is created to practice backend development concepts such as:

- REST APIs
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Docker
- Maven
- CRUD Operations

---

# Tech Stack

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Docker
- Maven

---

# Features

- Create Software Engineer data
- Fetch all engineers
- Fetch engineer by ID
- Update engineer details
- Delete engineer
- PostgreSQL database integration
- Dockerized PostgreSQL setup

---

# Project Structure

```bash
src
 └── main
      ├── java
      │     └── com.krishna.application
      │            ├── Controller
      │            ├── Service
      │            ├── Repository
      │            └── Entity
      │
      └── resources
             └── application.properties
```

---

# API Endpoints

## Base URL

```bash
http://localhost:8080/api/v1/software-engineer
```

## Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/` | Get all engineers |
| GET | `/{id}` | Get engineer by ID |
| POST | `/` | Add engineer |
| PUT | `/{id}` | Update engineer |
| DELETE | `/{id}` | Delete engineer |

---

# PostgreSQL Setup Using Docker

## Run PostgreSQL Container

```bash
docker compose up -d
```

## PostgreSQL Port

```bash
5332
```

---

# application.properties Example

```properties
spring.datasource.url=jdbc:postgresql://localhost:5332/amigoscode
spring.datasource.username=amigoscode
spring.datasource.password=password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# How to Run the Project

## Clone Repository

```bash
git clone https://github.com/Krisshnnaa/spring-boot-Project-begineer.git
```

## Navigate to Project

```bash
cd spring-boot-Project-begineer
```

## Run Application

```bash
./mvnw spring-boot:run
```

or

```bash
mvn spring-boot:run
```

---

# Future Improvements

- Add Validation
- Add Exception Handling
- Add Swagger Documentation
- Add Authentication & Authorization
- Add Unit Testing
- Deploy Application

---

# Learning Goals

This project was built for learning and practicing:

- Spring Boot fundamentals
- REST API development
- Database integration
- Docker basics
- Backend project structure

---

# Author

Krishna Murthy N

GitHub:  
https://github.com/Krisshnnaa
