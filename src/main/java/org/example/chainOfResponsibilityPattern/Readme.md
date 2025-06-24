## Chain of Responsibility – Java

### ✅ Intent:
Let multiple objects handle a request, forming a **processing chain**. Each handler can:
- Handle the request
- Or forward it to the next handler

### 🧱 Structure:
- `Handler`: Abstract class with `setNext()` and `handle()`
- `AuthHandler`, `RoleHandler`, `ValidationHandler`: Concrete handlers
- `Request`: Payload object

### 💡 Real-World Use Cases:
- Servlet filters (authentication, logging, etc.)
- Middleware pipelines (Express, Spring)
- Support ticket escalation

### ✅ Benefits:
- Flexible, dynamic request flow
- Open/Closed Principle
- Easy to modify chain order

### ⚠️ Drawbacks:
- Can be hard to trace flow in long chains

### 📦 Example:
```java
auth.setNext(role).setNext(validation);
auth.handle(request);
