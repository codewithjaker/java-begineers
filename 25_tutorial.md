# Java Tutorial — Class 25: Advanced Exception Handling

## 1. Exception Class

Java-এর `Exception` class ব্যবহার করে **Custom Exception** তৈরি করা যায়।

```java
class MyException extends Exception {
    // Custom methods
}
```

### গুরুত্বপূর্ণ Methods

#### `toString()`

Exception object `System.out.println(e)` দিয়ে print করলে `toString()`-এর result দেখা যায়।

```java
@Override
public String toString() {
    return "I am toString()";
}
```

#### `getMessage()`

Exception-এর message return করে।

```java
@Override
public String getMessage() {
    return "I am getMessage()";
}
```

#### `printStackTrace()`

Exception-এর বিস্তারিত **Stack Trace** দেখায়।

```java
e.printStackTrace();
```

### ব্যবহার

```java
try {
    throw new ArithmeticException("This is an exception");
}
catch (Exception e) {
    System.out.println(e.getMessage());
    System.out.println(e.toString());
    e.printStackTrace();
}
```

---

# 2. Custom Exception

নিজের প্রয়োজন অনুযায়ী Exception class তৈরি করা যায়।

```java
class MaxAgeException extends Exception {

    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure that the value of age entered is correct";
    }
}
```

এরপর:

```java
throw new MaxAgeException();
```

---

# 3. `throw` Keyword

`throw` ব্যবহার করে programmer নিজে **explicitly exception throw** করতে পারে।

```java
if (b == 0) {
    throw new ArithmeticException("Div by 0");
}
```

Custom exception-ও throw করা যায়:

```java
throw new MyException();
```

### মূল কথা

```text
throw → Exception তৈরি/ছুড়ে দেয়
```

---

# 4. `throws` Keyword

`throws` method declaration-এ ব্যবহার করা হয়।

এটি জানায় যে method থেকে একটি exception আসতে পারে।

```java
public void calculate(int a, int b)
        throws IOException {

    // code
}
```

আরেকটি example:

```java
public static double area(int r)
        throws NegativeRadiusException {

    if (r < 0) {
        throw new NegativeRadiusException();
    }

    return Math.PI * r * r;
}
```

### `throw` vs `throws`

| `throw` | `throws` |
|---|---|
| Exception explicitly throw করে | Method-এর সম্ভাব্য exception declare করে |
| Method body-তে ব্যবহার হয় | Method declaration-এ ব্যবহার হয় |
| একটি exception object throw করা হয় | এক বা একাধিক exception declare করা যায় |

---

# 5. `finally` Block

`finally` block সাধারণত exception handle হোক বা না হোক, execute হয়।

এটি বিশেষ করে **resource cleanup**-এর কাজে ব্যবহার করা হয়।

যেমন:

- Resource close করা
- Connection close করা
- Cleanup operation

### Example

```java
public static int greet() {

    try {
        int a = 50;
        int b = 10;
        int c = a / b;

        return c;
    }
    catch (Exception e) {
        System.out.println(e);
    }
    finally {
        System.out.println(
            "Cleaning up resources..."
        );
    }

    return -1;
}
```

এখানে `return` থাকলেও `finally` block execute হবে।

---

## 6. `finally` with Loop

```java
int a = 7;
int b = 9;

while (true) {

    try {
        System.out.println(a / b);
    }
    catch (Exception e) {
        System.out.println(e);
        break;
    }
    finally {
        System.out.println(
            "I am finally for value of b = " + b
        );
    }

    b--;
}
```

`finally` block exception হোক বা না হোক execution-এর cleanup অংশ হিসেবে কাজ করে।

---

# 7. Practice Set — Errors & Exceptions

### Q1
একটি Java program তৈরি করো যেখানে:

- Syntax Error
- Logical Error
- Runtime Error

demonstrate করা হবে।

### Q2
`ArithmeticException` হলে:

```text
HaHa
```

এবং `IllegalArgumentException` হলে:

```text
HeHe
```

print করো।

### Q3
User-কে একটি array index দিতে দাও। সর্বোচ্চ **5 বার** ভুল input-এর সুযোগ থাকবে।

5 বার ভুল হলে:

```text
Error
```

print করো।

### Q4
Q3-এর program modify করে maximum retries শেষ হলে একটি **Custom Exception** throw করো।

### Q5
Q3-এর logic একটি method-এর মধ্যে রাখো এবং method থেকে Custom Exception `throws` করো।

---

# Quick Revision

```text
Exception
   ├── Custom Exception
   ├── throw
   ├── throws
   └── finally
```

### গুরুত্বপূর্ণ Methods

```java
e.toString();
e.getMessage();
e.printStackTrace();
```

### মনে রাখবে

- `throw` → নিজে Exception throw করে।
- `throws` → method-এর exception declare করে।
- `finally` → cleanup code রাখার জন্য ব্যবহৃত হয়।
- `Exception` extend করে Custom Exception তৈরি করা যায়।
- `toString()` → exception-এর string representation।
- `getMessage()` → exception message।
- `printStackTrace()` → বিস্তারিত stack trace।

## Next Lesson

**Class 26 — Project: Custom Calculator**