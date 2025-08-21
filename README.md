[README.md](https://github.com/user-attachments/files/21910743/README.md)
# CalcWithTests

A simple beginner Java project built in **Eclipse**.  
It includes a basic `Calculator` class with add, subtract, multiply, and divide methods, along with **JUnit 5 tests**.

---

## 🚀 Features
- Addition, subtraction, multiplication, division
- Division by zero throws an `IllegalArgumentException`
- Fully tested with **JUnit 5**

---

## 🛠 How to Run
1. Open the project in Eclipse
2. Run the `CalculatorTest` class with **JUnit 5**:
   - Right-click `CalculatorTest.java` → **Run As > JUnit Test**
3. All tests should pass ✅

---

## 📦 Requirements
- Java 17 or Java 21
- Eclipse IDE for Java Developers
- JUnit 5 (already included if you follow the setup)

---

## 📸 Example Output
```java
Calculator c = new Calculator();
System.out.println(c.add(3, 4)); // 7
System.out.println(c.divide(10, 2)); // 5
