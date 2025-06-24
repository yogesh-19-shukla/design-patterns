✅ Strategy Design Pattern – Full Java Example
🎯 Intent
Define a family of algorithms, put each of them in a separate class, and make their objects interchangeable at runtime.

📦 Real-Life Analogy
Imagine a navigation app (like Google Maps) that lets users choose:

🚗 Car
🚶 Walk
🚲 Bike

Each mode calculates the route differently, but the interface is the same: navigate().

| Component                           | Role                     |
| ----------------------------------- | ------------------------ |
| `NavigationStrategy`                | Strategy interface       |
| `CarStrategy`, `WalkStrategy`, etc. | Concrete strategies      |
| `Navigator`                         | Context using a strategy |


## Strategy Design Pattern – Java

### ✅ Intent:
Encapsulate multiple algorithms and allow switching between them at runtime.

### 💡 Structure:
- `NavigationStrategy`: Interface
- `CarStrategy`, `WalkStrategy`, `BikeStrategy`: Implementations
- `Navigator`: Context class that uses a strategy

### 🔍 Benefits:
- Open/Closed Principle: Add new strategies without modifying context
- Promotes flexibility and code reuse
- Cleaner separation of logic

### 📦 Real Use Cases:
- Payment methods (card, UPI, netbanking)
- Sorting algorithms
- Route calculation
- Compression/encryption algorithms

### 🔁 Example:
```java
navigator.setStrategy(new CarStrategy());
navigator.navigate("A", "B");

