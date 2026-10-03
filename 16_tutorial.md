# Java Tutorial — Class 16
## OOP Projects & Inheritance Practice

এই Class-এ `Class`, `Object`, `Constructor`, `Getter/Setter`, `Inheritance` এবং `Method` ব্যবহার করে ছোট Project ও Practice করা হবে।

---

# 1. Guess the Number — OOP Project

একটি `Game` class তৈরি করতে হবে।

### Properties

```text id="7f1v4q"
number
inputNumber
noOfGuesses
```

### Methods

```text id="l9zq5x"
Game()              → Random number generate
takeUserInput()     → User input নেয়
isCorrectNumber()   → Guess check করে
getNoOfGuesses()    → Guess count return করে
setNoOfGuesses()    → Guess count set করে
```

### Constructor

```java id="6b0o7c"
Game() {
    Random rand = new Random();
    this.number = rand.nextInt(100);
}
```

### Guess Check

```java id="i7h8qp"
boolean isCorrectNumber() {

    noOfGuesses++;

    if (inputNumber == number) {
        System.out.println("Correct!");
        return true;
    }
    else if (inputNumber < number) {
        System.out.println("Too low...");
    }
    else {
        System.out.println("Too high...");
    }

    return false;
}
```

### Main Logic

```java id="1h3c3q"
Game g = new Game();

boolean correct = false;

while (!correct) {
    g.takeUserInput();
    correct = g.isCorrectNumber();
}
```

### শেখার বিষয়

```text id="4g0w5q"
Class
Object
Constructor
Random
Scanner
Getter / Setter
while loop
Method
```

---

# 2. Online Library Project

একটি `Library` class তৈরি করতে হবে।

### Methods

```text id="0x3q1e"
addBook()
issueBook()
returnBook()
showAvailableBooks()
```

### Properties

```text id="9z5k7m"
Available Books
Issued Books
```

### কাজ

- নতুন Book add করা
- Available Book issue করা
- Issued Book return করা
- Available Books দেখানো

### Basic Structure

```java id="e2g9i1"
class Library {

    String[] availableBooks;
    String[] issuedBooks;

    void addBook() {
        // Add book
    }

    void issueBook() {
        // Issue book
    }

    void returnBook() {
        // Return book
    }

    void showAvailableBooks() {
        // Display books
    }
}
```

---

# 3. Inheritance Practice

## Circle → Cylinder

একটি `Circle` class তৈরি করে `Cylinder` class inherit করুন।

```java id="2x3h6s"
class Circle {

    int radius;

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle {

    int height;

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
```

এখানে `Cylinder` class, `Circle` থেকে `radius` ও `area()` ব্যবহার করতে পারে।

---

# 4. Constructor with Inheritance

```java id="4i9s7k"
class Circle {

    int radius;

    Circle(int radius) {
        this.radius = radius;
        System.out.println("Circle Constructor");
    }
}

class Cylinder extends Circle {

    int height;

    Cylinder(int radius, int height) {

        super(radius);

        this.height = height;

        System.out.println("Cylinder Constructor");
    }
}
```

Object:

```java id="8q4q6r"
Cylinder obj = new Cylinder(12, 4);
```

### Constructor Execution Order

```text id="3x3m5h"
Circle Constructor
        ↓
Cylinder Constructor
```

কারণ Child constructor-এর আগে Parent constructor execute হয়।

---

# 5. Rectangle → Cuboid

Practice হিসেবে:

```text id="y5e7k0"
Rectangle
    ↓
Cuboid
```

### Rectangle

Properties:

```text id="k8f1wq"
length
breadth
```

Methods:

```text id="0f7p5a"
area()
```

### Cuboid

Additional property:

```text id="4m2x8z"
height
```

Methods:

```text id="6c9n1r"
volume()
```

Getter/Setter ব্যবহার করুন।

---

# 6. Constructor Order Practice

Inheritance hierarchy:

```text id="q6x0t7"
Base
  ↓
Derived1
  ↓
Derived2
```

যদি লিখি:

```java id="5o2q9k"
Derived2 obj = new Derived2();
```

তাহলে constructor execution order হবে:

```text id="e5n7k3"
Base
  ↓
Derived1
  ↓
Derived2
```

অর্থাৎ **Parent → Child** order-এ constructor execute হয়।

---

# Quick Revision

```text id="b2h8x1"
Guess Game      → Class + Object + Constructor
Library         → OOP Project
Circle          → Parent Class
Cylinder        → Child Class
super()         → Parent Constructor
Inheritance     → Code Reusability
Getter/Setter   → Encapsulation
Constructor     → Object Initialization
```

## Practice Tasks

1. Guess the Number game সম্পূর্ণ করুন।
2. `Library` class তৈরি করে Book add/issue/return করুন।
3. `Circle → Cylinder` inheritance implement করুন।
4. `Rectangle → Cuboid` inheritance implement করুন।
5. Constructor execution order পরীক্ষা করুন।
6. Getter/Setter দিয়ে private properties ব্যবহার করুন।

## Next Lesson

### Class 17 — Abstract Classes & Interfaces
- Abstract Class
- Abstract Method
- Interfaces
- `implements` keyword
- Abstraction in Java