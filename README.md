# 📝 Spring Boot ToDo List Application

A secure and user-friendly ToDo List web application built using **Java**, **Spring Boot**, **Spring Security**, and **MySQL**. This app supports user registration, login, task creation, deletion, and session-based authentication.

---

## 📁 Project Structure

```
todolist/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── todo/
│   │   │           └── todolist/
│   │   │               ├── TodolistApplication.java
│   │   │
│   │   │               ├── Controller/
│   │   │               │   ├── AuthController.java
│   │   │               │   └── TaskController.java
│   │   │
│   │   │               ├── Model/
│   │   │               │   ├── Task.java
│   │   │               │   └── User.java
│   │   │
│   │   │               ├── Repository/
│   │   │               │   ├── TaskRepository.java
│   │   │               │   └── UserRepository.java
│   │   │
│   │   │               ├── Security/
│   │   │               │   ├── WebSecurityConfig.java
│   │   │               │   ├── CustomUserDetails.java
│   │   │               │   └── CustomUserDetailsService.java
│   │   │
│   │   │               └── Service/
│   │   │                   ├── TaskService.java
│   │   │                   └── UserService.java
│   │
│   │   ├── resources/
│   │   │   ├── static/
│   │   │   │   ├── css/
│   │   │   │   │   └── style.css
│   │   │   │   └── js/
│   │   │   │       └── script.js
│   │   │   │
│   │   │   ├── templates/
│   │   │   │   ├── login.html
│   │   │   │   ├── register.html
│   │   │   │   └── index.html          ✅ (Task list page)
│   │   │   │
│   │   │   └── application.properties
│   │
│   └── test/
│       └── java/
│           └── com/
│               └── todo/
│                   └── todolist/
│                       └── TodolistApplicationTests.java
├── .gitignore
├── pom.xml
└── README.md
```

---

## ✅ Features

- User registration & login
- Password encryption with BCrypt
- Task management: add/delete tasks
- Spring Security authentication
- MySQL database integration
- RESTful API endpoints for external testing

---

## 🚀 Getting Started

### 📌 Prerequisites

- Java JDK 17+
- Maven
- MySQL

### ⚙️ Database Setup

Create MySQL database:
```sql
CREATE DATABASE todolist;
```

Update your `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todolist
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### ▶️ Run the App

```bash
mvn clean install
mvn spring-boot:run
```

---

## 🌐 Web Interface

- `http://localhost:8080/register` → Create account
- `http://localhost:8080/login` → Login
- `http://localhost:8080/tasks` → Add/Delete Tasks

---

## 📬 Postman API Usage (Optional)

- **Register**
```
POST http://localhost:8080/register
Body: username, password (x-www-form-urlencoded)
```

- **Login**
```
POST http://localhost:8080/login
```

- **Add Task**
```
POST http://localhost:8080/tasks/add
Body: title, description (x-www-form-urlencoded)
```

- **Delete Task**
```
GET http://localhost:8080/tasks/delete/{id}
```

---

## 🖼️ Screenshots (optional)

Add screenshots to a `/screenshots` folder and embed them here:
```
![Register Page](screenshots/register.png)
![Task Page](screenshots/tasks.png)
```

---

## 👤 Author

**Ayush Ranjan**  
B.Tech CSE @ LPU | Java Developer | Spring Boot Enthusiast  
[GitHub](https://github.com/) | [LinkedIn](https://linkedin.com/)

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).
