# Java Tutorial — Class 14
## Constructors & OOP Practice

## 1. Constructor কী?

**Constructor** হলো class-এর বিশেষ member, যা object তৈরি হওয়ার সময় object-এর initial value সেট করতে ব্যবহৃত হয়।

```java
Employee emp = new Employee();
```

Object তৈরি হলে constructor automatically call হয়।

### Constructor-এর বৈশিষ্ট্য

- Constructor-এর নাম class-এর নামের মতো হবে।
- কোনো return type থাকে না, `void`-ও নয়।
- Object তৈরি হলে automatically call হয়।
- Constructor `abstract`, `static`, `final` বা `synchronized` হতে পারে না।

---

# 2. Default Constructor

যে constructor-এর কোনো parameter নেই তাকে **Default/No-argument Constructor** বলা হয়।

```java id="wqv5ae"
class Employee {

    Employee() {
        System.out.println("Constructor Called");
    }
}
```

Object:

```java id="rxw6a4"
Employee emp = new Employee();
```

Output:

```text
Constructor Called
```

### Compiler-provided Constructor

নিজে কোনো constructor না লিখলে Java compiler প্রয়োজন অনুযায়ী একটি default constructor provide করতে পারে।

---

# 3. Parameterized Constructor

যে constructor parameter গ্রহণ করে তাকে **Parameterized Constructor** বলে।

```java id="5l2v7q"
class Employee {

    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
```

Object:

```java id="z9x4fj"
Employee emp = new Employee("Harry", 12);
```

---

# 4. Constructor Overloading

একই class-এ একাধিক constructor থাকতে পারে, যদি তাদের parameter list আলাদা হয়।

```java id="k4rv2u"
class Employee {

    Employee(String name, int id) {
        System.out.println(name + " " + id);
    }

    Employee(String name, int id, int salary) {
        System.out.println(name + " " + id + " " + salary);
    }
}
```

ব্যবহার:

```java id="q0x7wm"
Employee e1 = new Employee("Shubham", 1);
Employee e2 = new Employee("Harry", 2, 70000);
```

### মনে রাখুন

**Constructor Overloading** = Same constructor name + different parameters.

---

# 5. `this` Keyword

Constructor বা method-এর parameter এবং class variable-এর নাম একই হলে `this` ব্যবহার করা হয়।

```java id="h7h7ce"
class Employee {

    private String name;
    private int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
```

এখানে:

```text
this.name → class-এর variable
name      → constructor parameter
```

---

# 6. Guess the Number — OOP Exercise

একটি `Game` class তৈরি করুন।

### Properties

```text id="7ex0my"
noOfGuesses
randomNumber
userInput
```

### Methods

```text id="w6v4ez"
Game()                → Random number generate করবে
takeUserInput()       → User input নেবে
isCorrectNumber()     → Guess সঠিক কি না check করবে
getNoOfGuesses()
setNoOfGuesses()
```

### লক্ষ্য

Constructor ও methods ব্যবহার করে একটি **Guess the Number Game** তৈরি করা।

---

# 7. Access Modifier + Constructor Practice

## Cylinder Class

Properties:

```text id="0zpq2r"
radius
height
```

Methods:

```text id="y8l7q2"
getRadius()
setRadius()
getHeight()
setHeight()
surfaceArea()
volume()
```

### Formula

```text id="2up9py"
Surface Area = 2πr² + 2πrh

Volume = πr²h
```

### Constructor

```java id="v0lqfl"
public Cylinder(int radius, int height) {
    this.radius = radius;
    this.height = height;
}
```

---

# 8. Rectangle Class

দুটি constructor ব্যবহার করুন।

### Default Constructor

```java id="o0n1ep"
public Rectangle() {
    this.length = 4;
    this.breadth = 5;
}
```

### Parameterized Constructor

```java id="31g1wo"
public Rectangle(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
}
```

Object:

```java id="c5c1aa"
Rectangle r = new Rectangle(12, 56);
```

---

# 9. Practice Tasks

1. `Employee` class-এ salary initialize করার জন্য একটি overloaded constructor তৈরি করুন।
2. `Game` class দিয়ে Guess the Number তৈরি করুন।
3. `Cylinder` class-এ Getter/Setter ও Constructor ব্যবহার করুন।
4. Cylinder-এর `surfaceArea()` এবং `volume()` বের করুন।
5. `Rectangle` class-এ default ও parameterized constructor তৈরি করুন।
6. `Sphere` class তৈরি করে radius-এর মাধ্যমে প্রয়োজনীয় calculation করুন।

---

## Quick Revision

```text id="p3cxpl"
Constructor            → Object initialize করে
Default Constructor    → No parameter
Parameterized          → Parameter গ্রহণ করে
Constructor Overloading→ Same name, different parameters
this                   → Current object reference
Getter                 → Value return করে
Setter                 → Value set/update করে
```

## Next Lesson

### Class 15 — Inheritance in Java
- Inheritance কী?
- Parent & Child Class
- `extends` keyword
- `super` keyword
- Method Overriding
- Dynamic Method Dispatch