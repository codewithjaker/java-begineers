# Java Tutorial — Class 13
## Object-Oriented Programming (OOP) Fundamentals

## 1. OOP কী?

**Object-Oriented Programming (OOP)** হলো এমন programming approach যেখানে program-কে real-world objects ও entities-এর সাথে model করা হয়।

OOP-এর সুবিধা:

- Code reusability
- Code organization
- DRY — Don't Repeat Yourself
- বড় program সহজে manage করা যায়

---

# 2. Class ও Object

### Class

**Class** হলো object তৈরির **blueprint/template**।

```java id="6qrx8d"
class Employee {
    int id;
    String name;
}
```

### Object

**Object** হলো কোনো class-এর একটি instance।

```java id="xq5q7r"
Employee emp = new Employee();
```

সহজভাবে:

```text
Class  → Blueprint
Object → সেই Blueprint থেকে তৈরি বাস্তব instance
```

---

# 3. OOP Problem Modeling

Real-world problem থেকে:

| Real World | OOP |
|---|---|
| Noun | Class |
| Adjective | Attributes |
| Verb | Methods |

উদাহরণ:

```text
Employee
 ├── name
 ├── age
 ├── salary
 ├── getSalary()
 └── increment()
```

---

# 4. Four Pillars of OOP

Java OOP-এর চারটি গুরুত্বপূর্ণ concept:

1. **Abstraction**
2. **Polymorphism**
3. **Encapsulation**
4. **Inheritance**

### Abstraction

শুধু প্রয়োজনীয় information দেখানো এবং internal details hide করা।

উদাহরণ: Bulb-এর switch চাপলে bulb জ্বলে; ভিতরের circuit কীভাবে কাজ করছে তা জানা প্রয়োজন নেই।

### Encapsulation

Data এবং methods-কে একটি class-এর ভিতরে একসাথে রাখা।

```text
Data + Methods → Class
```

### Inheritance

একটি class অন্য class-এর properties ও behaviors গ্রহণ করতে পারে।

```text
Phone
  ↓
SmartPhone
```

- Parent class → Superclass
- Child class → Subclass

### Polymorphism

**One entity, many forms.**

একই কাজ different ways-এ করা সম্ভব।

---

# 5. Custom Class তৈরি

### Syntax

```java id="g8dx5m"
class ClassName {
    // fields
    // methods
}
```

### Example

```java id="ydtq2f"
class Employee {

    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }

    public int getSalary() {
        return salary;
    }
}
```

### Object তৈরি

```java id="6hplq5"
Employee harry = new Employee();

harry.id = 12;
harry.salary = 34;
harry.name = "CodeWithHarry";

harry.printDetails();
```

---

# 6. OOP Practice

### Employee Class

Properties:

```text
salary → int
name   → String
```

Methods:

```text
getSalary()
getName()
setName()
```

### CellPhone Class

Methods:

```text
ring()
vibrate()
callFriend()
```

### Square Class

Property:

```text
side
```

Methods:

```text
area()
perimeter()
```

Formula:

```text
Area = side × side
Perimeter = 4 × side
```

### Tommy Class

Methods:

```text
hit()
run()
fire()
```

---

# 7. Access Modifiers

Access modifier নির্ধারণ করে কোনো variable বা method কোথা থেকে access করা যাবে।

Java-তে প্রধান ৪টি:

- `private`
- default
- `protected`
- `public`

### সংক্ষেপে

| Modifier | Same Class | Same Package | Subclass | Outside Package |
|---|---|---|---|---|
| `public` | ✓ | ✓ | ✓ | ✓ |
| `protected` | ✓ | ✓ | ✓ | ✗ |
| default | ✓ | ✓ | ✗ | ✗ |
| `private` | ✓ | ✗ | ✗ | ✗ |

---

# 8. Getters & Setters

`private` data সরাসরি বাইরে থেকে access করা যায় না।

এজন্য **Getter** ও **Setter** ব্যবহার করা হয়।

- **Getter** → value return করে
- **Setter** → value set/update করে

### Example

```java id="ddm2kr"
class Employee {

    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
```

### ব্যবহার

```java id="xyp8b5"
Employee emp = new Employee();

emp.setName("CodeWithHarry");
emp.setId(234);

System.out.println(emp.getName());
System.out.println(emp.getId());
```

---

# Quick Revision

```text
OOP            → Object-oriented programming
Class          → Blueprint
Object         → Class-এর instance
Attribute      → Object-এর data/property
Method         → Object-এর behavior
Abstraction    → Essential information দেখানো
Encapsulation  → Data + Methods একসাথে রাখা
Inheritance    → Existing class থেকে properties নেওয়া
Polymorphism   → One entity, many forms
private        → শুধু নিজের class-এর ভিতরে
Getter         → Value পাওয়া
Setter         → Value সেট করা
```

## Practice Tasks

1. `Employee` class তৈরি করুন।
2. `CellPhone` class তৈরি করে `ring()` ও `vibrate()` method লিখুন।
3. `Square` class দিয়ে area ও perimeter বের করুন।
4. `Rectangle` class তৈরি করুন।
5. `Circle` class তৈরি করে area ও perimeter বের করুন।
6. `private` variables ব্যবহার করে Getter/Setter তৈরি করুন।

## Next Lesson

### Class 14 — Constructors & OOP Practice
- Constructor কী?
- Default Constructor
- Parameterized Constructor
- Constructor Overloading
- `this` keyword
- OOP Practice