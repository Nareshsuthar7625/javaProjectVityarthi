Name : Naresh Suthar | Reg. No. : 24BAI10260

# Student Management System

A simple command-line interface (CLI) application written in Java to manage student records effectively. This project allows users to perform basic CRUD (Create, Read, Update, Delete) operations on student data.

## Features

* **Add Student**: Register a new student with their ID, Name, Age, and Course.
* **View Students**: Display a list of all registered students.
* **Search Student**: Find a specific student using their unique ID.
* **Update Student**: Modify the details (Name, Age, Course) of an existing student.
* **Delete Student**: Remove a student record from the system.

## Technologies Used

* **Language**: Java
* **Core Concepts**: OOPs (Object-Oriented Programming), Collections Framework (ArrayList)

## Project Structure

The project consists of the following files in the `studentManagement` package:

* `Main.java`: The entry point of the application. It handles user input and displays the menu.
* `Student.java`: The model class representing a student entity with fields for ID, Name, Age, and Course.
* `Studentservice.java`: The service class that contains the business logic for managing the list of students.

## How to Run

1.  **Compile the code**:
    Navigate to the root directory containing the `studentManagement` folder and run:
    ```bash
    javac studentManagement/*.java
    ```

2.  **Run the application**:
    Execute the `Main` class:
    ```bash
    java studentManagement.Main
    ```

## Usage

Once the application is running, follow the on-screen menu to manage records:

```text
--- Student Management System ---
1. Add Student
2. View Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit
Enter choice:
