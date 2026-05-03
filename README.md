# Grade Tracker

A student grade tracking REST API built with Java and Spring Boot, with a browser-based frontend.

## Features
- Add students with name, subject, and grade
- View all students in a live table
- Delete students
- Real-time class average calculation
- H2 in-memory database

## Tech Stack
Java · Spring Boot 3.5 · Spring Data JPA · H2 Database · REST API · HTML · CSS · JavaScript

## API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/students | Get all students |
| POST | /api/students | Add a student |
| DELETE | /api/students/{id} | Delete a student |
| GET | /api/students/average | Get class average |

## Run Locally
```bash
