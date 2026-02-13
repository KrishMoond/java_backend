# Java Backend Projects

A collection of Java projects demonstrating JDBC, JPA/Hibernate, and database operations with PostgreSQL.

## Projects Overview

### 1. Basics_Of_JDBC
Basic Java utilities and testing examples.
- **Calculator.java**: Math operations (add, divide, string reverse)
- **Employee.java**: Employee entity model
- **User.java**: Demo class for Calculator

### 2. learnjdbc
JDBC fundamentals with PostgreSQL.
- **StepsToConnectDB.java**: Database connection and SELECT queries
- **EmployeeOp.java**: CRUD operations (Create, Read, Update, Delete)

### 3. hibrenate_basic
JPA/Hibernate basics with entity management.
- **Student.java**: Student entity with percentage and DOB
- **Employee.java**: Employee entity with salary
- **Demo.java**: Insert student records
- **Demofetch.java**: Fetch and delete operations
- **DemoFind.java**: Find and update operations

### 4. Assignment_1
Student management system with DAO pattern.
- **Student.java**: Entity with email validation and marks constraints
- **StudentDAO.java**: Complete CRUD operations with custom queries
- **CreateTableDriver.java**: Auto-create database tables

### 5. product_test_JPA
Product management system with console interface.
- **Product.java**: Product entity (id, name, quantity, price)
- **ProductDao.java**: DAO with CRUD operations
- **ProductMain.java**: Interactive menu-driven application

### 6. one_to_one_mapping
JPA one-to-one relationship example.
- **Car.java**: Car entity with engine relationship
- **Engine.java**: Engine entity
- **User.java**: Operations for car-engine management

### 7. person_JPA
JPA query examples with JPQL.
- **Product.java**: Product entity
- **ProductDao.java**: Insert operations with transaction handling
- **Demo.java**: JPQL SELECT queries with parameters
- **UpdatePrice.java**: JPQL UPDATE queries

## Prerequisites

- Java 8 or higher
- Maven 3.6+
- PostgreSQL 12+
- IDE (Eclipse/IntelliJ IDEA)

## Database Setup

1. Install PostgreSQL
2. Create database:
```sql
CREATE DATABASE college;
```
3. Update credentials in `persistence.xml` or JDBC connection strings

## Configuration

Each JPA project contains `src/main/resources/META-INF/persistence.xml`:
```xml
<persistence-unit name="postgres">
    <properties>
        <property name="javax.persistence.jdbc.url" value="jdbc:postgresql://localhost:5432/college"/>
        <property name="javax.persistence.jdbc.user" value="postgres"/>
        <property name="javax.persistence.jdbc.password" value="root"/>
    </properties>
</persistence-unit>
```

## Build & Run

```bash
# Navigate to project directory
cd project_name

# Clean and build
mvn clean install

# Run main class
mvn exec:java -Dexec.mainClass="com.package.MainClass"
```

## Known Issues & Improvements Needed

### Critical
- **Resource Leaks**: Database connections and EntityManagerFactory not properly closed
- **Hardcoded Credentials**: Database passwords in source code
- **Method Bug**: `Employee.java` (hibrenate_basic) has incorrect setter method name

### Security
- Credentials should be externalized to environment variables or config files
- No input validation in several places
- SQL injection risk mitigated by PreparedStatement usage

### Code Quality
- Missing null checks in several methods
- No exception handling in some CRUD operations
- Scanner resources not closed in ProductMain
- Inefficient string concatenation in Calculator.rev()

### Best Practices
- Use try-with-resources for auto-closing connections
- Implement proper logging instead of System.out.println
- Add unit tests for all DAO methods
- Use connection pooling for production
- Implement proper validation and error messages

## Dependencies

Main dependencies across projects:
- JUnit Jupiter 5.11.4 (testing)
- Hibernate/JPA implementation
- PostgreSQL JDBC Driver

## License

Educational/Learning purposes

## Author

Created for Java backend learning and practice
