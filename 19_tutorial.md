# Java Tutorial — Class 19: Exercise 4 Solution — Library Management

## 1. Exercise

Java দিয়ে একটি `Library` class তৈরি করতে হবে।

### Required Methods

- `addBook()`
- `issueBook()`
- `returnBook()`
- `showAvailableBooks()`

### Main Properties

- Books রাখার জন্য `String[] books`
- মোট বইয়ের সংখ্যা রাখার জন্য `no_of_books`

---

## 2. Library Class

```java
class Library {
    String[] books;
    int no_of_books;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }

    void showAvailableBooks() {
        System.out.println("Available Books are:");

        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] != null &&
                this.books[i].equals(book)) {

                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }

        System.out.println("This book does not exist");
    }

    void returnBook(String book) {
        addBook(book);
    }
}
```

> `this.books[i] != null` check করলে `null` value-এর উপর `.equals()` call করার সমস্যা এড়ানো যায়।

---

## 3. Main Method

```java
public class Main {
    public static void main(String[] args) {

        Library centralLibrary = new Library();

        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("C++");

        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("C++");
        centralLibrary.showAvailableBooks();

        centralLibrary.returnBook("C++");
        centralLibrary.showAvailableBooks();
    }
}
```

---

## 4. Program Logic

### `addBook()`

নতুন বই array-তে যোগ করে:

```java
books[no_of_books] = book;
no_of_books++;
```

### `showAvailableBooks()`

Array-এর প্রতিটি বই check করে। `null` হলে skip করে:

```java
if (book == null) {
    continue;
}
```

### `issueBook()`

নির্দিষ্ট বই খুঁজে পেলে সেটিকে `null` করে দেওয়া হয়:

```java
this.books[i] = null;
```

### `returnBook()`

Issue করা বই আবার library-তে যোগ করে:

```java
addBook(book);
```

---

## 5. OOP Concepts Used

এই project-এ কয়েকটি গুরুত্বপূর্ণ Java concept ব্যবহার হয়েছে:

- Class
- Object
- Constructor
- Array
- Methods
- `this` keyword
- `for` loop
- `if-else`
- `continue`
- `return`
- Method calling

### Practice

নিজে চেষ্টা করো:

1. Library-তে সর্বোচ্চ 100টির পরিবর্তে dynamic book storage তৈরি করা।
2. Issued books-এর জন্য আলাদা array তৈরি করা।
3. একই বই একাধিকবার issue করা বন্ধ করা।
4. Book search করার জন্য `searchBook()` method তৈরি করা।
5. Library-তে মোট available books দেখানোর জন্য `countBooks()` method তৈরি করা।

## Next Lesson

**Class 20 — Java Compilation & Execution Model**