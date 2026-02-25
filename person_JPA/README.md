# JPQL Query Examples

JPA project demonstrating JPQL queries.

## Features

- **Product**: Entity for query demonstrations
- **ProductDao**: Insert operations with transactions
- **Demo**: JPQL SELECT with parameters
- **UpdatePrice**: JPQL UPDATE queries

## JPQL Examples

```java
// SELECT with WHERE clause
"SELECT p FROM Product p WHERE p.price >= ?1"

// UPDATE query
"UPDATE Product p SET p.price = ?1 WHERE p.price = ?2"
```

## Run

```bash
mvn exec:java -Dexec.mainClass="person_JPA.Demo"
```
