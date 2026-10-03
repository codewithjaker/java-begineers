# Class 35 — Anonymous Classes & Lambda Expressions

## 1. Anonymous Class কী?

**Anonymous Class** হলো এমন একটি class যার কোনো নাম নেই।

এটি সাধারণত:

- কোনো class-এর method override করতে
- কোনো interface implement করতে
- ছোট ও concise code লিখতে

ব্যবহার করা হয়।

### Basic Syntax

```java
Demo t = new Demo() {

    // data members and methods

    public void Demo_method() {
        // code
    }
};
```

---

# 2. Anonymous Class কেন ব্যবহার করব?

ধরা যাক একটি `Animal` interface আছে:

```java
@FunctionalInterface
interface Animal {
    void bark();
}
```

সাধারণভাবে আলাদা `Dog` class তৈরি করতে হবে:

```java
class Dog implements Animal {

    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }
}
```

তারপর:

```java
Dog Bruno = new Dog();
Bruno.bark();
```

Anonymous Class ব্যবহার করলে আলাদা `Dog` class তৈরি করার প্রয়োজন নেই।

```java
Animal Bruno = new Animal() {

    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }
};

Bruno.bark();
```

Output:

```text
Dog barks!
```

---

# 3. Anonymous Class তৈরির দুইটি উপায়

### 1. Class extend করে

```java
abstract class Vehicle {
    abstract void drive();
}

class Main {
    public static void main(String[] args) {

        Vehicle car = new Vehicle() {

            @Override
            void drive() {
                System.out.println("I'm driving a car.");
            }
        };

        car.drive();
    }
}
```

### 2. Interface implement করে

```java
@FunctionalInterface
interface Human {
    void walk();
}

class Main {
    public static void main(String[] args) {

        Human John = new Human() {

            @Override
            public void walk() {
                System.out.println("John walks.");
            }
        };

        John.walk();
    }
}
```

---

# 4. Lambda Expression

**Lambda Expression** Java 8-এ introduced হয়।

Lambda হলো নাম ছাড়া ছোট একটি function-like expression, যা মূলত **Functional Interface**-এর method implementation-এর জন্য ব্যবহৃত হয়।

### Syntax

```java
(parameter1, parameter2) -> {
    // code
}
```

---

## 5. Lambda Example

```java
@FunctionalInterface
interface LambdaExp {
    void meth1(int a, int b);
}
```

Lambda দিয়ে implementation:

```java
LambdaExp obj = (a, b) -> {
    System.out.println(
        "The value of a and b is : " + a + "," + b
    );
};

obj.meth1(5, 10);
```

Output:

```text
The value of a and b is : 5,10
```

---

# 6. Anonymous Class vs Lambda

### Anonymous Class

```java
DemoAno obj = new DemoAno() {

    @Override
    public void meth1(int a) {
        System.out.println("I am meth1");
    }
};
```

### Lambda

```java
DemoAno obj =
    (a) -> {
        System.out.println(
            "I am method 1 from this lambda " + a
        );
    };
```

Lambda syntax তুলনামূলকভাবে বেশি concise।

---

## Quick Revision

```text
Anonymous Class
      ↓
No class name
      ↓
Override / Implement
```

```text
Lambda Expression
      ↓
Java 8+
      ↓
Functional Interface
      ↓
Short implementation
```

### মনে রাখুন

- Anonymous Class-এর **কোনো নাম থাকে না**।
- এটি class extend অথবা interface implement করতে পারে।
- Lambda Expression Java **8 থেকে** এসেছে।
- Lambda সাধারণত **Functional Interface**-এর জন্য ব্যবহৃত হয়।
- Lambda syntax:

```java
(parameters) -> { code }
```

---

## Practice

1. `Animal` interface তৈরি করে Anonymous Class দিয়ে `bark()` implement করুন।
2. একটি abstract `Vehicle` class extend করে Anonymous Class তৈরি করুন।
3. একটি Functional Interface তৈরি করুন যেখানে `add(int a, int b)` method থাকবে।
4. একই method-এর implementation Anonymous Class দিয়ে লিখুন।
5. তারপর একই implementation Lambda Expression দিয়ে লিখুন।
6. Lambda দিয়ে দুইটি number-এর যোগ, বিয়োগ ও গুণ practice করুন।

### Next Lesson

**Class 36 — Generics in Java**