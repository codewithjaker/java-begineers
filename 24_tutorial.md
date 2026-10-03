# Java Tutorial — Class 24: Errors, Exceptions & Try-Catch

## 1. Errors in Java

Java program-এ প্রধানত ৩ ধরনের Error দেখা যায়:

1. **Syntax Error**
2. **Logical Error**
3. **Runtime Error / Exception**

---

## 2. Syntax Error

Program-এর syntax ভুল হলে **Syntax Error** হয়।

```java
int a = 9   // Missing ;
a = a + 3;

d = 4;      // Variable declared হয়নি
```

Compiler সাধারণত এই ধরনের ভুল শনাক্ত করে।

### Example

```java
int a = 5;
int b = 9;

System.out.println(a + b);
```

---

## 3. Logical Error

Program compile ও run করে, কিন্তু **ভুল result** দেয়।

এগুলোকে সাধারণত **Bug** বলা হয়।

### Example

Prime number বের করার program-এ logic ভুল হলে program চলবে, কিন্তু সঠিক prime numbers দেখাবে না।

Logical Error-এর উদাহরণ:

- ভুল message দেখানো
- ভুল time display
- ভুল page redirect
- ভুল calculation

---

# 4. Runtime Error / Exception

Program চলার সময় কোনো unexpected problem হলে **Runtime Error** বা **Exception** হতে পারে।

যেমন:

- User ভুল input দিলে
- `0` দিয়ে division করলে
- Invalid array index ব্যবহার করলে
- কোনো resource-এর সমস্যা হলে

Example:

```java
int a = 1000;
int k = 0;

System.out.println(a / k);
```

এখানে `ArithmeticException` হতে পারে।

---

# 5. Exception কী?

**Exception** হলো এমন একটি event যা program-এর normal flow পরিবর্তন করে।

Common Exceptions:

- `NullPointerException`
- `ArithmeticException`
- `ArrayIndexOutOfBoundsException`
- `IllegalArgumentException`
- `NumberFormatException`

---

# 6. Try-Catch

Exception handle করার জন্য `try-catch` ব্যবহার করা হয়।

```java
try {
    int c = a / b;
    System.out.println("The result is " + c);
}
catch (Exception e) {
    System.out.println("We failed to divide.");
    System.out.println(e);
}
```

`try` block-এ সম্ভাব্য risky code থাকে।

`catch` block exception হলে কী করতে হবে তা নির্ধারণ করে।

### Example

```java
public class Main {
    public static void main(String[] args) {

        int a = 6000;
        int b = 0;

        try {
            int c = a / b;
            System.out.println("The result is " + c);
        }
        catch (Exception e) {
            System.out.println("We failed to divide.");
            System.out.println(e);
        }

        System.out.println("End of the program");
    }
}
```

---

# 7. Specific Exceptions Handle করা

একাধিক `catch` block ব্যবহার করে আলাদা আলাদা exception handle করা যায়।

```java
try {
    System.out.println(marks[ind]);
    System.out.println(marks[ind] / number);
}
catch (ArithmeticException e) {
    System.out.println("ArithmeticException occurred!");
}
catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("ArrayIndexOutOfBoundsException occurred!");
}
catch (Exception e) {
    System.out.println("Some other exception occurred!");
}
```

### গুরুত্বপূর্ণ

Specific exception-এর `catch` আগে এবং general `Exception` পরে রাখা উচিত।

```text
ArithmeticException
        ↓
ArrayIndexOutOfBoundsException
        ↓
Exception
```

---

# 8. Nested Try-Catch

একটি `try-catch` block-এর ভিতরে আরেকটি `try-catch` রাখা যায়।

```java
try {

    System.out.println("Level 1");

    try {
        System.out.println(marks[ind]);
    }
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Invalid index");
    }

}
catch (Exception e) {
    System.out.println("Exception in level 1");
}
```

প্রয়োজনে আরও nested `try-catch` ব্যবহার করা যায়।

---

# 9. Array Index Validation Example

User যতক্ষণ valid index না দেবে, ততক্ষণ input নেওয়া যায়।

```java
boolean flag = true;

while (flag) {

    System.out.println("Enter the value of index");
    int ind = sc.nextInt();

    try {
        System.out.println(marks[ind]);
        flag = false;
    }
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Sorry, this index does not exist");
    }
}
```

Valid index পাওয়া গেলে:

```java
flag = false;
```

হয়ে loop বন্ধ হবে।

---

# 10. Exception Types

এই lesson-এ দুটি প্রধান ধরনের exception উল্লেখ করা হয়েছে:

### Checked Exceptions
Compiler-এর মাধ্যমে handle করার প্রয়োজন হয়।

### Unchecked Exceptions
Runtime-এ ঘটে।

---

# Quick Revision

| Type | অর্থ |
|---|---|
| Syntax Error | Code-এর syntax ভুল |
| Logical Error | Program চলে কিন্তু result ভুল |
| Runtime Error | Program চলার সময় error |
| Exception | Normal program flow ব্যাহত করে |
| `try` | Risky code রাখা হয় |
| `catch` | Exception handle করে |
| Nested try-catch | `try-catch`-এর ভিতরে আরেকটি `try-catch` |

### গুরুত্বপূর্ণ Exceptions

```text
ArithmeticException
ArrayIndexOutOfBoundsException
NullPointerException
IllegalArgumentException
NumberFormatException
```

## Practice

1. `0` দিয়ে division করে `ArithmeticException` handle করো।
2. Invalid array index দিয়ে `ArrayIndexOutOfBoundsException` handle করো।
3. Multiple `catch` ব্যবহার করো।
4. Nested `try-catch` তৈরি করো।
5. এমন program তৈরি করো যেখানে valid array index না দেওয়া পর্যন্ত user-এর কাছ থেকে input নেওয়া হবে।

## Next Lesson

**Class 25 — Advanced Exception Handling**