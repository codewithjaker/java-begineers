# Java Tutorial — Class 05
## Exercise 1 Solution & Chapter 2 Practice Set

## 1. Exercise 1 — Percentage Calculator Solution

৫টি Subject-এর Marks Input নিয়ে Percentage বের করতে হবে।

### Code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int physics = scan.nextInt();

        System.out.print("Enter English marks: ");
        int english = scan.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = scan.nextInt();

        System.out.print("Enter Mathematics marks: ");
        int mathematics = scan.nextInt();

        System.out.print("Enter Computer Science marks: ");
        int computer = scan.nextInt();

        float percentage =
            ((physics + english + chemistry + mathematics + computer) / 500.0f) * 100;

        System.out.println("Percentage: " + percentage);
    }
}
```

### গুরুত্বপূর্ণ Concept

```java
500.0f
```

এখানে `f` ব্যবহার করা হয়েছে যাতে calculation-টি **float** হিসেবে সম্পন্ন হয়।

---

# 2. Chapter 2 — Practice Set

## Question 1 — Expression

নিচের expression-এর result বের করুন:

```java
float a = 7 / 4.0f * 9 / 2.0f;
System.out.println(a);
```

**Practice:** Operator precedence ও floating-point calculation লক্ষ্য করুন।

---

## Question 2 — Grade Encryption

একটি Grade-এর সঙ্গে `8` যোগ করে Encrypt এবং পরে `8` বাদ দিয়ে Decrypt করুন।

```java
char grade = 'B';

grade = (char)(grade + 8);
System.out.println(grade);

// Decrypt
grade = (char)(grade - 8);
System.out.println(grade);
```

### গুরুত্বপূর্ণ Concept

`char`-এর সঙ্গে arithmetic operation করলে type conversion প্রয়োজন হতে পারে।

```java
(char)
```

এটি **Type Casting**।

---

## Question 3 — Comparison Operator

User-এর কাছ থেকে একটি Number Input নিয়ে সেটি `8` থেকে বড় কি না Check করুন।

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println(a > 8);
    }
}
```

Output হবে:

```text
true
```

অথবা

```text
false
```

---

## Question 4 — Mathematical Expression

নিচের expression Java-তে লিখুন:

```text
(v² - u²) / 2as
```

Java-তে:

```java
float result = (v * v - u * u) / (2 * a * s);
```

---

## Question 5 — Expression-এর Value

নিচের expression-এর value বের করুন:

```java
int a = 7 * 49 / 7 + 35 / 7;

System.out.println(a);
```

### লক্ষ্য করুন

`*` এবং `/` একই precedence-এর হওয়ায় **left-to-right associativity** অনুসরণ করবে।

---

# Practice Task

নিজে সমাধান করুন:

1. `float a = 7 / 4 * 9 / 2`-এর result কী হবে?
2. একটি `char` Grade encrypt/decrypt করুন।
3. User-এর Number `100` থেকে বড় কি না Check করুন।
4. `(a² + b²)` Java expression হিসেবে লিখুন।
5. `10 + 20 * 3 - 5` expression-এর result বের করুন।

---

## Next Lesson

### Class 06 — Strings & String Methods

পরবর্তী Class-এ শিখব:

- String কী
- String তৈরি করা
- String Methods
- `length()`
- `toUpperCase()`
- `toLowerCase()`
- `substring()`
- `replace()`
- `equals()`