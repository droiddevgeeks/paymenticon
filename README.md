# Payment Icon Service

This project is a Spring Boot application written in Kotlin that provides APIs to fetch payment-related icons. It uses the `paymenticons` library to retrieve icons for different payment modes and banks.

## Features

- **Mode Icons**: Fetch icons for specific payment modes.
- **Single Bank Icon**: Fetch an icon for a specific bank.
- **Multiple Bank Icons**: Fetch icons for multiple banks.

## Prerequisites

- Java 17 or higher
- Maven
- Kotlin
- H2 Database (in-memory)

## Project Structure

- **Controller**: `IconController` handles HTTP requests.
- **Service**: `IconService` contains the business logic for fetching icons.
- **Configuration**: Application properties and YAML files configure the Spring Boot application.

## Endpoints

### 1️⃣ Mode Icons
**GET** `/icons/mode`  
Fetch icons for a specific payment mode.

**Query Parameters**:
- `mode` (required): Payment mode (e.g., `UPI`, `CARD`).
- `size` (optional): Icon size (`sm`, `md`, `lg`). Default is `sm`.

**Example**:
```bash
curl -X GET "http://localhost:8080/icons/mode?mode=UPI&size=md"