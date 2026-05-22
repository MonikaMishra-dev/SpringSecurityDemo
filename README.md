# SpringSecurityDemo
Simple project for understanding Spring Security concepts, mainly Security Filter, Password Encoding, Authentication, Authorization, UserDetailService

## Features
- Signup & Login
- Role-based authorization
- Method-level security
- Global exception handling
- Clean architecture
- H2 (can switch to MySQL)

## Tech Stack
- Spring Boot
- Spring Security
- Spring Data JPA
- H2 Database

## Run
mvn spring-boot:run

## APIs
POST /auth/signup
POST /login
GET /user/profile
GET /admin/dashboard
