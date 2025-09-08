# Task-Tracking Backend API

This project is a robust backend API for a task-tracking application, developed using Java and the Spring Boot framework. The API handles all core functionalities, including task creation, management, and data persistence with a PostgreSQL database.

This repository focuses exclusively on the backend. The corresponding React frontend is available separately.

## Features

* **Comprehensive REST API:** Full implementation of all necessary API endpoints for a task-tracking application.

* **Database Integration:** Utilizes a PostgreSQL database for reliable data storage.

* **Error Handling:** Robust error handling mechanisms to ensure a stable and reliable application.

* **Transactional Support:** Implements database transactions to maintain data integrity.

## Technologies Used

* **Java:** The primary programming language for the application.

* **Spring Boot:** A powerful framework for building production-grade, stand-alone, and Spring-based applications.

* **Maven:** A build automation tool used for project management and dependency management.

* **PostgreSQL:** An open-source relational database used for data storage.

* **Docker:** Used to containerize the database for easy setup and development environment consistency.

## Prerequisites

Before running the application, ensure you have the following installed:

* Java (JDK)

* Docker


## Getting Started

Follow these steps to get the backend API up and running on your local machine.

### 1. Clone the repository
```
git clone <repository_url>
cd <repository_folder>
```
### 2. Configure the database

With the `docker-compose.yml` file already set up, simply run the following command to start the PostgreSQL database in a Docker container:
```
docker-compose up
```
### 3. Running the Application

You can run the Spring Boot application using one of the following methods:

#### a) Using an IDE

Most modern Java IDEs have excellent support for Spring Boot and Maven projects.

1. **Import the Project:** Open your preferred IDE (e.g., IntelliJ IDEA, VS Code, Eclipse) and select the option to "Import Project" or "Open" an existing project.

2. **Select the `pom.xml`:** Navigate to the project's root directory and select the `pom.xml` file. The IDE will automatically recognize it as a Maven project and configure all dependencies.

3. **Run the Main Class:** Locate the main application class (usually named `Application.java` or similar) and run it. Most IDEs provide a convenient "Run" button or context menu option for this.

#### b) Using the Maven Wrapper

The project includes a Maven wrapper (`./mvnw`), so you don't need to have Maven installed globally. Navigate to the project's root directory and run the following command to build the project:
```
./mvnw clean install
```
Once the application is running, you can interact with and test the various API endpoints using a REST client like Postman or Insomnia. The API is accessible at `http://localhost:8080`.

## API Endpoints

The following endpoints are available for interacting with the task-tracking application.

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| GET | `/task-lists` | List all task lists |
| POST | `/task-lists` | Create a new task list |
| GET | `/task-lists/{task_list_id}` | Get a task list by its ID |
| PUT | `/task-lists/{task_list_id}` | Update a task list |
| DELETE | `/task-lists/{task_list_id}` | Delete a task list |
| GET | `/task-lists/{task_list_id}/tasks` | List all tasks within a specific task list |
| POST | `/task-lists/{task_list_id}/tasks` | Create a new task within a specific task list |
| GET | `/task-lists/{task_list_id}/tasks/{task_id}` | Get a specific task by ID |
| PUT | `/task-lists/{task_list_id}/tasks/{task_id}` | Update a specific task |
| DELETE | `/task-lists/{task_list_id}/tasks/{task_id}` | Delete a specific task |
