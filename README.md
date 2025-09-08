## Blog Platform with Spring Boot

This project is a comprehensive backend API for a blog platform, featuring robust content management capabilities. The API handles all core functionalities for content management, allowing for seamless integration with any frontend application.

-----

## Features

  * **Comprehensive Content Management**: Implements full **CRUD** (Create, Read, Update, Delete) functionality for posts, categories, and tags.
  * **Post States**: Supports both **draft** and **published** states for posts, with drafts accessible only to authenticated users.
  * **Filtering**: Allows clients to filter posts by categories or tags.
  * **Security**: Uses **Spring Security** to handle **JWT authentication**.

-----

## Technologies Used

  * **Java & Spring Boot**: The core framework for the backend API.
  * **Spring Security**: Used for implementing robust authentication and authorization.
  * **Project Lombok**: A library to reduce boilerplate code.
  * **MapStruct**: Used for object mapping.
  * **PostgreSQL**: The relational database for data persistence.
  * **Docker**: Simplifies the database setup and ensures a consistent development environment.

-----

### Prerequisites

  * **Java Development Kit (JDK) 21** or later
  * **Docker**
  * An **IDE** (IntelliJ, Eclipse, or Visual Studio Code)

### Running the Application

1.  **Clone the Repository**:

    ```
    git clone <repository_url>
    cd <repository_folder>
    ```

2.  **Configure Database**:
    Use Docker to start the PostgreSQL database container.

    ```
    docker-compose up
    ```

3.  **Run the Application**:
    You can build and run the application using Maven.

    ```
    ./mvnw clean install
    ```

-----

## API Endpoints

The application provides the following key endpoints for content management:

### Posts

| HTTP Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/api/posts` | Retrieves all posts. Supports filtering by categories and tags. |
| `GET` | `/api/posts/{id}` | Retrieves a single post by its ID. |
| `POST` | `/api/posts` | Creates a new post. |
| `PUT` | `/api/posts/{id}` | Updates an existing post by its ID. |
| `DELETE` | `/api/posts/{id}` | Deletes a post by its ID. |

### Categories

| HTTP Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/api/categories` | Retrieves all categories. |
| `GET` | `/api/categories/{id}` | Retrieves a single category by its ID. |
| `POST` | `/api/categories` | Creates a new category. |
| `PUT` | `/api/categories/{id}` | Updates an existing category by its ID. |
| `DELETE` | `/api/categories/{id}` | Deletes a category by its ID. |

### Tags

| HTTP Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/api/tags` | Retrieves all tags. |
| `GET` | `/api/tags/{id}` | Retrieves a single tag by its ID. |
| `POST` | `/api/tags` | Creates a new tag. |
| `PUT` | `/api/tags/{id}` | Updates an existing tag by its ID. |
| `DELETE` | `/api/tags/{id}` | Deletes a tag by its ID. |

### Comments

| HTTP Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/api/posts/{postId}/comments` | Retrieves all comments for a specific post. |
| `GET` | `/api/posts/{postId}/comments/{commentId}` | Retrieves a single comment by its ID from a specific post. |
| `POST` | `/api/posts/{postId}/comments` | Creates a new comment for a post. |
| `PUT` | `/api/posts/{postId}/comments/{commentId}` | Updates a comment for a post. |
| `DELETE` | `/api/posts/{postId}/comments/{commentId}` | Deletes a comment from a post. |

### Authentication

| HTTP Method | Endpoint | Description |
| :--- | :--- | :--- |
| `POST` | `/api/auth/login` | Authenticates a user and issues a JWT token. |

-----

## Next Steps and Future Improvements

The areas for further improvement:

  * **Security**: Enhance authentication with **refresh tokens** and add **CSRF protection**.
  * **User Experience**: Improve front-end **validation** and provide more comprehensive **error messages**.
  * **Performance**: Write comprehensive **unit tests** and optimize **database queries** for better performance.
