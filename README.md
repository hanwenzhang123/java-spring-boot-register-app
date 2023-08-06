## Course Registration App (WIP)
Please note that the app is still working in progress.

A university course registration application with the practice for design patterns, data relationship, CRUD operations, JDBC, and more built in Java-based framework Spring Boot.
The purpose of building this app is to understand better of how backend technologies work with a popular language/framework to improve my technical skills.
The frontend is built in React JS.

### To Run the Application
![how-to-run-app.png](how-to-run-app.png)
Gradle is used as the build tool for this application. Simply open your IDE(IntelliJ) and set configuration as Graddle, and click the build button on the right top corner and run the app.
The main entry point located at `./src/main/java/university/MainApplication.java`

### Testing the REST HTTP GET Endpoints
- http://localhost:8888/ - show

### View Data in H2 Console
http://localhost:8888/h2-console
- JDBC Url: jdbc:h2:~/test
- Username: sa
- Password:

### UML Diagram

### Resources
- https://start.spring.io/
- https://spring.io/guides/tutorials/react-and-spring-data-rest/
- https://www.baeldung.com/spring-boot-change-port
- https://github.com/spring-guides/tut-react-and-spring-data-rest/tree/master/basic
- https://andrew-flower.com/blog/Spring-Boot-and-React-1
- https://docs.spring.io/spring-boot/docs/1.5.16.RELEASE/reference/html/using-boot-devtools.html
- https://developer.okta.com/blog/2022/06/17/simple-crud-react-and-spring-boot