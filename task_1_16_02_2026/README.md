# Social Media System - User, Post, Comment

JPA project demonstrating social media relationships.

## Entities

- **User**: Social media user
- **Post**: User posts
- **Comment**: Comments on posts

## Relationships

- User → Posts (One-to-Many)
- Post → Comments (One-to-Many)
- Comment → User (Many-to-One)

## Features

- Nested relationships
- Cascade operations
- CRUD operations

## Run

```bash
mvn clean install
```
