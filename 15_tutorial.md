# Java Tutorial — Class 15
## Inheritance, `this`, `super`, Method Overriding & Dynamic Method Dispatch

## 1. Inheritance কী?

**Inheritance** হলো একটি class-এর properties ও methods অন্য একটি class-এর দ্বারা ব্যবহার করার ব্যবস্থা।

এতে **Code Reusability** বাড়ে।

```text id="4f8m2c"
Parent Class
     ↓
Child Class
```

### Terminology

- **Parent Class / Superclass** → যে class থেকে inherit করা হয়
- **Child Class / Subclass** → যে class inherit করে

---

## 2. `extends` Keyword

Inheritance করার জন্য `extends` ব্যবহার করা হয়।

### Syntax

```java id="1axv6g"
class Child extends Parent {
    // code
}
```

### Example

```java id="nq4a9x"
class Animal {

    public void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {

    public void bark() {
        System.out.println("Barking...");
    }
}
```

এখন `Dog` class, `Animal`-এর `eat()` method ব্যবহার করতে পারবে।

> Java class-এর ক্ষেত্রে **multiple inheritance** সরাসরি support করে না।

---

# 3. Constructors in Inheritance

Child class-এর object তৈরি হলে প্রথমে **Parent class-এর constructor**, তারপর Child class-এর constructor execute হয়।

```text id="w2s8pp"
Parent Constructor
       ↓
Child Constructor
```

আর যদি inheritance chain থাকে:

```text id="0a3jfz"
Parent
  ↓
Child
  ↓
Grandchild
```

তাহলে constructor এই order-এ execute হবে।

---

# 4. `super` Keyword

`super` immediate parent class-এর সাথে কাজ করার জন্য ব্যবহৃত হয়।

### Parent Constructor Call

```java id="x0eytd"
class Parent {

    Parent(int x) {
        System.out.println(x);
    }
}

class Child extends Parent {

    Child(int x) {
        super(x);
    }
}
```

`super(x)` parent class-এর parameterized constructor call করে।

### `super` ব্যবহার

- Parent constructor call করতে
- Parent class-এর variable access করতে
- Parent class-এর method call করতে

---

# 5. `this` Keyword

`this` বর্তমান object-কে reference করে।

বিশেষ করে class variable এবং parameter-এর নাম একই হলে `this` খুব গুরুত্বপূর্ণ।

### ভুল

```java id="s88pwo"
class Employee {

    int id;

    Employee(int id) {
        id = id;
    }
}
```

এখানে দুইটি `id`-ই parameter হিসেবে ধরা হচ্ছে।

### সঠিক

```java id="0un9zq"
class Employee {

    int id;

    Employee(int id) {
        this.id = id;
    }
}
```

এখানে:

```text id="s6h6f6"
this.id → class variable
id      → parameter
```

---

# 6. Method Overriding

Child class যদি parent class-এর একই method নিজের মতো করে আবার implement করে, তাকে **Method Overriding** বলে।

### Example

```java id="j1qz0j"
class A {

    public void meth1() {
        System.out.println("Method of A");
    }
}

class B extends A {

    @Override
    public void meth1() {
        System.out.println("Method of B");
    }
}
```

Call:

```java id="v1w2n5"
A a = new A();
a.meth1();

B b = new B();
b.meth1();
```

Output:

```text id="j4f6h3"
Method of A
Method of B
```

### গুরুত্বপূর্ণ

`@Override` annotation ব্যবহার করলে compiler বুঝতে পারে যে methodটি parent method override করছে।

---

# 7. Dynamic Method Dispatch

**Dynamic Method Dispatch** হলো runtime-এ overridden method নির্ধারণ করা।

এটি **Runtime Polymorphism** নামেও পরিচিত।

### Upcasting

Parent class-এর reference দিয়ে child class-এর object তৈরি করা যায়।

```java id="m8h4bj"
Animal a = new Dog();
```

### Example

```java id="xj2j0r"
class Phone {

    public void on() {
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone {

    @Override
    public void on() {
        System.out.println("Turning on SmartPhone...");
    }
}
```

এখন:

```java id="v7t7q2"
Phone obj = new SmartPhone();

obj.on();
```

Output:

```text id="v8mx4e"
Turning on SmartPhone...
```

কারণ object হলো `SmartPhone`, তাই runtime-এ `SmartPhone`-এর overridden `on()` method call হয়েছে।

### গুরুত্বপূর্ণ

```java id="m3d2k4"
Phone obj = new SmartPhone();   // Valid
SmartPhone obj = new Phone();   // Invalid
```

Parent reference দিয়ে child object রাখা যায়, কিন্তু child reference দিয়ে parent object রাখা যায় না।

---

# Quick Revision

```text id="q5a9k2"
Inheritance          → Parent থেকে properties/methods নেওয়া
extends              → Inheritance করার keyword
Parent/Superclass    → Base class
Child/Subclass       → Derived class
this                 → Current object reference
super                → Immediate parent reference
Overriding           → Parent method-এর নতুন implementation
Upcasting            → Parent reference + Child object
Dynamic Dispatch     → Runtime-এ overridden method নির্বাচন
Runtime Polymorphism → Dynamic Method Dispatch
```

## Practice Tasks

1. `Animal` class তৈরি করে `Dog` class inherit করুন।
2. Parent ও Child class-এ constructor তৈরি করে execution order দেখুন।
3. `this` ব্যবহার করে একই নামের parameter ও class variable handle করুন।
4. Parent class-এর একটি method Child class-এ override করুন।
5. `Phone` ও `SmartPhone` দিয়ে Dynamic Method Dispatch implement করুন।
6. `super()` ব্যবহার করে Parent class-এর constructor call করুন।

## Next Lesson

### Class 16 — Inheritance Practice & OOP Project
- Inheritance Practice
- Method Overriding Practice
- `super` & `this`
- OOP-based Project