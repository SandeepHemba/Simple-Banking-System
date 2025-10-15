# Simple Banking System (SBS)


## Project Overview
The **Spring Boot Banking System (SBS)** is a comprehensive web-based banking application that simulates real-world banking operations. It includes **Admin** and **Customer** modules, allowing users to manage accounts, perform transactions, and utilize payment gateways in a secure environment. The Spring Boot Banking System (SBS) is a web-based application that simulates real-world banking operations, enabling customers and admins to perform secure financial activities online. The system provides account management, fund transfers, transaction history tracking, and automated email notifications. It eliminates manual banking processes, reduces errors, and ensures a secure and efficient banking experience for users.

The project is designed to provide a **realistic banking experience** with a modern, interactive UI and robust backend architecture.

---

## Features

### Admin Module
- Manage customers: add, edit, delete profiles
- Manage accounts and account types
- Monitor transactions
- Generate reports and summaries
- Modern **card-based UI** with pop-up details

### Customer Module
- View account details and balance
- Transfer funds securely
- View transaction history
- Pay via integrated wallet system
- Update personal profile and credentials
- Interactive dashboard with real-time updates
- Customizable dashboard. 

### Common Features
- Secure authentication and authorization
- Email notifications via SMTP
- Automated transaction and balance updates
- Error handling and logs

---

## Technology Stack
- **Backend:** Java, Spring Boot, Spring Security, Spring Data JPA  
- **Frontend:** HTML, CSS, JavaScript, Bootstrap, Thymeleaf  
- **Database:** H2 (file-based) / MySQL (optional)  
- **Email Service:** SMTP  
- **Tools:** Maven, GitHub, IntelliJ IDEA / Eclipse  

---

## System Architecture
[Frontend (HTML/CSS/JS)] --> [Spring Boot Backend (REST APIs)] --> [Database (H2/MySQL)]
|
--> [SMTP Email Service]

- **MVC Architecture** for backend structure  
- **Service layer** handles business logic  
- **Controller layer** manages client requests  
- **Repository layer** handles database operations  

---

## Modules

### Admin Module
| Feature               | Description |
|-----------------------|-------------|
| Dashboard             | Overview of accounts, transactions, and analytics |
| Customer Management   | Add, update, delete customer profiles |
| Transaction Monitoring| View all transactions, approve/reject operations |
| Reports               | Generate account and transaction reports |

### Customer Module
| Feature               | Description |
|-----------------------|-------------|
| Account Overview      | Check balance and account details |
| Funds Transfer        | Send money to other users securely |
| Transaction History   | View past transactions |
| Profile Management    | Update personal details and credentials |

---

## Database Structure

**Tables:**
- `users` – stores admin and customer details  
- `accounts` – stores account numbers, types, and balances  
- `transactions` – stores transaction history (debit/credit)  
- `payments` – stores Razorpay and wallet payments  
- `audit_logs` – optional table for tracking system changes  

---

## API Endpoints
| Endpoint                     | Method | Description |
|-------------------------------|--------|-------------|
| `/api/customers`             | GET    | List all customers |
| `/api/customers`             | POST   | Add a new customer |
| `/api/accounts`              | GET    | List all accounts |
| `/api/transactions`          | POST   | Create a transaction |
| `/api/wallet/pay`            | POST   | Make payment using wallet |
| `/api/payments/razorpay`     | POST   | Process payment via Razorpay |

> All APIs are **secured with authentication** and **role-based access control**.

---

## Screenshots
> *(Replace with your project screenshots)*

- **Admin Dashboard**  
- **Customer Dashboard**  
- **Transaction History Page**    

---

## Installation

1. Clone the repository:  
```bash
git clone https://github.com/username/sbs-project.git
Open in IntelliJ IDEA or Eclipse
Configure database and email settings in application.properties

Build the project:
mvn clean install
Run the Spring Boot application:
mvn spring-boot:run
Open in browser: http://localhost:8080

Usage
Admin: Log in using admin credentials to manage customers and accounts
Customer: Log in to view account info, transfer funds, and use wallet
Payments: Use Razorpay or wallet to make secure transactions
Reports: Generate transaction and account reports via admin dashboard

Future Enhancements
Multi-currency support
Mobile app integration
Advanced reporting with charts and analytics
Integration with real bank APIs
Enhanced security and 2FA
Contribution


Fork the repository
Create a new branch (git checkout -b feature-name)
Make your changes
Commit your changes (git commit -m 'Add new feature')
Push to the branch (git push origin feature-name)
Open a Pull Request

Author
Sandeep Hemba
BCA Student | Full Stack Developer
