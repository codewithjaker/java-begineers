# Class 39 — Exercise 7 Solution: Library Management System

## Project Goal

একটি **Library Management System** তৈরি করা যেখানে:

- নতুন Book add করা যাবে
- Book issue করা যাবে
- Issued Book return করা যাবে
- Book-এর `name` ও `author` সংরক্ষণ করা হবে
- `ArrayList` ব্যবহার করে Library-এর books manage করা হবে

---

# 1. Book Class

প্রতিটি Book-এর জন্য `Book` class তৈরি করা হয়েছে।

```java
class Book {

    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
```

### এখানে ব্যবহার হয়েছে:

- Class
- Constructor
- `this`
- Method Overriding
- `toString()`

---

# 2. MyLibrary Class

Library পরিচালনার জন্য `MyLibrary` class।

```java
class MyLibrary {

    public ArrayList<Book> books;

    public MyLibrary(ArrayList<Book> books) {
        this.books = books;
    }
}
```

এখানে:

```java
ArrayList<Book>
```

মানে Library-তে শুধু `Book` object রাখা যাবে।

---

# 3. Book Add করা

```java
public void addBook(Book book) {

    System.out.println(
        "The book has been added to the library"
    );

    this.books.add(book);
}
```

### মূল ধারণা

```text
Book Object
    ↓
addBook()
    ↓
ArrayList<Book>
```

---

# 4. Book Issue করা

```java
public void issueBook(Book book, String issued_to) {

    System.out.println(
        "The book has been issued from the library to "
        + issued_to
    );

    this.books.remove(book);
}
```

Book issue হলে সেটিকে available books-এর `ArrayList` থেকে remove করা হচ্ছে।

---

# 5. Book Return করা

```java
public void returnBook(Book b) {

    System.out.println(
        "The book has been returned"
    );

    this.books.add(b);
}
```

Book return করলে আবার Library-এর `ArrayList`-এ add করা হচ্ছে।

---

# 6. Main Method

```java
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> bk = new ArrayList<>();

        Book b1 =
            new Book("Algorithms", "CLRS");
        bk.add(b1);

        Book b2 =
            new Book("Algorithms2", "CLRS2");
        bk.add(b2);

        Book b3 =
            new Book("Algorithms3", "CLRS3");
        bk.add(b3);

        Book b4 =
            new Book("Algorithms4", "CLRS4");
        bk.add(b4);

        MyLibrary l = new MyLibrary(bk);

        l.addBook(
            new Book("algo4", "myAuthor")
        );

        System.out.println(l.books);

        l.issueBook(b3, "Harry");

        System.out.println(l.books);
    }
}
```

---

# 7. Project Flow

```text
Create Book
     ↓
ArrayList<Book>
     ↓
MyLibrary
     ↓
 ┌───────────────┐
 ↓       ↓       ↓
Add    Issue   Return
 ↓       ↓       ↓
add()  remove() add()
```

---

## Quick Revision

| Component | কাজ |
|---|---|
| `Book` | Book-এর তথ্য রাখে |
| `MyLibrary` | Library পরিচালনা করে |
| `ArrayList<Book>` | Books সংরক্ষণ করে |
| `addBook()` | Book যোগ করে |
| `issueBook()` | Book issue করে |
| `returnBook()` | Book ফেরত নেয় |
| `toString()` | Book-এর তথ্য print করে |
| `this.books` | Current Library-এর books |

### এই Project-এ ব্যবহৃত Concepts

```text
OOP
Class & Object
Constructor
this
Method
Method Overriding
ArrayList
Generics
```

---

## Practice

1. `Book` class-এ `issuedTo` field যোগ করুন।
2. `issuedOn` হিসেবে Date সংরক্ষণ করুন।
3. শুধু available Book issue করার ব্যবস্থা করুন।
4. কোনো Book Library-তে না থাকলে issue না করার ব্যবস্থা করুন।
5. `showAvailableBooks()` method তৈরি করুন।
6. `showIssuedBooks()` method তৈরি করুন।
7. User-এর নাম দিয়ে Book issue করার ব্যবস্থা করুন।

### Java Course Completion

এটি এই Java course-এর **শেষ Class — Class 39**।

এখন পর্যন্ত শেখা গুরুত্বপূর্ণ বিষয়গুলো:

```text
Java Basics
Variables & Data Types
Operators
Conditionals
Loops
Arrays
Methods
OOP
Inheritance
Interfaces
Packages
Multithreading
Exception Handling
Collections
Date & Time
JavaDocs
Annotations
Anonymous Classes
Lambda Expressions
Generics
File Handling
Projects & Practice
```

**Java Course Completed — Practice & Project Based Learning**