# Java Tutorial — Class 26: Exercise 6 — Custom Calculator

## 1. Exercise

একটি **Custom Calculator** তৈরি করতে হবে যেখানে নিচের operations থাকবে:

```text
+ → Addition
- → Subtraction
* → Multiplication
/ → Division
```

Calculator-এ বিভিন্ন পরিস্থিতির জন্য **Custom Exceptions** ব্যবহার করতে হবে।

---

## 2. Required Exceptions

### 1. Invalid Input Exception

Invalid operator/input দিলে exception হবে।

Example:

```text
8 & 9
```

এখানে `&` valid calculator operator নয়।

---

### 2. Cannot Divide by 0 Exception

Division-এর সময় divisor `0` হলে exception হবে।

```java
10 / 0
```

---

### 3. Max Input Exception

যেকোনো input:

```text
> 100000
```

হলে **Max Input Exception** হবে।

---

### 4. Max Multiplier Reached Exception

Multiplication-এর ক্ষেত্রে কোনো input:

```text
> 7000
```

হলে **Max Multiplier Reached Exception** হবে।

---

# 3. Program Requirements

Calculator-এ এই চারটি operation implement করো:

```java
addition
subtraction
multiplication
division
```

এবং প্রয়োজন অনুযায়ী Custom Exception তৈরি করো।

### Suggested Structure

```java
class InvalidInputException extends Exception {
    // custom message
}

class CannotDivideByZeroException extends Exception {
    // custom message
}

class MaxInputException extends Exception {
    // custom message
}

class MaxMultiplierReachedException extends Exception {
    // custom message
}
```

---

# 4. Validation Logic

Calculator operation করার আগে input validate করতে হবে।

```text
Input > 100000
       ↓
Max Input Exception
```

Multiplication-এর ক্ষেত্রে:

```text
Input > 7000
       ↓
Max Multiplier Reached Exception
```

Division-এর ক্ষেত্রে:

```text
Divisor == 0
       ↓
Cannot Divide by 0 Exception
```

Invalid operator:

```text
Operator ≠ + - * /
       ↓
Invalid Input Exception
```

---

## Practice Task

নিজে সম্পূর্ণ `Custom Calculator` program তৈরি করো এবং `try-catch` ব্যবহার করে প্রতিটি Custom Exception handle করো।

### লক্ষ্য

এই Exercise-এর মাধ্যমে একসাথে practice হবে:

- Class & Methods
- Arithmetic Operations
- `if-else` / `switch`
- Custom Exception
- `throw`
- `throws`
- `try-catch`
- Input Validation

## Next Lesson

**Class 27 — Java Collections Framework & Documentation**