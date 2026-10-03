# Java Tutorial — Class 10
## Arrays in Java

### 1. Array কী?

**Array** হলো একই ধরনের একাধিক data একসাথে সংরক্ষণ করার একটি structure।

উদাহরণ: ৫ জন শিক্ষার্থীর marks সংরক্ষণ।

```java
int[] marks = {100, 70, 80, 71, 98};
```

### গুরুত্বপূর্ণ বিষয়

- Array-এর index শুরু হয় `0` থেকে।
- শেষ index = `length - 1`
- Array-এর size fixed।
- একই ধরনের data সাধারণত একই array-তে রাখা হয়।

```text
marks[0] → 100
marks[1] → 70
marks[2] → 80
marks[3] → 71
marks[4] → 98
```

---

## 2. Array তৈরি করার পদ্ধতি

### Declaration

```java
int[] marks;
```

### Memory Allocation

```java
marks = new int[5];
```

### Declaration + Allocation

```java
int[] marks = new int[5];
```

### Declaration + Initialization

```java
int[] marks = {98, 45, 79, 99, 80};
```

### Array Element Access

```java
System.out.println(marks[0]);
System.out.println(marks[4]);
```

`marks[5]` ব্যবহার করলে error হবে, কারণ ৫টি element-এর index হলো `0–4`।

---

## 3. Array Length

Java-তে array-এর size জানার জন্য `.length` ব্যবহার করা হয়।

```java
System.out.println(marks.length);
```

৫টি element থাকলে:

```text
marks.length = 5
```

---

## 4. Array Traversal

`for` loop ব্যবহার করে array-এর সব element access করা যায়।

```java
int[] marks = {98, 45, 79, 99, 80};

for (int i = 0; i < marks.length; i++) {
    System.out.println(marks[i]);
}
```

### Reverse Order

```java
for (int i = marks.length - 1; i >= 0; i--) {
    System.out.println(marks[i]);
}
```

---

# 5. For-Each Loop

**For-each loop** array-এর প্রতিটি element একে একে access করার সহজ পদ্ধতি।

### Syntax

```java
for (int element : marks) {
    System.out.println(element);
}
```

### Example

```java
int[] marks = {98, 45, 79, 99, 80};

for (int element : marks) {
    System.out.println(element);
}
```

### মনে রাখুন

For-each loop:

- সহজে array traverse করে
- Code readability বাড়ায়
- Start → End পর্যন্ত traverse করার জন্য উপযোগী
- সাধারণভাবে reverse order বা নির্দিষ্ট element skip করার জন্য ব্যবহার করা হয় না

---

# 6. Multidimensional Array

**Multidimensional Array** হলো array-এর ভিতরে array।

সবচেয়ে সাধারণ হলো **2-D Array**।

### 2-D Array তৈরি

```java
int[][] flats = new int[2][3];
```

এখানে:

- `2` = Rows
- `3` = Columns

### Value Assign

```java
flats[0][0] = 101;
flats[0][1] = 102;
flats[0][2] = 103;

flats[1][0] = 201;
flats[1][1] = 202;
flats[1][2] = 203;
```

### 2-D Array Print

Nested `for` loop ব্যবহার করা হয়:

```java
for (int i = 0; i < flats.length; i++) {

    for (int j = 0; j < flats[i].length; j++) {
        System.out.print(flats[i][j] + " ");
    }

    System.out.println();
}
```

---

# 7. Array Practice Set

### Question 1
৫টি `float` number-এর একটি array তৈরি করে তাদের sum বের করুন।

### Question 2
একটি নির্দিষ্ট number array-এর মধ্যে আছে কি না check করুন।

### Question 3
`for-each` loop ব্যবহার করে students-এর average marks বের করুন।

### Question 4
দুটি `2 × 3` matrix যোগ করুন।

### Question 5
একটি array reverse করুন।

### Question 6
Array-এর maximum element বের করুন।

### Question 7
Array sorted কি না check করুন।

---

## গুরুত্বপূর্ণ Code Examples

### Array Sum

```java
float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};

float sum = 0;

for (float element : marks) {
    sum += element;
}

System.out.println("Sum = " + sum);
```

### Average

```java
float average = sum / marks.length;
System.out.println("Average = " + average);
```

### Maximum Element

```java
int[] arr = {1, 2100, 3, 455, 5, 34, 67};

int max = Integer.MIN_VALUE;

for (int element : arr) {
    if (element > max) {
        max = element;
    }
}

System.out.println("Maximum = " + max);
```

### Array Sorted Check

```java
boolean isSorted = true;

int[] arr = {1, 12, 3, 4, 5, 34, 67};

for (int i = 0; i < arr.length - 1; i++) {

    if (arr[i] > arr[i + 1]) {
        isSorted = false;
        break;
    }
}

if (isSorted) {
    System.out.println("The Array is sorted");
} else {
    System.out.println("The Array is not sorted");
}
```

---

## Quick Revision

```text
Array             → একই ধরনের একাধিক data
Index             → 0 থেকে শুরু
Last Index        → length - 1
length            → Array-এর size
for loop          → Array traversal
for-each          → সহজে প্রতিটি element access
2-D Array         → Row + Column
Nested for loop   → 2-D Array traversal
```

## Next Lesson

### Class 11 — IntelliJ IDEA & Java Development Environment
- IntelliJ IDEA setup
- Java project structure
- Code execution
- Development environment