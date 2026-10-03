# Class 32 — Library Management System in Java

## Project Overview

এই Project-এর লক্ষ্য হলো একটি **Library Management System** তৈরি করা, যেখানে Students বই **issue**, **return** এবং নতুন বই **add** করতে পারবে।

প্রতিটি Book-এর তথ্য থাকবে:

1. **Book Name**
2. **Book Author**
3. **Issued To**
4. **Issued On**

ধরা হবে, সব Users-এর নাম আগে থেকেই **central database**-এ registered আছে।

---

## Main Features

### 1. Add Book

Library-তে নতুন বই যোগ করা যাবে।

```text
Book Name
Book Author
```

---

### 2. Issue Book

কোনো registered Student-এর কাছে বই issue করা যাবে।

```text
Book
   ↓
Issued To → Student Name
Issued On → Issue Date
```

---

### 3. Return Book

Student বই ফেরত দিলে:

```text
Issued To → Empty
Issued On → Empty
```

এবং বইটি আবার available হবে।

---

## Suggested Class Structure

একটি `Book` class ব্যবহার করা যেতে পারে:

```java
class Book {
    String name;
    String author;
    String issuedTo;
    String issuedOn;
}
```

Library পরিচালনার জন্য:

```java
class Library {
    // books
    // addBook()
    // issueBook()
    // returnBook()
}
```

---

## Important Methods

```java
addBook()
```

নতুন বই Library-তে যোগ করবে।

```java
issueBook()
```

Available বই কোনো registered Student-এর কাছে issue করবে।

```java
returnBook()
```

Issued বই ফেরত নিয়ে আবার available করবে।

---

## Project Flow

```text
          Library Management System
                    │
        ┌───────────┼───────────┐
        ↓           ↓           ↓
     Add Book   Issue Book   Return Book
        │           │           │
        ↓           ↓           ↓
     Library    Student      Available
```

---

## Practice Task

নিজে একটি complete Library Management System তৈরি করুন যেখানে:

- কমপক্ষে ৫টি Book থাকবে।
- Book Name ও Author সংরক্ষণ করবেন।
- Student-এর নাম দিয়ে Book issue করবেন।
- Issue Date সংরক্ষণ করবেন।
- Return করার পর Book available করবেন।
- Available ও issued books আলাদাভাবে দেখানোর ব্যবস্থা করবেন।
- `ArrayList` ব্যবহার করে একাধিক Book manage করার চেষ্টা করুন।

### শেখার মূল বিষয়

এই Project-এ আগের Classes-এর অনেক concept একসাথে ব্যবহার হবে:

```text
OOP
Classes & Objects
Constructors
Methods
ArrayList
Loops
Conditional Statements
Date & Time
Encapsulation
```

### Next Lesson

**Class 33 — Java Documentation / JavaDocs**