# API Development and Data Transformation

## Objective

The objective of this assignment is to develop APIs for managing software purchase data throughout the year. The provided dataset can be used directly or imported into a database of your choice. This README file provides instructions for setting up the code environment on a local setup.

## Dataset

The dataset for this project is included with the assignment. You can use the dataset directly or follow the instructions below to import it into a database:

1. Create a new database in your preferred database management system (e.g., MySQL, PostgreSQL).
2. Import the dataset into the database using tools like MySQL Workbench or command-line tools.
3. Update the database connection properties in the `application.properties` file to match your database configuration.

## Setup Instructions

To set up the project on your local machine, follow these steps:

1. Clone the repository from GitHub:

2. Import the project into your favorite IDE (e.g., IntelliJ, Eclipse).

3. Configure the database connection in the `application.properties` file located in the `src/main/resources` directory. Update the necessary properties such as the database URL, username, and password.

4. If you imported the dataset into a database, make sure the database connection properties in `application.properties` match your configuration.

5. Build the project using your IDE or by running the following command in the project directory:

6. Run the application using your IDE or by executing the following command:
  
7. The APIs should now be accessible at `http://localhost:10101/api/purchases`.

## API Documentation

Please import the provided Postman collection to view and test the available APIs. The collection includes requests for various use cases, allowing you to interact with the API endpoints and verify their functionality.


