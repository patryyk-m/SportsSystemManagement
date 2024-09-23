# **SportsSystemManagement**
<img width="1820" alt="maain" src="https://github.com/user-attachments/assets/8647d621-f59d-4a4e-b22a-880f28246f24">

**Description**  
A Java-based application that models a sports facility system, including buildings, sports halls, and competitions, with validation and error handling. The program demonstrates object-oriented principles such as encapsulation, inheritance, and polymorphism to build a flexible, maintainable system. The application supports custom exceptions for validation, ensuring proper data integrity throughout the system.

## **Features**

- **Building and Sports Hall Management**: The system allows the creation of `Building` and `SportsHall` objects, each containing specific properties such as `id`, `status`, and `name`. A building's `status` is updated dynamically through the `setStatus` method, which also triggers a `projectStatus` update.
- **Competition Setup**: Competitions, represented by the `Competition` class, can be created with details such as `title`, `address`, and competition level (`LOCAL`, `NATIONAL`, `INTERNATIONAL`). Titles must meet specific criteria, or a `RunTimeException` is thrown.
- **Dynamic Object Creation**: Various objects, such as sports halls and competitions, can be instantiated and validated at runtime. Custom exceptions like `EmptyNameException` ensure proper input validation.
- **Object-Oriented Design**: The program adheres to core OOP principles:
  - **Encapsulation**: Each class manages its own state and behavior, with access controlled through public getters and setters.
  - **Inheritance**: The `Building` class is a base class for sports facilities, while `SportsHall` extends its functionality to manage specific sports halls.
  - **Polymorphism**: The system allows flexible handling of competitions and buildings through abstract methods and interfaces, providing the ability to extend the system with new features easily.

## **Running the Program**

1. Run the `Main.java` file to launch the application.
   - Create buildings and sports halls by setting their properties, such as name and status.
   - Set up competitions with a valid title, address, and competition level.
   - Handle exceptions such as empty names or invalid competition titles to ensure data integrity.

## **Checklist**

- Create and manage buildings and sports halls using the `Building` and `SportsHall` classes.
- Implement validation to ensure that sports hall names and competition titles meet specific criteria, with custom exceptions (`EmptyNameException` and `RunTimeException`) for error handling.
- Create competitions using the `Competition` class, assigning titles, addresses, and levels (`LOCAL`, `NATIONAL`, `INTERNATIONAL`).
- Use `toString()` methods to summarize object details and ensure clear representation of system states.
- Apply object-oriented principles such as encapsulation, inheritance, and polymorphism to manage system components and handle user input validation effectively.
