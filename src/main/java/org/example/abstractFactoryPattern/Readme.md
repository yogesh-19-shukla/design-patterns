✅ Abstract Factory Design Pattern – Complete Java Example
💡 What is Abstract Factory?
It provides an interface for creating families of related objects, without specifying their concrete classes.

Use when you have multiple families of products (e.g., UI elements like Buttons and Checkboxes) and want to switch families at runtime.

📦 Example Scenario
Let’s build a UI toolkit that supports two OS families:

Windows
Mac

Each family provides its own version of:

Button
Checkbox

## Abstract Factory Pattern in Java

This project demonstrates the Abstract Factory Design Pattern using a GUI toolkit (Windows vs Mac).

### 🧠 Pattern Summary

- **Abstract Product Interfaces**: `Button`, `Checkbox`
- **Concrete Products**: `WindowsButton`, `MacButton`, etc.
- **Abstract Factory**: `GUIFactory`
- **Concrete Factories**: `WindowsFactory`, `MacFactory`
- **Client Code**: Creates platform-specific buttons and checkboxes without knowing the exact classes.

### ✅ How to Run

1. Run `Main.java`
2. Enter OS: `windows` or `mac`
3. Observe the corresponding UI components being rendered


