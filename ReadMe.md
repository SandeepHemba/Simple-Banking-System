# Simple Banking System (SBS)

## Project Overview

The **Spring Boot Banking System (SBS)** is a comprehensive web-based banking application that simulates real-world banking operations. It includes **Admin** and **Customer** modules, allowing users to manage accounts, perform transactions, and monitor banking services in a secure environment.

The project provides a **realistic banking experience** with a modern, interactive UI and robust backend architecture.

---

## Features

### Admin Module

* Manage customers: add, edit, delete profiles
* Manage accounts and account types
* Monitor transactions
* Generate reports and summaries
* Modern **card-based UI** with pop-up details

### Customer Module

* View account details and balance
* Transfer funds securely between accounts
* View transaction history
* Update personal profile and credentials
* Interactive dashboard with real-time updates

### Common Features

* Secure authentication and authorization
* Email notifications via SMTP
* Automated transaction and balance updates
* Error handling and logs

---

## Technology Stack

* **Backend:** Java, Spring Boot, Spring Security, Spring Data JPA
* **Frontend:** HTML, CSS, JavaScript, Bootstrap, Thymeleaf
* **Database:** H2 (file-based) / MySQL (optional)
* **Email Service:** SMTP
* **Tools:** Maven, GitHub, IntelliJ IDEA / Eclipse

---

## System Architecture

```
[Frontend (HTML/CSS/JS)] --> [Spring Boot Backend (REST APIs)] --> [Database (H2/MySQL)]
                               |
                               --> [SMTP Email Service]
```

* **MVC Architecture** for backend structure
* **Service layer** handles business logic
* **Controller layer** manages client requests
* **Repository layer** handles database operations

---

## Modules

### Admin Module

| Feature                | Description                                       |
| ---------------------- | ------------------------------------------------- |
| Dashboard              | Overview of accounts, transactions, and analytics |
| Customer Management    | Add, update, delete customer profiles             |
| Transaction Monitoring | View all transactions, approve/reject operations  |
| Reports                | Generate account and transaction reports          |

### Customer Module

| Feature             | Description                             |
| ------------------- | --------------------------------------- |
| Account Overview    | Check balance and account details       |
| Funds Transfer      | Send money to other users securely      |
| Transaction History | View past transactions                  |
| Profile Management  | Update personal details and credentials |

---

## Database Structure

**Tables:**

* `users` – stores admin and customer details
* `accounts` – stores account numbers, types, and balances
* `transactions` – stores transaction history (debit/credit)
* `audit_logs` – optional table for tracking system changes

---

## API Endpoints

| Endpoint            | Method | Description          |
| ------------------- | ------ | -------------------- |
| `/api/customers`    | GET    | List all customers   |
| `/api/customers`    | POST   | Add a new customer   |
| `/api/accounts`     | GET    | List all accounts    |
| `/api/transactions` | POST   | Create a transaction |

> All APIs are **secured with authentication** and **role-based access control**.

---

## Screenshots

> *(Replace with your project screenshots)*

* **Admin Dashboard**
* **Customer Dashboard**
* **Transaction History Page**

---

## Installation

1. Clone the repository:

```bash
git clone https://github.com/username/sbs-project.git
```

2. Open in IntelliJ IDEA or Eclipse

3. Configure database and email settings in `application.properties`

4. Build the project:

```bash
mvn clean install
```

5. Run the Spring Boot application:

```bash
mvn spring-boot:run
```

6. Open in browser: `http://localhost:8080`

---

## Usage

* **Admin:** Log in using admin credentials to manage customers and accounts
* **Customer:** Log in to view account info and transfer funds
* **Reports:** Generate transaction and account reports via admin dashboard

---

## Future Enhancements

* Multi-currency support
* Mobile app integration
* Advanced reporting with charts and analytics
* Integration with real bank APIs
* Enhanced security and 2FA

---

## Contribution

1. Fork the repository
2. Create a new branch (`git checkout -b feature-name`)
3. Make your changes
4. Commit your changes (`git commit -m 'Add new feature'`)
5. Push to the branch (`git push origin feature-name`)
6. Open a Pull Request

---

## Author

**Sandeep Hemba**
BCA Student | Full Stack Developer
