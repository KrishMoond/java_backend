# Hospital Management System

JPA-based hospital system with patient, doctor, and appointment management.

## Entities

- **Patient**: Patient details with medical record
- **MedicalRecord**: Blood group and allergies (One-to-One)
- **Doctor**: Doctor with specialization and appointments
- **Appointment**: Visit date, fee, linked to patient

## Relationships

- Patient ↔ MedicalRecord (One-to-One)
- Doctor → Appointments (One-to-Many)
- Appointment → Patient (Many-to-One)

## Features

- DAO pattern for data access
- Service layer for operations
- Cascade operations
- JUnit tests

## Database

```sql
CREATE DATABASE hospital;
```

## Run Tests

Right-click `HospitalTest.java` → Run As → JUnit Test
