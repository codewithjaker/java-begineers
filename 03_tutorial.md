# Java Tutorial — Class 03
## Exercise 1 & Chapter 1 Practice Set

এই Class-এ Variables, Data Types এবং User Input ব্যবহার করে কয়েকটি বাস্তব সমস্যা সমাধান করব।

---

## 1. CBSE Board Percentage Calculator

### Problem

একজন শিক্ষার্থীর ৫টি Subject-এর Marks Input নিয়ে তার **Percentage** বের করতে হবে।

প্রতিটি Subject-এর পূর্ণমান = 100

### Formula

```text
Percentage = (Total Marks / 500) × 100
```

### Example Code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        float s1 = sc.nextFloat();

        System.out.print("Enter marks of Subject 2: ");
        float s2 = sc.nextFloat();

        System.out.print("Enter marks of Subject 3: ");
        float s3 = sc.nextFloat();

        System.out.print("Enter marks of Subject 4: ");
        float s4 = sc.nextFloat();

        System.out.print("Enter marks of Subject 5: ");
        float s5 = sc.nextFloat();

        float percentage = (s1 + s2 + s3 + s4 + s5) / 5;

        System.out.println("Percentage: " + percentage + "%");
    }
}
```

---

# 2. Chapter 1 — Practice Set

## Question 1 — Sum of Three Numbers

তিনটি Number Input নিয়ে তাদের Sum বের করুন।

```java
int a = 4;
int b = 17;
int c = 6;

int sum = a + b + c;

System.out.println(sum);
```

---

## Question 2 — Calculate CGPA

তিনটি Subject-এর Marks নিয়ে CGPA বের করুন।

```java
float subject1 = 45;
float subject2 = 95;
float subject3 = 48;

float cgpa = (subject1 + subject2 + subject3) / 30;

System.out.println(cgpa);
```

> **Practice:** User Input ব্যবহার করে একই Program তৈরি করুন।

---

## Question 3 — Greeting Program

User-এর Name Input নিয়ে Greeting দেখান।

### Expected Output

```text
Hello Harry, have a good day!
```

### Code

```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter your name: ");
String name = sc.next();

System.out.println("Hello " + name + ", have a good day!");
```

---

## Question 4 — Kilometer to Miles

Kilometer থেকে Miles-এ Convert করুন।

### Formula

```text
Miles = Kilometer × 0.621371
```

### Example

```java
float km = 10;

float miles = km * 0.621371f;

System.out.println("Miles: " + miles);
```

---

## Question 5 — Integer Check

User যে Number Input দিয়েছে সেটি **Integer কি না** তা Check করুন।

এক্ষেত্রে `Scanner`-এর:

```java
sc.hasNextInt()
```

ব্যবহার করা যায়।

### Example

```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter your number: ");

System.out.println(sc.hasNextInt());
```

Output:

```text
true
```

অথবা

```text
false
```

---

# Practice Task

নিজে নিচের Programগুলো তৈরি করুন:

1. দুইটি Number-এর যোগ, বিয়োগ, গুণ ও ভাগ।
2. তিনটি Subject-এর Average Marks।
3. Kilometer → Miles Converter।
4. Celsius → Fahrenheit Converter।
5. User-এর Name ও Age নিয়ে একটি Greeting Program।

---

## Next Lesson

### Class 04 — Operators & Expressions

পরবর্তী Class-এ শিখব:

- Arithmetic Operators
- Assignment Operators
- Relational Operators
- Logical Operators
- Increment & Decrement
- Operator Precedence
- Expressions