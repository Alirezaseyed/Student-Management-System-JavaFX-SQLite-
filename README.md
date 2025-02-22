# Student Management System (JavaFX + SQLite)

## 📌 Introduction
This is a simple **Student Management System** built using **JavaFX** for the GUI and **SQLite** for data storage. The application allows users to:
- Add new students (name & age)
- Store data persistently in an SQLite database

## 🛠 Technologies Used
- Java (JavaFX for GUI)
- SQLite (Database)

## 🚀 Setup & Installation
### 1️⃣ Prerequisites
- Java JDK (version 11 or later)
- JavaFX SDK
- SQLite JDBC Driver

### 2️⃣ Clone the Repository
```sh
git clone https://github.com/yourusername/StudentManagementJavaFX.git
cd StudentManagementJavaFX
```

### 3️⃣ Compile & Run
```sh
javac --module-path /path/to/javafx/lib --add-modules javafx.controls StudentManagement.java
java --module-path /path/to/javafx/lib --add-modules javafx.controls StudentManagement
```

🔹 **Replace `/path/to/javafx/lib` with the actual path to your JavaFX SDK**.

## 📂 Project Structure
```
StudentManagementJavaFX/
│-- src/
│   ├── StudentManagement.java
│-- students.db (SQLite database)
│-- README.md
```

## 📖 Usage
1. Run the application.
2. Enter a student's name and age.
3. Click **Add Student** to store the data.

## 📢 Contributing
Feel free to fork and contribute! Open an issue if you find any bugs. 😊

## 📜 License
This project is licensed under the MIT License.

