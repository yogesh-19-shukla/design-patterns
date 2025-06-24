## Decorator Design Pattern – Java

### ✅ Intent:
Add new behavior to existing objects dynamically without modifying their class.

### 🧱 Structure:
- `Coffee` – Component interface
- `SimpleCoffee` – Concrete component
- `CoffeeDecorator` – Base decorator
- `MilkDecorator`, `SugarDecorator`, etc. – Concrete decorators

### 🔍 Use Cases:
- UI elements (borders, scrollbars)
- Text formatting (bold, italics, etc.)
- Pricing systems (add-ons, discounts)

### ✅ Benefits:
- Open/Closed Principle – add features without modifying classes
- Combines behaviors at runtime
- Reusable, composable decorators

### ⚠️ Tradeoffs:
- More classes
- Debugging stack of decorators can be tricky

### 📦 Example:
```java
Coffee c = new WhippedCreamDecorator(
               new MilkDecorator(
                   new SimpleCoffee()
               ));
