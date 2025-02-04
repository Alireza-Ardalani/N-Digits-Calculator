# N-Digits Calculator 🧮  

## 🚀 Overview  
Java's built-in numeric types have limitations:  

- **`Long.MAX_VALUE`**: `9223372036854775807`  
- **`Integer.MAX_VALUE`**: `2147483647`  

But what if we need to handle **much larger numbers** beyond `Long.MAX_VALUE`?  

### **🔹 Solution: Arbitrary Precision Using Linked Lists**  
This project represents large numbers using a **doubly linked list**, enabling **n-digit number operations** with no predefined limit.  

For example, our calculator can handle:  

```sh
922337203685477580712345 + 9221020560337203685477580712345  
= 9221021482674407370955161424690  
