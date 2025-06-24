## Command Design Pattern – Java

### ✅ Intent:
Encapsulate actions as objects, allowing:
- Queuing
- Logging
- Undo functionality

### 🧱 Structure:
- `Command`: Interface with `execute()` and `undo()`
- `LightOnCommand`, `LightOffCommand`: Concrete Commands
- `Light`: Receiver (real action)
- `RemoteControl`: Invoker

### 📦 Real Use Cases:
- UI buttons (Play, Stop, Undo)
- Job/task queues (e.g., RabbitMQ)
- Remote controls
- Transaction logs

### ✅ Benefits:
- Decouples invoker from receiver
- Supports undo/redo
- Flexible command sequencing

### ⚠️ Drawbacks:
- Increases number of classes

### 📦 Example:
```java
remote.setCommand(new LightOnCommand(new Light()));
remote.pressButton();
remote.pressUndo();
