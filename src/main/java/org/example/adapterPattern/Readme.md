## Adapter Design Pattern – Java

### ✅ Intent:
Convert the interface of a class into another that clients expect.
Use an adapter when:
- You want to use an existing class
- But its interface is incompatible with your system

### 🧱 Structure:
- `Target`: MediaPlayer
- `Adaptee`: AdvancedMediaPlayer
- `Adapter`: MediaAdapter
- `Client`: AudioPlayer

### ✅ Benefits:
- Helps integrate old code (legacy system) with new system
- No need to change existing code

### 💡 Real-World Use:
- Power adapters
- Java’s `InputStreamReader` (adapts byte stream to char stream)
- Spring Security `UserDetailsAdapter`

### ⚠️ Tradeoffs:
- Adds extra layer
- Needs mapping logic

### 🧪 Sample:
```java
AudioPlayer player = new AudioPlayer();
player.play("mp4", "video.mp4"); // Adapter in action
