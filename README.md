# Blog Platform API

This project is a comprehensive backend API for a blog platform, featuring robust content management capabilities. The API handles all core functionalities for content management, allowing for seamless integration with any frontend application.

## Features

* **Content Organization:** A category system for organizing posts and a flexible tagging system that supports multiple tags per post.

* **Post Management:** Functionality for creating posts, with support for both `draft` and `published` states.

* **Filtering:** Allows clients to filter blog posts by both categories and tags.

* **Post Deletion:** An implemented endpoint and service layer support for deleting posts.

## Technologies Used

* **Java & Spring Boot:** Used for building the backend API.

* **Maven:** For project dependency management and build automation.

* **PostgreSQL:** An open-source relational database for data persistence.

* **Docker:** To simplify database setup and ensure a consistent development environment.

## Getting Started

Follow these steps to set up the backend application on your local machine.

### Prerequisites

Before you begin, make sure you have the following installed:

* Java Development Kit (JDK)

* Docker

### 1. Clone the repository

Start by cloning the project repository to your local machine.

```

git clone \<repository\_url\>
cd \<repository\_folder\>

```

### 2. Configure the database

The project uses a `docker-compose.yml` file to set up the PostgreSQL database. Run the following command in the terminal to start the database container:

```

docker-compose up

```

### 3. Run the Application

You can build and run the backend using the Maven wrapper or your preferred IDE.

* **Using the Maven Wrapper:** Run `./mvnw clean install` in your terminal to build the project. Then you can run the application.

* **Using an IDE:** Import the project into your IDE by selecting the `pom.xml` file. Locate the main application class and run it directly.

Once the backend is running, it will be accessible at `http://localhost:8080`.

## Next Steps and Future Improvements

This project provides a solid foundation for a blog platform. Here are some areas that could be improved upon in the future:

* **Security:** Enhance the authentication system with refresh tokens and add CSRF protection to prevent cross-site request forgery attacks.

* **User Experience:** Improve the user experience with better error messages and more comprehensive validation.

* **Performance:** Add comprehensive tests, optimize database queries for better performance, and refine existing features.
