# Mockito Unit Testing Project

Unit testing demonstration using Mockito framework for mocking dependencies.

## Project Structure

```
mockito/
├── src/main/java/mockito/
│   ├── User.java          # User entity with id, name, balance
│   ├── UserDao.java       # Data access layer (mocked in tests)
│   └── UserService.java   # Business logic for user classification
└── src/test/java/mockito/
    └── UserServiceTest.java  # Unit tests with Mockito mocks
```

## Features

- **User Classification**: Categorizes users based on balance
  - New User: 0-1000
  - Regular User: 1001-2000
  - Premium User: >2000
- **Dependency Mocking**: Uses Mockito to mock UserDao
- **Isolated Testing**: Tests UserService without database

## Dependencies

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.11.4</version>
</dependency>
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-junit-jupiter</artifactId>
    <version>5.11.0</version>
</dependency>
```

## Run Tests

```bash
mvn test
```

## Key Concepts

- Mock object creation with `mock()`
- Stubbing behavior with `when().thenReturn()`
- Dependency injection for testability
- Unit testing without external dependencies
