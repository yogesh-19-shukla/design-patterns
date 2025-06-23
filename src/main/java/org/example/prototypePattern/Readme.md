## Prototype Design Pattern – Java

### ✅ Intent:
Create new objects by copying (cloning) existing ones, instead of creating them from scratch.

### 🧬 Core Idea:
- Define a base class (`Shape`) that implements `Cloneable`
- Override `clone()` to allow deep or shallow copying
- Concrete classes (`Circle`, `Rectangle`) use this to replicate themselves

### 🔍 Use Cases:
- Expensive object creation (e.g., database, network)
- Game engines (clone enemies, objects)
- UI/Component builders
- Prototypes for customization templates

### 🚀 Sample:
```java
Shape c1 = new Circle("Red", 10);
Shape c2 = c1.clone();
c2.setColor("Green");
