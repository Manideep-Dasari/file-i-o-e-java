# File I/O – CSV Processing with Exception Handling

## 🎯 Objective
- Extend file-i-o-java’s CSV reading task.
- Add **exception handling** to make the program fault-tolerant.
- Create a **custom exception** for invalid product data.
- Use `try-catch-finally` to manage errors and resources safely.

---

## 📚 Key Concepts Learned
- Exception handling in Java
- Checked vs. unchecked exceptions
- Using **try-catch-finally**
- Creating and throwing **custom exceptions**
- Handling `FileNotFoundException` and `NumberFormatException`
- Closing resources safely with `finally` / try-with-resources
- Skipping invalid rows gracefully

---

## 📂 Project Structure
```
Task_5/
│
├── src/
│   └── Task5/
│       ├── ProductFilterWithExceptions.java
│       └── InvalidProductDataException.java
│
├── products.csv
├── expensive_products.csv
└── README.md
```

---

## ✅ Sample Input (products.csv)
```bash
Name,Price
Laptop,55000
Smartphone,1200
Headphones,abc        # invalid row (non-numeric price)
Tablet,1500
Pen,50
Office Chair,3000
```

---

## 📊 Sample Output (expensive_products.csv)
```bash
Name,Price
Laptop,55000
Smartphone,1200
Tablet,1500
Office Chair,3000
```

---

## ⚠️ Console Output
```bash
Skipping row - Invalid price format in row: Headphones,abc
Expensive products have been written to expensive_products.csv
```

--- 

## 👨‍💻 Outcome
- Learned how to make code **robust** and **error-resistant**.
- Handled invalid inputs without crashing the program.
- Gained confidence in working with **custom exceptions** and multiple catch blocks.

---

## ▶️ How to Run
1. Place products.csv in the Task_5 folder (outside src/).
2. Compile and run the program:
   ```bash
   javac src/Task5/ProductFilterWithExceptions.java
         src/Task5/InvalidProductDataException.java
   java -cp src Task5.ProductFilterWithExceptions
   ```

