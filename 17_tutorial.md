# Java Tutorial — Class 17
## Abstract Classes & Interfaces

## 1. Abstract Class কী?

**Abstract class** এমন একটি class যাকে সরাসরি object তৈরি করে instantiate করা যায় না।

```java id="6r2j4p"
abstract class Phone {
    abstract void on();
}
```

Object তৈরি করা যাবে না:

```java id="p5t8q1"
Phone p = new Phone(); // Error
```

Child class `extends` করে abstract class ব্যবহার করতে পারে।

---

# 2. Abstract Method

যে method-এর কোনো implementation/body থাকে না তাকে **Abstract Method** বলে।

```java id="w7n4xk"
abstract void on();
```

যদি কোনো class-এ abstract method থাকে, তাহলে class-টিকেও `abstract` হতে হবে।

Child class-এ abstract method-এর implementation দিতে হয়।

```java id="q8s2mz"
abstract class Phone {

    abstract void on();
}

class SmartPhone extends Phone {

    @Override
    void on() {
        System.out.println("Turning on...");
    }
}
```

### গুরুত্বপূর্ণ

Abstract class-এর মধ্যে থাকতে পারে:

- Abstract methods
- Normal methods
- Variables
- Constructor

---

# 3. Abstract Class Example

```java id="x3f7kd"
abstract class Parent {

    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();
}

class Child extends Parent {

    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
}
```

Object:

```java id="m9c2vx"
Child c = new Child();
c.sayHello();
c.greet();
```

---

# 4. Interface কী?

**Interface** হলো abstraction অর্জনের একটি উপায়।

Interface declare করতে `interface` keyword ব্যবহার করা হয়।

```java id="7y6v2a"
interface Bicycle {

    void applyBrake(int decrement);

    void speedUp(int increment);
}
```

Interface-এর method সাধারণত implementation ছাড়া থাকে।

---

# 5. Interface Implement করা

একটি class interface ব্যবহার করলে `implements` keyword ব্যবহার করতে হয়।

```java id="5x1q8n"
class AvonCycle implements Bicycle {

    public void applyBrake(int decrement) {
        System.out.println("Applying Brake");
    }

    public void speedUp(int increment) {
        System.out.println("Applying Speed Up");
    }
}
```

Object:

```java id="n7p3f0"
AvonCycle cycle = new AvonCycle();

cycle.applyBrake(1);
cycle.speedUp(2);
```

---

# 6. Multiple Interfaces

একটি class একাধিক interface implement করতে পারে।

```java id="4d8r2p"
interface Bicycle {
    void applyBrake();
}

interface HornBicycle {
    void blowHorn();
}

class AvonCycle implements Bicycle, HornBicycle {

    public void applyBrake() {
        System.out.println("Brake");
    }

    public void blowHorn() {
        System.out.println("Horn");
    }
}
```

এভাবেই Java-তে interface ব্যবহার করে multiple inheritance-এর সুবিধা পাওয়া যায়।

---

# 7. Interface-এর গুরুত্বপূর্ণ বিষয়

```text id="q0f6k9"
interface → interface keyword
implements → Interface implement করার keyword
method    → সাধারণত public abstract
object    → Interface-এর সরাসরি object তৈরি করা যায় না
reference → Interface reference তৈরি করা যায়
```

Interface-এর fields সাধারণত:

```text id="2j5c7w"
public static final
```

অর্থাৎ এগুলো constant হিসেবে কাজ করে।

---

# 8. Abstract Class vs Interface

| Abstract Class | Interface |
|---|---|
| `abstract class` | `interface` |
| `extends` ব্যবহার | `implements` ব্যবহার |
| Abstract + normal method থাকতে পারে | Abstract method এবং অন্যান্য supported members থাকতে পারে |
| Constructor থাকতে পারে | Constructor থাকে না |
| Class members-এর বিভিন্ন access modifier থাকতে পারে | Interface members সাধারণত public contract হিসেবে ব্যবহৃত হয় |
| একাধিক class extend করা যায় না | একাধিক interface implement করা যায় |

---

# 9. Multiple Inheritance কেন সরাসরি নেই?

ধরা যাক:

```text id="3c5z8v"
Class A → method()
Class B → method()
       ↓
     Class C
```

`C` যদি `A` এবং `B` দুটোই inherit করে, তাহলে `method()` কোন class-এর implementation ব্যবহার করবে—এমন ambiguity তৈরি হতে পারে।

তাই Java class-এর ক্ষেত্রে direct multiple inheritance support করে না।

তবে:

```java id="4n8j2m"
class C implements A, B {
}
```

এর মাধ্যমে একাধিক interface implement করা যায়।

---

# Quick Revision

```text id="t8n3y5"
Abstract Class    → সরাসরি object তৈরি করা যায় না
Abstract Method   → Method body নেই
extends           → Abstract class inherit
Interface         → Abstraction-এর mechanism
implements        → Interface ব্যবহার
Multiple Interface→ একটি class একাধিক interface implement করতে পারে
Constructor       → Abstract class-এ থাকতে পারে
Interface Object  → সরাসরি তৈরি করা যায় না
```

## Practice Tasks

1. `abstract class Shape` তৈরি করুন।
2. `abstract area()` method তৈরি করুন।
3. `Circle` ও `Rectangle` class দিয়ে `Shape` extend করুন।
4. `Vehicle` interface তৈরি করুন।
5. `Car` class দিয়ে interface implement করুন।
6. একটি class-এ দুইটি interface implement করে দেখুন।
7. Abstract Class এবং Interface-এর মধ্যে পার্থক্য লিখুন।

## Next Lesson

### Class 18 — Interfaces, Default Methods & Polymorphism
- Interface Implementation
- Default Method
- Static Method in Interface
- Multiple Interfaces
- Interface-based Polymorphism