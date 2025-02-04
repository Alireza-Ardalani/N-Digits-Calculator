# N-Digits Calculator 🧮  

## 🚀 Overview  
Java's built-in numeric types have limitations:  

- **`Long.MAX_VALUE`**: `9223372036854775807`  
- **`Integer.MAX_VALUE`**: `2147483647`  

But what if we need to handle **much larger numbers** beyond `Long.MAX_VALUE`?  

### **🔹 Solution: Arbitrary Precision Using Linked Lists**  
This project represents large numbers using a **doubly linked list**, enabling **n-digit number operations** with no predefined limit.  

For example, our calculator can handle:  

922337203685477580712345 + 9221020560337203685477580712345  
= 9221021482674407370955161424690


## 📌 Features
✔️ Supports addition (+), subtraction (-), multiplication (*), division (/), and modulus (%) \
✔️ Handles arbitrarily large numbers \
✔️ No reliance on Java’s BigInteger—custom data structure implementation \
✔️ Command-line usage for quick calculations \

## 🛠️ Usage

java -jar N-Digits-Calculator-all-1.0-SNAPSHOT.jar 30 + 40 \

java -jar N-Digits-Calculator-all-1.0-SNAPSHOT.jar 30 - 40 \

java -jar N-Digits-Calculator-all-1.0-SNAPSHOT.jar 30 * 40 \

java -jar N-Digits-Calculator-all-1.0-SNAPSHOT.jar 40 / 30 \

java -jar N-Digits-Calculator-all-1.0-SNAPSHOT.jar 40 % 30 \

## 📖 Background
This project originally started in 2015 as part of my Bachelor’s Data Structures course. \
I encourage computer science students to implement similar projects as a great hands-on data structure exercise.
