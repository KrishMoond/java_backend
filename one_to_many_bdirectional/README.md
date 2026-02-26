# One-to-Many Bidirectional Mapping

JPA bidirectional one-to-many relationship between College and Students.

## Entities

- **College**: College with multiple students
- **Student**: Student belonging to a college

## Relationship

College ↔ Students (Bidirectional One-to-Many/Many-to-One)

## Features

- @OneToMany with mappedBy
- @ManyToOne with @JoinColumn
- Bidirectional navigation
- Cascade operations

## Run

```bash
mvn exec:java -Dexec.mainClass="Driver.InsertDriver"
```
