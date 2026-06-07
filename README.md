# 💰 Expense Tracker (Java)

A simple console-based Expense Tracker built using **Java** and **Object-Oriented Programming (OOP)** principles. This application allows users to manage their income and expenses, search transactions, generate summaries, and store data permanently using file handling.

## 🚀 Features

* ➕ Add Income or Expense transactions
* 📋 View all saved transactions
* 🔍 Search transactions by category
* 🗑️ Delete transactions by ID
* 📊 Display total income, expenses, and current balance
* 💾 Save transactions to a local file
* 🔄 Automatically load previous transactions on startup

## 🛠️ Technologies Used

* Java
* OOP Concepts
* ArrayList
* File Handling (`BufferedReader` & `BufferedWriter`)
* Exception Handling
* Java Time API (`LocalDate`)

## 📂 Project Structure

```
ExpenseTracker/
│
├── src/
│   ├── Main.java
│   ├── Transaction.java
│   ├── ExpenseManager.java
│   ├── FileHandler.java
│   └── Utils.java
│
├── transactions.txt
├── README.md
└── .gitignore
```

## 📖 How It Works

1. Launch the application.
2. Choose an option from the menu.
3. Add income or expense details.
4. The application automatically saves the data.
5. On the next launch, all previous transactions are loaded automatically.

## 📸 Sample Menu

```
===== EXPENSE TRACKER =====

1. Add Transaction
2. View All Transactions
3. Search By Category
4. Delete Transaction
5. Show Summary
6. Exit

Enter your choice:
```

## 🧠 Concepts Practiced

* Classes and Objects
* Constructors
* Encapsulation
* Method Overriding
* Collections Framework
* CRUD Operations
* File Persistence
* Exception Handling

## 🎯 Future Improvements

* Automatic ID generation
* Update/Edit transactions
* Monthly and yearly reports
* Budget limit notifications
* CSV export
* Database integration (MySQL/SQLite)
* Spring Boot REST API version
* JavaFX GUI version

## ▶️ Running the Project

1. Clone the repository:

```bash
git clone https://github.com/your-username/expense-tracker-java.git
```

2. Open the project in IntelliJ IDEA.

3. Run `Main.java`.

## 👨‍💻 Author

Built as a Java learning project to strengthen backend development, OOP design, and file handling concepts.
