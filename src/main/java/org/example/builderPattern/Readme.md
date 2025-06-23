## Builder Design Pattern – Java

The Builder pattern allows step-by-step construction of complex objects with many optional parameters.

### ✅ Key Benefits:
- Avoids constructor overloading
- Promotes immutability
- Clean and readable object creation

### 📦 Structure:
- `Computer` is the product
- `Builder` is a static nested class used to set properties and build the object
- Client uses chained method calls to create different variants of the object

### 🛠 Example:
```java
Computer pc = new Computer.Builder("Intel i5", 8)
                    .setStorage(512)
                    .setWiFi(true)
                    .build();
