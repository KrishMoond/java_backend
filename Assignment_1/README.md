# Student Management System

JPA-based student management with DAO pattern.

## Features

- **Student**: Entity with email validation and marks constraints (0-100)
- **StudentDAO**: Complete CRUD operations
- Custom JPQL query for students with marks > 80
- Unique email constraint
- Auto-generated IDs

## Operations

- Save student
- Find by ID
- Find all students
- Update student
- Delete student
- Find students with marks above 80

## Run Tests

```bash
mvn test
```
