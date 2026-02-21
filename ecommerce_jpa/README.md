# E-Commerce JPA System

Complete e-commerce system with JPA/Hibernate demonstrating multiple relationship types.

## Entities

- **User**: Customer with profile and orders
- **Profile**: User contact details (One-to-One)
- **PurchaseOrder**: Order with date and amount
- **Payment**: Payment linked to order (Many-to-One)

## Relationships

- User ↔ Profile (One-to-One)
- User → Orders (One-to-Many)
- Payment → Order (Many-to-One)

## Features

- DAO pattern with interfaces
- Service layer for business logic
- JPAUtil for EntityManager management
- CRUD operations for all entities
- JPQL queries for order retrieval

## Run

```bash
mvn clean install
```

## Database Setup

```sql
CREATE DATABASE ecommerce;
```
