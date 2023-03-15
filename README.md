Employers Management System

This is a web application for managing employers and their tasks, built using JavaServer Faces (JSF), Bootstrap, and MySQL database. 
The application provides CRUD (Create, Read, Update, Delete) functionality for both employers and their tasks.

Prerequisites

Java 8 or later
Apache Maven
MySQL Server
Open Liberty Server

Getting Started

1. Clone the repository to your local machine:

  git clone https://github.com/DCCXVII/employers-management-system.git

2. Import the project into your favorite IDE (Eclipse, IntelliJ, etc.) as a Maven project.


3. Set up the MySQL database by running the SQL script located in src/main/resources/db/init.sql.

4. Update the database connection information in the src/main/webapp/WEB-INF/web.xml file.

5. Start the Open Liberty Server.

6. Deploy the application to the server by running the following command from the project root directory:

mvn liberty:deploy

7. Access the application by navigating to http://localhost:9080/employers-management-system in your web browser.

Features

- View a list of all employers and their tasks.
- Add new employers and tasks.
- Edit existing employers and tasks.
- Delete employers and tasks.

Technologies Used

- JavaServer Faces (JSF)
- Bootstrap
- MySQL Database
- Open Liberty Server




