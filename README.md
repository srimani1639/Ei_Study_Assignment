# Design Pattern Examples and Virtual Classroom Manager
## 1. Design Pattern Examples
This project demonstrates six different software design patterns with real-world use cases. It covers Behavioral, Creational, and Structural design patterns, each implemented with clear, practical examples. These examples provide a deeper understanding of how to apply design patterns to real-world problems, promoting better software design and adherence to the SOLID principles.

Patterns Implemented:
1. Behavioral Design Patterns:
Observer Pattern: A stock price notification system where multiple investors are notified of stock price changes.
Strategy Pattern: A payment processing system where users can choose different payment methods (e.g., Credit Card, PayPal).
2. Creational Design Patterns:
Singleton Pattern: A database connection manager that ensures only one connection instance exists.
Factory Pattern: A vehicle factory that creates objects of either a car or a bike based on user input.
3. Structural Design Patterns:
Adapter Pattern: A video player system that adapts different formats (MP4, VLC) to a common interface.
Facade Pattern: A home automation system where users can control lights and air conditioners via a simplified interface.
Each example is implemented with modular classes, adhering to object-oriented principles.

## 2. Virtual Classroom Manager
This is a console-based backend application designed for managing virtual classrooms, students, and assignments for an EdTech platform. The program follows a clean architecture approach and emphasizes code quality with a focus on object-oriented design, SOLID principles, and the Singleton and Factory patterns.

### Key Features:
Classroom Management: Add, list, and manage virtual classrooms.
Student Management: Enroll students in classrooms and list all students per classroom.
Assignment Management: Schedule assignments for classrooms and allow students to submit them.
### Console Commands:
Add Classroom: add_classroom [ClassName]
Add Student: add_student [StudentID] [ClassName]
Schedule Assignment: schedule_assignment [ClassName] [AssignmentDetails]
Submit Assignment: submit_assignment [StudentID] [ClassName] [AssignmentDetails]
The Virtual Classroom Manager is built with scalability in mind, making it easy to extend for future features like grading, attendance tracking, and real-time notifications.
