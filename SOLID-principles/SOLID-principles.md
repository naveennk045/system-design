# **SOLID principles**

### **S – Single Responsibility Principle (SRP)**

* **Definition:** A class should have only **one reason to change**.

* **Meaning:** A class should focus on **one job or responsibility**.

* **Example:** If a class handles both *report generation* and *file saving*, changes in file format will affect report logic — a violation of SRP.

---

### **O – Open/Closed Principle (OCP)**

* **Definition:** Software entities should be **open for extension, closed for modification**.

* **Meaning:** You should be able to add new features **without modifying existing code** that already works.

* **Example:** Instead of editing an existing discount calculation class to add a “festival discount,” you create a **new class** that extends it.

---

### **L – Liskov Substitution Principle (LSP)**

* **Definition:** Subtypes must be **completely substitutable** for their base types without breaking the program’s behavior.

* **Meaning:** If `B` is a child of `A`, you should be able to use `B` anywhere `A` is expected — without surprises.

* **Example:** If `Bird` has a method `fly()`, a `Penguin` subclass should not inherit `fly()` if it can’t actually fly.

---

### **I – Interface Segregation Principle (ISP)**

* **Definition:** Clients should **not be forced** to depend on methods they don’t use.

* **Meaning:** Break large, “fat” interfaces into smaller, more specific ones.

* **Example:** Instead of a single `Machine` interface with `print()`, `scan()`, and `fax()` — make `Printer`, `Scanner`, and `Fax` interfaces separately.

---

### **D – Dependency Inversion Principle (DIP)**

* **Definition:** High-level modules should not depend on low-level modules; both should depend on abstractions.

* **Meaning:** Depend on **interfaces or abstract classes**, not concrete implementations.

* **Example:** A `PaymentService` should depend on a `PaymentProcessor` interface, not a `StripeProcessor` directly. This makes it easy to swap payment providers.

## 
