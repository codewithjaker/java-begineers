# Java Tutorial — Class 07
## If-Else, Relational & Logical Operators, Switch Case

## 1. Conditional Statement

Programming-এ কোনো **condition** সত্য হলে নির্দিষ্ট code execute করার জন্য Conditional Statement ব্যবহার করা হয়।

Java-তে প্রধান Decision-making statements:

- `if-else`
- `switch`

---

# 2. If-Else Statement

### Syntax

```java
if (condition) {
    // condition true হলে
} else {
    // condition false হলে
}
```

### Example

```java
int age = 29;

if (age > 18) {
    System.out.println("You can drive");
} else {
    System.out.println("You are underage!");
}
```

---

## 3. If-Else Ladder

একাধিক condition check করার জন্য `else if` ব্যবহার করা হয়।

```java
if (condition1) {
    // Code
}
else if (condition2) {
    // Code
}
else {
    // Code
}
```

শেষের `else` optional।

---

# 4. Relational Operators

Condition compare করার জন্য ব্যবহার করা হয়।

| Operator | অর্থ |
|---|---|
| `==` | Equal |
| `!=` | Not Equal |
| `>` | Greater Than |
| `<` | Less Than |
| `>=` | Greater Than or Equal |
| `<=` | Less Than or Equal |

### গুরুত্বপূর্ণ

```java
=
```

→ Assignment

```java
==
```

→ Equality Check

---

# 5. Logical Operators

একাধিক condition combine করার জন্য ব্যবহৃত হয়।

| Operator | নাম | Result |
|---|---|---|
| `&&` | AND | সব condition true হলে true |
| `||` | OR | অন্তত একটি true হলে true |
| `!` | NOT | Result উল্টে দেয় |

### AND

```java
true && true   → true
true && false  → false
false && true  → false
false && false → false
```

### OR

```java
true || true   → true
true || false  → true
false || true  → true
false || false → false
```

### NOT

```java
!true  → false
!false → true
```

---

# 6. Switch Case

একটি variable-এর বিভিন্ন possible value অনুযায়ী decision নেওয়ার জন্য `switch` ব্যবহার করা যায়।

### Syntax

```java
switch (variable) {
    case value1:
        // Code
        break;

    case value2:
        // Code
        break;

    default:
        // Default Code
}
```

### Example

```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    default:
        System.out.println("Invalid day");
}
```

আধুনিক Java-তে arrow syntax-ও ব্যবহার করা যায়:

```java
switch (day) {
    case 1 -> System.out.println("Monday");
    case 2 -> System.out.println("Tuesday");
    case 3 -> System.out.println("Wednesday");
    default -> System.out.println("Invalid day");
}
```

---

# 7. Practice Set — Conditionals & Switch

## Question 1 — Output

নিচের code-এ একটি গুরুত্বপূর্ণ syntax সমস্যা আছে:

```java
int a = 10;

if (a = 11)
    System.out.println("I am 11");
else
    System.out.println("I am not 11");
```

`=` Assignment-এর জন্য ব্যবহৃত হয়; condition check-এর জন্য `==` ব্যবহার করতে হবে।

---

## Question 2 — Pass or Fail

৩টি Subject-এর Marks Input নিন।

Pass করার শর্ত:

- Overall percentage ≥ 40%
- প্রতিটি Subject-এ কমপক্ষে 33%

Hint:

```java
if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

---

## Question 3 — Income Tax

Income অনুযায়ী Tax calculate করুন:

| Income | Tax |
|---|---:|
| Up to 2.5L | 0% |
| 2.5L–5L | 5% |
| 5L–10L | 20% |
| Above 10L | 30% |

এখানে `if-else-if` ব্যবহার করুন।

---

## Question 4 — Day of Week

Input:

```text
1 → Monday
2 → Tuesday
3 → Wednesday
4 → Thursday
5 → Friday
6 → Saturday
7 → Sunday
```

`switch` ব্যবহার করে program তৈরি করুন।

---

## Question 5 — Leap Year

User-এর কাছ থেকে Year নিয়ে সেটি **Leap Year** কি না Check করুন।

---

## Question 6 — Website Type

URL-এর শেষ অংশ দেখে Website-এর ধরন নির্ণয় করুন:

```text
.com → Commercial
.org → Organization
.in  → Indian
```

Hint:

```java
website.endsWith(".com")
```

---

# Practice Task

নিজে তৈরি করুন:

1. Number positive, negative নাকি zero তা বের করুন।
2. তিনটি Number-এর মধ্যে সবচেয়ে বড়টি বের করুন।
3. একজন শিক্ষার্থীর Grade নির্ণয় করুন।
4. Calculator তৈরি করুন `switch` ব্যবহার করে।
5. একটি Number Even নাকি Odd তা বের করুন।

---

## Next Lesson

### Class 08 — Project: Rock Paper Scissors Game

পরবর্তী Class-এ `if-else`, `switch`, `Random` এবং User Input ব্যবহার করে একটি ছোট **Rock Paper Scissors Game** তৈরি করব।