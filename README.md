# Kanban Task Manager
This is a RESTful API for a Kanban Task Manager that allows users to create tasks, manage boards, track progress, and collaborate on projects through a visual workflow system.

## File Structure
```
/dev/kanbantaskmanager/
│-- src/main/java/com/onlinebanking/bank
│   ├── config/          # Configuration files (Thymeleaf, Logs configuration)
│   ├── controllers/     # REST controllers
│   ├── dtos/            # Data Transfer Objects (DTOs)
│   ├── entities/        # Entity classes (JPA models)
│   ├── enums/           # Enumerations
│   ├── exception/       # Custom and Global Exception Handles
│   ├── repository/      # Database repositories
│   ├── service/         # Business logic and services
│   ├── utils/           # utilities
│-- src/main/resources/
│   ├── application.yml  
│   ├── application-dev.yml  # Configuration file
│-- pom.xml                  # Maven dependencies
│-- README.md                # Documentation
```
## Environment Setup
Ensure you have the following environment set up:

- Java 21 installed
- Maven installed or an IDE like IntelliJ
- Load all dependencies before running the API
- The API runs on port **6000**
- Update the `application-dev.yml` file with your MySQL database credentials:
    - Database Name
    - MySQL password
    - MySQL should run on port **3306** (can be updated)

Note: For the application to work, a database with the same name as in the properties file needs to be created.

## Running the Application
1. Clone the repository.
2. Install dependencies using Maven:
   ```sh
   mvn clean install
   ```
3. Start the application:
   ```sh
   mvn spring-boot:run
   ```
4. The API will be available at `http://localhost:6000/`.

## License
This project is licensed under the MIT License.