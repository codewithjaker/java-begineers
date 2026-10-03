# Java Tutorial — Class 09
## Loops in Java

### 1. Loop কী?

**Loop** ব্যবহার করে একই ধরনের statement/block বারবার execute করা যায়।

উদাহরণ:
- 1 থেকে 1000 পর্যন্ত সংখ্যা print করা
- 7-এর multiplication table তৈরি করা
- নির্দিষ্ট সংখ্যক কাজ বারবার করা

### Types of Loops

Java-তে প্রধানত ৩ ধরনের Loop আছে:

1. `while` loop
2. `do-while` loop
3. `for` loop

---

## 2. While Loop

Condition `true` থাকা পর্যন্ত code বারবার execute হয়।

### Syntax

```java
while (condition) {
    // statements
}
```

### Example

```java
int i = 10;

while (i > 0) {
    System.out.println(i);
    i--;
}
```

### 100 থেকে 200 Print

```java
int i = 100;

while (i <= 200) {
    System.out.println(i);
    i++;
}
```

> Condition কখনো `false` না হলে **Infinite Loop** তৈরি হয়।

```java
while (true) {
    System.out.println("Infinite Loop");
}
```

### Practice

100 থেকে 200 পর্যন্ত Natural Numbers print করুন।

---

## 3. Do-While Loop

`do-while` loop-এর বিশেষ বৈশিষ্ট্য হলো—**condition false হলেও loop অন্তত একবার execute হবে।**

### Syntax

```java
do {
    // code
} while (condition);
```

### Example

```java
int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 10);
```

### গুরুত্বপূর্ণ পার্থক্য

| while | do-while |
|---|---|
| আগে condition check করে | আগে code execute করে |
| condition false হলে একবারও execute নাও হতে পারে | অন্তত একবার execute হবেই |

### Example

```java
int b = 10;

do {
    System.out.println(b);
    b++;
} while (b < 5);
```

এখানে condition শুরুতেই `false`, তবুও `10` একবার print হবে।

### Practice

`do-while` ব্যবহার করে প্রথম `n`টি Natural Number print করুন।

---

## 4. For Loop

যখন কতবার loop চলবে তা জানা থাকে, তখন সাধারণত `for` loop ব্যবহার করা হয়।

### Syntax

```java
for (initialize; condition; update) {
    // code
}
```

### Example

```java
for (int i = 7; i != 0; i--) {
    System.out.println(i);
}
```

### For Loop-এর ৩টি অংশ

- **Initialize** → শুরুতে variable-এর value সেট করে
- **Condition** → condition `true` হলে loop চলে
- **Update** → variable-এর value পরিবর্তন করে

### Example: Reverse Numbers

```java
for (int i = 5; i != 0; i--) {
    System.out.println(i);
}
```

### Odd Numbers

```java
for (int i = 0; i < 5; i++) {
    System.out.println(2 * i + 1);
}
```

### Practice

1. প্রথম `n`টি Odd Number print করুন।
2. প্রথম `n`টি Natural Number reverse order-এ print করুন।

---

# 5. Break Statement

`break` ব্যবহার করলে loop **সম্পূর্ণভাবে বন্ধ** হয়ে যায়।

### Syntax

```java
break;
```

### Example

```java
for (int i = 10; i > 0; i--) {

    if (i == 7) {
        break;
    }

    System.out.println(i);
}
```

**Output:**

```text
10
9
8
```

---

# 6. Continue Statement

`continue` বর্তমান iteration-এর বাকি অংশ **skip** করে পরবর্তী iteration-এ চলে যায়।

### Syntax

```java
continue;
```

### Example

```java
for (int i = 7; i > 0; i--) {

    if (i == 3) {
        continue;
    }

    System.out.println(i);
}
```

**Output:**

```text
7
6
5
4
2
1
```

### মনে রাখুন

- `break` → পুরো loop বন্ধ করে
- `continue` → শুধু বর্তমান iteration skip করে

---

# 7. Loop Practice Set

### Question 1
নিচের pattern print করুন:

```text
****
***
**
*
```

### Question 2
`while` loop ব্যবহার করে প্রথম `n`টি even number-এর sum বের করুন।

### Question 3
একটি সংখ্যার multiplication table print করুন।

### Question 4
10-এর multiplication table reverse order-এ print করুন।

### Question 5
`for` loop ব্যবহার করে একটি সংখ্যার factorial বের করুন।

```text
5! = 5 × 4 × 3 × 2 × 1 = 120
```

### Question 6
Question 5-এর solution `while` loop দিয়ে করুন।

### Question 7
Question 1-এর pattern `for` অথবা `while` loop দিয়ে তৈরি করুন।

### Question 8
এক ধরনের loop দিয়ে যে কাজ করা যায়, অন্য দুই ধরনের loop দিয়েও কি করা যায়?

### Question 9
8-এর multiplication table-এর সব সংখ্যার sum বের করুন।

### Question 10
`do-while` loop কমপক্ষে কতবার execute হয়?

**Answer:** At least once

### Question 11
Question 2-এর solution `for` loop দিয়ে করুন।

---

## Quick Revision

```text
while     → condition আগে check
do-while  → code আগে execute, condition পরে check
for       → initialization + condition + update
break     → loop completely stop
continue  → current iteration skip
```

## Next Lesson

### Class 10 — Arrays in Java
- Array কী?
- Array Declaration
- Array Initialization
- Array Traversal
- Multidimensional Array