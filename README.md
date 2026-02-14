# Java Backend Projects

A collection of Java projects demonstrating JDBC, JPA/Hibernate, database operations, and unit testing.

## Projects Overview

### 1. Basics_Of_JDBC
Basic Java utilities and JUnit testing examples.

### 2. learnjdbc
JDBC fundamentals with PostgreSQL - database connection and CRUD operations.

### 3. hibrenate_basic
JPA/Hibernate basics - entity management, persist, find, merge, and remove operations.

### 4. Assignment_1
Student management system with DAO pattern, email validation, and custom queries.

### 5. product_test_JPA
Product management system with interactive console menu and full CRUD operations.

### 6. one_to_one_mapping
JPA one-to-one relationship between Car and Engine entities.

### 7. person_JPA
JPQL query examples - SELECT with parameters and UPDATE operations.

### 8. mockito
Unit testing with Mockito framework - mocking dependencies and isolated testing.

### 9. hibernate-unidirectional-onetoone
Unidirectional one-to-one mappings - Student with AadharCard and HostelRoom.

### 10. mockito_assignment
Advanced Mockito testing - price service with discount calculations and exception handling.

**See individual project folders for detailed README files.**

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
