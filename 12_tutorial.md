# Java Tutorial — Class 12
## Methods, Method Overloading, VarArgs & Recursion

## 1. Method কী?

Java-তে **Method** হলো class-এর ভিতরে লেখা একটি reusable block of code।

Method ব্যবহার করলে একই code বারবার না লিখে প্রয়োজন অনুযায়ী call করা যায়।

> **DRY = Don't Repeat Yourself**

### Syntax

```java
returnType methodName() {
    // Method body
}
```

### Example

```java
int mySum(int a, int b) {
    int c = a + b;
    return c;
}
```

এখানে:

- `int` → Return type
- `mySum` → Method name
- `a, b` → Parameters
- `return c` → Return value

---

## 2. Method Calling

Object তৈরি করে method call করা যায়।

```java
class Calculate {

    int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Calculate obj = new Calculate();

        int result = obj.sum(5, 4);

        System.out.println(result);
    }
}
```

**Output:**

```text
9
```

### `void` Method

যখন কোনো value return করার প্রয়োজন নেই:

```java
void greet() {
    System.out.println("Good Morning!");
}
```

---

## 3. Static Method

`static` method class-এর সাথে associated থাকে।

তাই object তৈরি না করেও static method call করা যায়।

```java
static int sum(int a, int b) {
    return a + b;
}
```

Call:

```java
int result = sum(5, 4);
```

Java-এর `main()` method-ও `static`।

---

# 4. Method Overloading

একই class-এ **একই নামের একাধিক method**, কিন্তু তাদের **parameter list আলাদা** হলে তাকে **Method Overloading** বলে।

### Example — Different Number of Parameters

```java
static int multiply(int a, int b) {
    return a * b;
}

static int multiply(int a, int b, int c) {
    return a * b * c;
}
```

Call:

```java
System.out.println(multiply(5, 4));
System.out.println(multiply(5, 4, 3));
```

Output:

```text
20
60
```

### গুরুত্বপূর্ণ

Method overloading করা যায়:

- Parameters-এর সংখ্যা পরিবর্তন করে
- Parameters-এর data type পরিবর্তন করে

**শুধু return type পরিবর্তন করে Method Overloading করা যায় না।**

---

# 5. VarArgs

যখন একটি method-এ **variable number of arguments** গ্রহণ করতে হয়, তখন **VarArgs** ব্যবহার করা যায়।

### Syntax

```java
static int add(int... arr) {
    // arr behaves like int[]
}
```

### Example

```java
static int add(int... arr) {

    int result = 0;

    for (int a : arr) {
        result += a;
    }

    return result;
}
```

Call:

```java
System.out.println(add(1, 2));
System.out.println(add(2, 3, 4));
System.out.println(add(4, 5, 6));
```

Output:

```text
3
9
15
```

একই method-এ বিভিন্ন সংখ্যক argument পাঠানো যায়।

```java
add(7);
add(7, 8, 9);
add(1, 2, 7, 8, 9);
```

---

# 6. Recursion

**Recursion** হলো এমন একটি technique যেখানে একটি method **নিজেকেই call করে**।

### Basic Structure

```java
static void fun(int n) {

    if (n > 0) {
        fun(n - 1);
    }
}
```

Recursion-এ সাধারণত একটি **Base Case** থাকতে হয়, যাতে recursion শেষ হয়।

---

## 7. Recursion Example

### 1 থেকে n

```java
static void printNumbers(int n) {

    if (n > 0) {
        printNumbers(n - 1);
        System.out.println(n);
    }
}
```

`printNumbers(3)`:

```text
1
2
3
```

### n থেকে 1

```java
static void printNumbers(int n) {

    if (n > 0) {
        System.out.println(n);
        printNumbers(n - 1);
    }
}
```

`printNumbers(3)`:

```text
3
2
1
```

**Print statement-এর position পরিবর্তন করলে output-এর order পরিবর্তন হয়।**

---

# 8. Factorial Using Recursion

Factorial:

```text
5! = 5 × 4 × 3 × 2 × 1 = 120
```

Formula:

```text
factorial(n) = n × factorial(n - 1)
```

### Java Code

```java
static int factorial(int n) {

    if (n == 0 || n == 1) {
        return 1;
    }

    return n * factorial(n - 1);
}
```

Call:

```java
System.out.println(factorial(5));
```

Output:

```text
120
```

---

## Quick Revision

```text
Method           → Reusable block of code
Parameter        → Method definition-এর input
Argument         → Method call-এর actual value
return           → Value ফেরত দেয়
void             → কোনো value return করে না
static           → Class-এর সাথে associated
Overloading      → Same name + different parameters
VarArgs          → Variable number of arguments
Recursion        → Method নিজেকেই call করে
Base Case        → Recursion শেষ করার condition
```

## Practice

1. দুইটি number যোগ করার একটি method তৈরি করুন।
2. তিনটি number-এর average বের করার method লিখুন।
3. Method Overloading ব্যবহার করে `area()` method তৈরি করুন।
4. VarArgs ব্যবহার করে কয়েকটি number-এর sum বের করুন।
5. Recursion ব্যবহার করে `1` থেকে `n` পর্যন্ত print করুন।
6. Recursion ব্যবহার করে একটি number-এর factorial বের করুন।

## Next Lesson

### Class 13 — Object-Oriented Programming (OOP) Fundamentals
- Class & Object
- OOP Concepts
- Object Creation
- Instance Variables
- Methods & Objects