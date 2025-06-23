💡 What is the Factory Pattern?

The Factory Design Pattern is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created. This pattern is used when the exact type of the object is not known until runtime.

## Factory Design Pattern in Java

This project demonstrates the Factory Design Pattern using a notification service (Email, SMS, Push).

### 🧠 Pattern Summary

- **Interface:** `Notification`
- **Implementations:** `EmailNotification`, `SMSNotification`, `PushNotification`
- **Factory:** `NotificationFactory` to decouple object creation
- **Client Code:** `Main.java` with input

### ✅ How to Run

1. Compile and run `Main.java`
2. Enter a notification type: `email`, `sms`, or `push`
3. Observe how the factory returns the correct implementation


