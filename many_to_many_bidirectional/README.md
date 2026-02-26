# Many-to-Many Bidirectional Mapping

JPA bidirectional many-to-many relationship between Students and Subjects.

## Entities

- **Student**: Student enrolled in multiple subjects
- **Subject**: Subject with multiple students

## Relationship

Student ↔ Subjects (Bidirectional Many-to-Many)

## Features

- @ManyToMany annotation
- @JoinTable for join table configuration
- mappedBy for inverse side
- Bidirectional navigation

## Run

```bash
mvn exec:java -Dexec.mainClass="many_to_many_bidirectional.Main"
```
