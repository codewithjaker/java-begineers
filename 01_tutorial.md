# Java Tutorial — Class 01
## Introduction to Java + JDK & IntelliJ IDEA Installation

---

## 1. Java কী?

**Java** একটি জনপ্রিয় Programming Language। এটি বিভিন্ন Technology Field-এ ব্যবহৃত হয়, যেমন:

- App Development
- Web Development
- Client-Server Applications
- Software Development
- Enterprise Applications

Java একটি **Object-Oriented Programming Language (OOP)**, যা **Sun Microsystems, USA** ১৯৯১ সালে তৈরি করে।

### Java-এর ইতিহাস

- Java-এর প্রথম নাম ছিল **Oak**।
- **James Gosling** Java-এর অন্যতম প্রধান উদ্ভাবক।
- পরবর্তীতে Oak-এর নাম পরিবর্তন করে **Java** রাখা হয়।

> **Java → Object-Oriented Programming Language**

---

# 2. How Java Works?

Java program সরাসরি Machine Code-এ যায় না। Java-এর execution সাধারণত দুই ধাপে বোঝা যায়:

```text
Java Source Code
       ↓
    Compiler
       ↓
    Bytecode
       ↓
      JVM
       ↓
   Machine Code
       ↓
    Program Run
```

### Step 1 — Source Code

আমরা যে Java code লিখি সেটি হলো **Source Code**।

### Step 2 — Bytecode

Java Compiler Source Code-কে **Bytecode**-এ compile করে।

### Step 3 — JVM

**JVM (Java Virtual Machine)** Bytecode execute করে এবং প্রয়োজন অনুযায়ী Machine Code-এর সঙ্গে কাজ করায়।

এই architecture-এর কারণে Java-এর একটি গুরুত্বপূর্ণ বৈশিষ্ট্য হলো:

> **Write Once, Run Anywhere**

---

# 3. Java-এর গুরুত্বপূর্ণ Terms

## JDK — Java Development Kit

**JDK** হলো Java program তৈরি, compile এবং run করার জন্য প্রয়োজনীয় development tools-এর collection।

```text
JDK = Java Development Kit
```

JDK-এর মধ্যে Java development-এর প্রয়োজনীয় বিভিন্ন tools থাকে।

## JRE — Java Runtime Environment

**JRE** Java program run বা execute করার জন্য প্রয়োজনীয় environment প্রদান করে।

```text
JRE = Java Runtime Environment
```

## JVM — Java Virtual Machine

**JVM** Java Bytecode execute করে।

```text
JVM = Java Virtual Machine
```

সহজভাবে:

```text
JDK → Java Program Develop করার জন্য
JRE → Java Program Run করার জন্য
JVM → Java Bytecode Execute করার জন্য
```

---

# 4. Java Installation

Java শেখার জন্য প্রথমে আমাদের **JDK** এবং একটি **IDE** install করতে হবে।

আমরা এখানে **IntelliJ IDEA** ব্যবহার করব।

---

## Step 1 — Downloading JDK

প্রথমে আপনার Operating System অনুযায়ী **JDK** download করতে হবে।

### করণীয়

1. Java-এর official JDK download page-এ যান।
2. আপনার Operating System নির্বাচন করুন।
3. Windows হলে প্রয়োজনীয় executable file download করুন।
4. Download সম্পন্ন হওয়া পর্যন্ত অপেক্ষা করুন।

> **Practice:** নিজের Operating System অনুযায়ী সঠিক JDK version নির্বাচন করুন।

---

# 5. Step 2 — Installing JDK

JDK download করার পর:

1. Download করা executable file-এ Right Click করুন।
2. Fileটি Open করুন।
3. Installation process শুরু হবে।
4. প্রয়োজন অনুযায়ী **Next** চাপুন।
5. Default settings ব্যবহার করে JDK install করুন।
6. Installation সম্পন্ন করুন।

### গুরুত্বপূর্ণ

JDK installation সম্পন্ন হওয়ার পর Java programming environment প্রস্তুত হবে।

---

# 6. Step 3 — Downloading IntelliJ IDEA

Java code লেখার জন্য আমরা একটি **IDE (Integrated Development Environment)** ব্যবহার করব।

### IDE কী?

**IDE** হলো এমন একটি software environment যেখানে আমরা:

- Code লিখতে পারি
- Code Run করতে পারি
- Error/Debug করতে পারি
- Project তৈরি ও পরিচালনা করতে পারি

Java-এর জন্য **IntelliJ IDEA** একটি জনপ্রিয় IDE।

### IntelliJ IDEA Download

1. IntelliJ IDEA-এর official website-এ যান।
2. Download section-এ যান।
3. **Community Edition** download করুন।
4. Download সম্পন্ন করুন।

> **Community Edition** Java শেখা ও সাধারণ development-এর জন্য ব্যবহার করা যায়।

---

# 7. Step 4 — Installing IntelliJ IDEA

IntelliJ IDEA download করার পর:

1. Download করা `.exe` file Open করুন।
2. Installation process শুরু হবে।
3. **Next** চাপুন।
4. Default installation location ব্যবহার করতে পারেন।
5. প্রয়োজনীয় options নির্বাচন করুন।
6. বিশেষভাবে **Add launchers dir to the PATH** option থাকলে সেটি প্রয়োজন অনুযায়ী enable করুন।
7. **Next** চাপুন।
8. **Install** চাপুন।
9. Installation সম্পন্ন হওয়া পর্যন্ত অপেক্ষা করুন।

---

# 8. প্রথম Java Program

JDK এবং IntelliJ IDEA install করার পর আমরা আমাদের প্রথম Java program লিখব।

## Hello World Program

```java
package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

Programটি Run করলে Output হবে:

```text
Hello World
```

---

# 9. Basic Structure of a Java Program

উপরের program-টিকে কয়েকটি অংশে ভাগ করে বোঝা যাক।

## 9.1 `package com.company`

```java
package com.company;
```

**Package** ব্যবহার করে related classes-গুলোকে একটি group-এর মধ্যে রাখা যায়।

এখানে:

```text
package → Keyword
com.company → Package Name
```

---

## 9.2 `public class Main`

```java
public class Main {
```

Java program সাধারণত **Class**-এর মধ্যে লেখা হয়।

এখানে:

```text
public → Access Modifier
class → Class তৈরির Keyword
Main → Class Name
```

আমাদের Class-এর নাম হলো:

```text
Main
```

### গুরুত্বপূর্ণ

যদি public class থাকে, সাধারণত Java source file-এর নাম সেই class-এর নামের সঙ্গে মিলিয়ে রাখা হয়।

উদাহরণ:

```text
Main.java
```

---

# 10. `main()` Method

```java
public static void main(String[] args) {
    
}
```

এটি Java program-এর গুরুত্বপূর্ণ **main() method**।

সাধারণ Java application-এর execution `main()` method থেকে শুরু হয়।

### অংশগুলো

```text
public
static
void
main
String[] args
```

এগুলো Java-এর গুরুত্বপূর্ণ syntax, যা ধীরে ধীরে বিস্তারিতভাবে শেখা হবে।

---

# 11. `System.out.println()`

```java
System.out.println("Hello World");
```

এই statement ব্যবহার করে screen-এ output দেখানো হয়।

উদাহরণ:

```java
System.out.println("Hello World");
System.out.println("Welcome to Java");
```

Output:

```text
Hello World
Welcome to Java
```

Quotation marks-এর মধ্যে থাকা text output হিসেবে প্রদর্শিত হয়।

---

# 12. Java Naming Conventions

Java programming-এ Class, Method এবং Variable-এর নাম লেখার ক্ষেত্রে নির্দিষ্ট naming convention অনুসরণ করা হয়।

## 12.1 PascalCase — Class-এর জন্য

Class-এর নাম লেখার সময় সাধারণত **PascalCase** ব্যবহার করা হয়।

অর্থাৎ প্রতিটি word-এর প্রথম letter Capital হবে।

### Examples

```text
Main
MyScanner
MyEmployee
CodeWithHarry
StudentDetails
```

### Example

```java
public class StudentDetails {
}
```

---

## 12.2 camelCase — Methods ও Variables-এর জন্য

Methods এবং Variables-এর ক্ষেত্রে সাধারণত **camelCase** ব্যবহার করা হয়।

প্রথম word-এর প্রথম letter ছোট হাতের হবে এবং পরবর্তী word-এর প্রথম letter Capital হবে।

### Examples

```text
myScanner
myMarks
studentName
totalMarks
calculateResult
```

### Example

```java
String studentName;
int totalMarks;

void calculateResult() {
}
```

---

# 13. Quick Revision

### Java কী?

Java একটি জনপ্রিয় **Object-Oriented Programming Language**।

### Java কে তৈরি করেন?

Java-এর অন্যতম প্রধান উদ্ভাবক হলেন **James Gosling**।

### Java-এর প্রথম নাম কী ছিল?

**Oak**

### JDK কী?

**Java Development Kit** — Java program develop করার জন্য প্রয়োজনীয় tools-এর collection।

### JRE কী?

**Java Runtime Environment** — Java program run করার environment।

### JVM কী?

**Java Virtual Machine** — Java Bytecode execute করে।

### Java Source Code কীভাবে কাজ করে?

```text
Source Code
    ↓
Compiler
    ↓
Bytecode
    ↓
JVM
    ↓
Machine Code / Execution
```

### Java code কোথায় লেখা যায়?

একটি **IDE** ব্যবহার করে Java code সহজে লেখা, run এবং debug করা যায়।

এই course-এ আমরা:

```text
IntelliJ IDEA
```

ব্যবহার করব।

---

# 14. Practice Task

### Task 1
IntelliJ IDEA-তে একটি নতুন Java Project তৈরি করুন।

### Task 2
একটি `Main` class তৈরি করুন।

### Task 3
নিচের output দেখানোর জন্য Java program লিখুন:

```text
Hello World
Welcome to Java Programming
I am learning Java
```

### Task 4
নিজের নাম এবং জেলার নাম output হিসেবে দেখান।

Expected Output:

```text
My Name is: Your Name
My District is: Your District
```

### Task 5
নিচের naming convention অনুযায়ী ৫টি Class এবং ৫টি Variable-এর নাম লিখুন।

---

# Next Lesson

## Class 02 — Basic Structure of Java Program

পরবর্তী Lesson-এ আমরা বিস্তারিতভাবে শিখব:

- Java Class
- `main()` Method
- `System.out.println()`
- Package
- Java Program-এর execution structure
- Java Naming Conventions
- প্রথম Java program নিজে লেখা ও Run করা