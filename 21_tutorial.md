# Java Tutorial — Class 21: Packages & Access Modifiers

## 1. Package কী?

**Package** হলো related classes ও interfaces-কে একসাথে group করার ব্যবস্থা।

### Package-এর সুবিধা
- Related classes সংগঠিত রাখা যায়।
- **Name conflict** এড়ানো যায়।
- Code reuse ও management সহজ হয়।
- অন্য package-এর classes ব্যবহার করা যায়।

### Package-এর ধরন

1. **Built-in Packages** — Java API-এর package  
   যেমন: `java.util`, `java.lang`

2. **User-defined Packages** — Programmer নিজে তৈরি করে।

---

## 2. Package ব্যবহার

Package-এর class ব্যবহার করতে `import` keyword ব্যবহার করা হয়।

```java
import java.util.Scanner;
```

এরপর:

```java
Scanner sc = new Scanner(System.in);
```

Wildcard ব্যবহার:

```java
import java.util.*;
```

অথবা import না করে সম্পূর্ণ নাম ব্যবহার করা যায়:

```java
java.util.Scanner sc =
        new java.util.Scanner(System.in);
```

---

## 3. Custom Package তৈরি

Source file-এ package declaration:

```java
package com.company;
```

Command line থেকে package structure তৈরি করতে:

```bash
javac -d . FileName.java
```

এতে package অনুযায়ী folder structure তৈরি হবে।

Nested package-ও তৈরি করা যায়:

```text
folder
 └── folderL1
      └── folderL2
```

---

# 4. Access Modifiers

**Access Modifier** নির্ধারণ করে কোন class, variable বা method কোথা থেকে access করা যাবে।

Java-তে প্রধান ৪টি access level:

- `public`
- `protected`
- `default`
- `private`

| Modifier | Same Class | Same Package | Subclass (Outside Package) | Outside Package |
|---|---|---|---|---|
| `public` | ✅ | ✅ | ✅ | ✅ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `default` | ✅ | ✅ | ❌ | ❌ |
| `private` | ✅ | ❌ | ❌ | ❌ |

---

## 5. Access Modifier Example

```java
class C1 {
    public int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 78;

    public void meth1() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
```

একই class-এর ভিতরে সবগুলো access করা যায়।

```java
C1 c = new C1();

System.out.println(c.x); // public
System.out.println(c.y); // protected
System.out.println(c.z); // default
// System.out.println(c.a); // private → Error
```

### মনে রাখবে

- `public` → সব জায়গা থেকে access
- `protected` → same package + outside package subclass
- `default` → শুধু same package
- `private` → শুধু same class

---

# 6. Practice Set — Package & Access Modifiers

### Q1
তিনটি class তৈরি করো:

- `Calculator`
- `ScCalculator`
- `HybridCalculator`

এগুলোকে একটি package-এর মধ্যে রাখো।

### Q2
একটি built-in package ব্যবহার করে user-এর কাছ থেকে input নিয়ে একটি message display করো।

### Q3
নিচের মতো nested package structure তৈরি করো:

```text
folder
 └── folderL1
      └── folderL2
```

### Q4
প্রমাণ করো যে:
- অন্য package-এর subclass থেকে `default` property access করা যায় না।
- কিন্তু `protected` property access করা যায়।

---

# 7. Exercise 5 — Custom Package

একটি custom package তৈরি করতে হবে:

```text
com.codewithharry.shape
```

এর মধ্যে আলাদা classes থাকবে:

- `Rectangle`
- `Square`
- `Circle`
- `Cylinder`
- `Sphere`

### Requirements

- Inheritance ব্যবহার করতে হবে।
- প্রয়োজনীয় `volume()` method রাখতে হবে।
- `surfaceArea()` method রাখতে হবে।
- Dimensions-এর জন্য getters/setters ব্যবহার করতে হবে।
- Common properties থাকলে inheritance ব্যবহার করে code duplication কমাতে হবে।

### সম্ভাব্য Structure

```text
com
 └── codewithharry
      └── shape
           ├── Rectangle.java
           ├── Square.java
           ├── Circle.java
           ├── Cylinder.java
           └── Sphere.java
```

---

## Quick Revision

```text
Package
 ├── Built-in Package
 └── User-defined Package

Access Modifiers
 ├── public
 ├── protected
 ├── default
 └── private
```

**Next Lesson:**  
**Class 22 — Multithreading Fundamentals**