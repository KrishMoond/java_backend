# Product Management System

Interactive console-based product management with JPA.

## Features

- **Product**: Entity with id, name, quantity, price
- **ProductDao**: CRUD operations
- **ProductMain**: Interactive menu-driven console

## Menu Options

1. Insert Product
2. Delete Product
3. Update Product
4. Find Product by ID
5. Find All Products
6. Exit

## Run

```bash
mvn exec:java -Dexec.mainClass="com.prac.ProductMain"
```

## Tests

- ProductTest with JUnit
