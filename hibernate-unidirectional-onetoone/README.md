# Hibernate Unidirectional One-to-One Mapping

JPA/Hibernate unidirectional one-to-one relationships with multiple associations.

## Entities

- **Student**: Main entity with name, email, branch
- **AadharCard**: Identity document with number, address, issue date
- **HostelRoom**: Room details with number, block, floor

## Relationships

- Student → AadharCard (One-to-One)
- Student → HostelRoom (One-to-One)
- Unidirectional: Only Student knows about AadharCard and HostelRoom

## Features

- Auto-generated primary keys with IDENTITY strategy
- Cascade operations from Student entity
- Fetch student with associated entities
- Delete student without affecting AadharCard/HostelRoom

## Run

```bash
mvn clean install
mvn exec:java -Dexec.mainClass="entity.App"
```

## Key Concepts

- @OneToOne annotation
- @GeneratedValue with IDENTITY strategy
- Unidirectional relationship mapping
- Entity persistence and retrieval
