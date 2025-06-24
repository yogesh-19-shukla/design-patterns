## Observer Design Pattern – Java

### ✅ Intent:
Create a **one-to-many dependency** between a subject and observers. When the subject updates, all observers are notified.

### 📦 Real-World Example:
- `YouTubeChannel` = Subject
- `Subscriber` = Observer

### 🧱 Structure:
- `Observer` – Interface with `update()`
- `Subject` – Interface with `subscribe()`, `unsubscribe()`, `notifySubscribers()`
- `ConcreteSubject` (YouTubeChannel)
- `ConcreteObserver` (Subscriber)

### 💡 Use Cases:
- Event systems (notification, pub-sub)
- UI listeners
- Messaging systems
- Stock market updates

### ✅ Benefits:
- Loose coupling between sender and receiver
- Easy to add/remove subscribers
- Promotes reactive design

### ⚠️ Drawbacks:
- Can be hard to debug in large systems
- Risk of memory leaks if observers aren't removed

### 🔁 Sample:
```java
channel.subscribe(new Subscriber("A"));
channel.uploadVideo("Design Pattern Series");
