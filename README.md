# Spring Boot User Registration

This is a simple **Spring Boot Registration Application** that demonstrates how to build a registration form and display a success message after submission.  
(Current version does not include validation logic.)



## 🚀 Features
- User Registration Form (JSP)  
- Handles form submission using Spring Boot & Spring MVC  
- Displays success message on the same page after registration
- Login and logout functionality.
- Session management to prevent unauthorized access.



## 🛠️ Tech Stack
- Java 17  
- Spring Boot  
- Spring MVC  
- JSP (Java Server Pages)  
- Maven  


## 📂 Project Structure
src/main/java
└── com.register
├── controller # Handles web requests
├── entities # Entity classes (User, etc.)
├── repositories # Database repositories
└── service # Business logic

src/main/resources
├── static # Static files (CSS, Images)
├── application.properties



## ▶️ How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/springboot-user-registration.git
   
2.Navigate to the project folder:

   cd springboot-user-registration


3.Run the project using Maven:

   mvn spring-boot:run

4.Open in browser:

   http://localhost:8080/register
