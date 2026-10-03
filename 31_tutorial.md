# Class 31 — Advanced Java Practice Set & Custom Calculator Solution

## Part 1: Advanced Java Practice Set

### Question 1 — ArrayList

১০ জন Student-এর নাম `ArrayList`-এ সংরক্ষণ করে **for-each loop** দিয়ে print করুন।

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Student 1");
        students.add("Student 2");
        students.add("Student 3");
        students.add("Student 4");
        students.add("Student 5");
        students.add("Student 6");
        students.add("Student 7");
        students.add("Student 8");
        students.add("Student 9");
        students.add("Student 10");

        for (String student : students) {
            System.out.println(student);
        }
    }
}
```

**Key concept:** `add()` + `for-each loop`

---

## Question 2 — Date Class

`Date` class ব্যবহার করে সময়কে এই format-এ print করুন:

```text
21:47:02
```

```java
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date d = new Date();

        System.out.println(
            d.getHours() + ":" +
            d.getMinutes() + ":" +
            d.getSeconds()
        );
    }
}
```

**Key concept:** `Date`, `getHours()`, `getMinutes()`, `getSeconds()`

---

## Question 3 — Calendar Class

একই কাজ `Calendar` class দিয়ে করুন।

```java
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        System.out.println(
            c.get(Calendar.HOUR_OF_DAY) + ":" +
            c.get(Calendar.MINUTE) + ":" +
            c.get(Calendar.SECOND)
        );
    }
}
```

**Key concept:** `Calendar.getInstance()` এবং `get()`

---

## Question 4 — java.time API

`java.time` API ব্যবহার করে সময় print করুন।

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter df =
            DateTimeFormatter.ofPattern("H:m:s");

        String myDate = dt.format(df);

        System.out.println(myDate);
    }
}
```

**Key concept:**  
`LocalDateTime` → `DateTimeFormatter` → `format()`

---

## Question 5 — HashSet & Duplicate Values

একটি `HashSet` তৈরি করে duplicate value যোগ করে দেখুন।

```java
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Integer> s = new HashSet<>();

        s.add(5);
        s.add(6);
        s.add(46);
        s.add(60);
        s.add(9);
        s.add(6);

        System.out.println(s);
    }
}
```

Output-এ `6` একবারই থাকবে।

**Key concept:** `HashSet` duplicate element store করে না।

---

# Part 2: Exercise 6 — Custom Calculator Solution

Custom Calculator-এ ৪টি operation থাকবে:

```text
+ → Addition
- → Subtraction
* → Multiplication
/ → Division
```

### Custom Exceptions

1. `InvalidInputException`
2. `CannotDivideByZeroException`
3. `MaxInputException`
4. `MaxMultiplyInputException`

### Rules

- `8` এবং `9` নিয়ে Addition করা যাবে না।
- `0` দিয়ে Division করা যাবে না।
- কোনো input `100000`-এর বেশি হলে `MaxInputException`
- Multiplication-এর কোনো input `7000`-এর বেশি হলে `MaxMultiplyInputException`

---

## Custom Exception Classes

```java
class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "Cannot add 8 and 9";
    }
}

class MaxInputException extends Exception {
    @Override
    public String toString() {
        return "Input cant be greater than 100000";
    }
}

class CannotDivideByZeroException extends Exception {
    @Override
    public String toString() {
        return "Cannot divide by 0";
    }
}

class MaxMultiplyInputException extends Exception {
    @Override
    public String toString() {
        return "Input cant be greater than 7000 while multiplying";
    }
}
```

---

## CustomCalculator Class

```java
class CustomCalculator {

    double add(double a, double b)
            throws InvalidInputException, MaxInputException {

        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }

        if (a == 8 || b == 9) {
            throw new InvalidInputException();
        }

        return a + b;
    }

    double subtract(double a, double b)
            throws MaxInputException {

        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }

        return a - b;
    }

    double multiply(double a, double b)
            throws MaxInputException,
                   MaxMultiplyInputException {

        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }

        if (a > 7000 || b > 7000) {
            throw new MaxMultiplyInputException();
        }

        return a * b;
    }

    double divide(double a, double b)
            throws CannotDivideByZeroException,
                   MaxInputException {

        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }

        if (b == 0) {
            throw new CannotDivideByZeroException();
        }

        return a / b;
    }
}
```

---

## Main Method

```java
public class Main {

    public static void main(String[] args)
            throws InvalidInputException,
                   CannotDivideByZeroException,
                   MaxInputException,
                   MaxMultiplyInputException {

        CustomCalculator c = new CustomCalculator();

        System.out.println(c.add(5, 6));
        System.out.println(c.subtract(10, 4));
        System.out.println(c.multiply(5, 10));
        System.out.println(c.divide(20, 4));
    }
}
```

### গুরুত্বপূর্ণ Concepts

```text
Custom Exception
       ↓
extends Exception
       ↓
throw
       ↓
throws
       ↓
Exception Handling
```

### Practice

1. Calculator-এ `Scanner` দিয়ে user input নিন।
2. `try-catch` দিয়ে exception handle করুন।
3. `8 + 9` চালিয়ে `InvalidInputException` দেখুন।
4. `10 / 0` চালিয়ে exception দেখুন।
5. `100001 + 5` চালিয়ে `MaxInputException` test করুন।
6. `7001 × 5` চালিয়ে `MaxMultiplyInputException` test করুন।

### Next Lesson

**Class 32 — Project: Library Management System**