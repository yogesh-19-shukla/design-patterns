## Singleton Design Pattern – Java (Thread-safe Lazy Initialization)

### ✅ Intent:
Ensure only one instance of a class is created and provide global access to it.

### 📦 Example:
Logger service that is used app-wide.

### ✅ Key Features:
- Private constructor
- Static instance variable
- Public static method (`getInstance()`)
- Double-checked locking for thread safety

### 🧪 Output:
Same instance is reused for every log

### 🔒 Real-World Use Cases:
- Configuration managers
- Logging service
- Thread pools
- Global application state (not ideal for testing, so use with care)

### ⚠️ Alternatives:
- Enum Singleton (Best in Java for serialization safety)
- Eager Initialization (simpler but creates instance even if unused)
