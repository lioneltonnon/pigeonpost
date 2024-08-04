# PigeonPost Messaging System

A scalable messaging system built using Spring Boot and RabbitMQ. It facilitates asynchronous communication between distributed services, offering secure and reliable message processing.

This application is built for the purposes of a take-home interview case.
### Features

- Asynchronous message processing using RabbitMQ
- Secure communication with HTTPS
- Basic authentication for access control
- Scalable architecture supporting multiple message senders and receivers
---
## Set-up
### Prerequisites

- **Docker**: Required to build and run the application in containers. You can download and install Docker from the [official website](https://www.docker.com/products/docker-desktop).
- **Git**: Optional, but required if you are cloning the project from a Git repository.

### Installation

1. Clone the repo (optional if you have already downloaded it):
   ```bash
   git clone https://github.com/username/pigeonpost.git
   ```
   
2. Navigate to the project dir
   ```bash
   cd pigeonpost
   ```

### Running the App

#### Using Docker
  Ensure Docker is correctly installed and running. Start the app with:
   ```bash
   docker-compose up 
   ```
#### Testing
Run tests with 
```bash
mvn test
```

---
