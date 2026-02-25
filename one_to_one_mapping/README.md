# One-to-One Mapping - Car & Engine

JPA one-to-one relationship example.

## Entities

- **Car**: Car with brand, model, price
- **Engine**: Engine with type, fuel, mileage, cc

## Relationship

Car → Engine (One-to-One with @JoinColumn)

## Operations

- Insert car with engine
- Find car with engine details
- Delete engine (orphan removal)

## Run

```bash
mvn exec:java -Dexec.mainClass="one_to_one_mapping.User"
```
