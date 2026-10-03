# Java Tutorial — Class 20: Compilation, Interpretation & Java Execution

## 1. Compiler vs Interpreter

### Interpreter

Interpreter সাধারণত program **এক statement করে** translate ও execute করে।

**বৈশিষ্ট্য:**
1. একবারে একটি statement execute করে।
2. প্রতিবার program চালানোর সময় interpreter প্রয়োজন।
3. Error-এর আগে পর্যন্ত কিছু অংশ execute হতে পারে।
4. সাধারণত debugging সহজ।

### Compiler

Compiler পুরো program একসাথে translate করে।

**বৈশিষ্ট্য:**
1. পুরো program একসাথে compile করে।
2. Compile হওয়ার পর source code চালাতে compiler প্রতিবার প্রয়োজন হয় না।
3. Compilation error থাকলে program execute হয় না।
4. Compilation-এর কারণে execution দ্রুত হতে পারে।

---

## 2. Java কি Compiled নাকি Interpreted?

**Java হলো Hybrid Language।**

Java program প্রথমে **Compiled** হয় এবং পরে JVM-এর মাধ্যমে **Interpreted/Executed** হয়।

### Java Execution Flow

```text
Java Source Code
       ↓
     javac
       ↓
   Bytecode (.class)
       ↓
      JVM
       ↓
Machine Code
       ↓
    Output
```

### গুরুত্বপূর্ণ

Java source code সরাসরি machine code-এ compile হয় না। প্রথমে এটি **Bytecode**-এ পরিণত হয়।

```java
Hello.java
    ↓
javac
    ↓
Hello.class
```

এরপর JVM এই bytecode execute করে।

---

## 3. Java Platform Independent কেন?

Java-এর Bytecode বিভিন্ন operating system-এ JVM-এর মাধ্যমে execute করা যায়।

```text
          Java Bytecode
          /     |      \
       Windows macOS   Linux
          ↓      ↓       ↓
         JVM    JVM     JVM
```

তাই Java-এর মূল ধারণা:

> **Write Once, Run Anywhere (WORA)**

একটি Java program compile করে পাওয়া bytecode উপযুক্ত JVM থাকলে বিভিন্ন platform-এ চালানো যায়।

---

## 4. Java Program Execute করা

IntelliJ IDEA ব্যবহার করলে compilation ও execution-এর অনেক কাজ IDE নিজেই করে দেয়।

Command line থেকেও Java program compile ও run করা যায়।

### Compile

```bash
javac Hello.java
```

এতে তৈরি হবে:

```text
Hello.class
```

### Run

```bash
java Hello
```

এখানে `java` command JVM-এর মাধ্যমে compiled bytecode execute করে।

---

## 5. Quick Revision

| Compiler | Interpreter |
|---|---|
| পুরো program compile করে | সাধারণত statement/অংশ ধরে execute করে |
| Compile-এর পরে compiler প্রতিবার প্রয়োজন নেই | Execution-এর সময় প্রয়োজন |
| Compilation error থাকলে execute হয় না | Error-এর আগের অংশ execute হতে পারে |
| Java প্রথমে compiler ব্যবহার করে | JVM bytecode execute করে |

### মনে রাখবে

**Java = Compile + JVM Execution**

```text
Source Code
    ↓
Compiler (javac)
    ↓
Bytecode
    ↓
JVM
    ↓
Execution
```

## Practice

1. `javac` command দিয়ে একটি Java file compile করো।
2. তৈরি হওয়া `.class` file দেখো।
3. `java ClassName` দিয়ে program run করো।
4. Java কেন platform-independent—নিজের ভাষায় লিখো।
5. Compiler, Bytecode এবং JVM-এর সম্পর্ক একটি diagram-এ দেখাও।

## Next Lesson

**Class 21 — Packages & Access Modifiers**