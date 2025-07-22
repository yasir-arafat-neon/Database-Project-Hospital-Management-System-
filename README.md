Project Overview
Project Title: Healthcare Management System
Course: Introduction to Database (CSC2108)
Semester: Fall 2024-2025
Section: M
Institution: American International University-Bangladesh (AIUB)

Developed By
Group 03
- Yasir Arafat (ID: 23-55352-3)
- Tahniq Rahman Tian (ID: 23-55347-3)
Supervised By: Jubayer Ahamed

Healthcare Management System (HMS)
The Healthcare Management System (HMS) is a relational database project designed to streamline the operations of a hospital, focusing on efficient data management and practical implementation using SQL and Java. This project enables CRUD operations for patient management, doctor consultations, billing, and more-emulating a real-world hospital environment. It also emphasizes proper database design
through ER modeling, normalization (up to 3NF), and integration with Java applications via JDBC.
Core Features

- Patient & Staff Management
 * Store patient information
 * Manage doctors, nurses, and receptionists
 * Relational links for operations

- Billing System
 * Generate bills with unique IDs
 * Link bills to patients

- Database Structure
 * 9 normalized tables (up to 3NF)
 * ER modeling and clear relationships

- SQL Operations
 * SELECT, LIKE, DECODE, UPPER, SUBSTR
 * Joins (Equi, Non-equi, Outer)
 * Views creation

Technology Stack
- Database: MySQL (XAMPP/phpMyAdmin)
- Backend: Java
- Connectivity: JDBC
- Editor: VS Code 
- Server: Apache (XAMPP)

Java Integration
Developed and tested Java classes for DB connection. Used JDBC to connect MySQL with Java.
Example: Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/healthcare_management_system","root", "");

Installation & Setup
1. Install Java JDK 8+
2. Install XAMPP and start Apache & MySQL
3. Create DB in phpMyAdmin
4. Add mysql-connector-java-8.0.30.jar to project
5. Write or copy the JAVA code that I have provided
5. Compile and run
 If you want to insert the data in oracle 10g. First Install that and set the invironment. After scott installation we will use the user name “scott” and password “tiger”.

Conclusion
This project helped us gain practical experience in:
- Designing and normalizing databases
- Creating and testing SQL queries
- Java-MySQL connectivity
- Real-world healthcare application development
We simulated hospital operations and built a fully functional healthcare database system
