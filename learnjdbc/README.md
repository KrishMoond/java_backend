# Learn JDBC

JDBC fundamentals with PostgreSQL database operations.

## Classes

- **StepsToConnectDB**: Database connection and SELECT queries
- **EmployeeOp**: Complete CRUD operations

## Features

- Database connection setup
- PreparedStatement usage
- INSERT, UPDATE, DELETE operations
- ResultSet handling

## Database

```sql
CREATE DATABASE college;
CREATE TABLE student (id INT, name VARCHAR(30), dept VARCHAR(20));
CREATE TABLE employee (id INT PRIMARY KEY, name VARCHAR(30), dept VARCHAR(20), salary INT);
```

## Run

```bash
mvn exec:java -Dexec.mainClass="com.connectdatabase.EmployeeOp"
```
