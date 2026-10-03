# Java Tutorial — Class 04
## Operators, Expressions, Precedence & Increment/Decrement

## 1. Operator কী?

**Operator** হলো একটি symbol, যা **operands**-এর উপর নির্দিষ্ট operation সম্পন্ন করে।

```java
a + b
```

এখানে:

- `a`, `b` → Operands
- `+` → Operator

---

# 2. Types of Operators

## Arithmetic Operators

গাণিতিক কাজের জন্য ব্যবহৃত হয়।

| Operator | কাজ | Example |
|---|---|---|
| `+` | Addition | `x + y` |
| `-` | Subtraction | `x - y` |
| `*` | Multiplication | `x * y` |
| `/` | Division | `x / y` |
| `%` | Remainder | `x % y` |
| `++` | Increment | `x++` |
| `--` | Decrement | `x--` |

Example:

```java
int x = 7;
int y = 2;

System.out.println(x + y); // 9
System.out.println(x - y); // 5
System.out.println(x * y); // 14
System.out.println(x / y); // 3
System.out.println(x % y); // 1
```

---

## Assignment Operators

Variable-এর value পরিবর্তন বা assign করার জন্য ব্যবহৃত হয়।

```java
int b = 9;

b += 3;
b -= 2;
b *= 3;
b /= 2;
```

---

## Comparison Operators

দুইটি value compare করে এবং `boolean` result দেয়।

| Operator | অর্থ |
|---|---|
| `==` | Equal |
| `!=` | Not Equal |
| `>` | Greater Than |
| `<` | Less Than |
| `>=` | Greater Than or Equal |
| `<=` | Less Than or Equal |

Example:

```java
int x = 7;
int y = 2;

System.out.println(x > y);  // true
System.out.println(x == y); // false
```

---

## Logical Operators

একাধিক condition নিয়ে কাজ করে।

| Operator | অর্থ |
|---|---|
| `&&` | AND |
| `||` | OR |
| `!` | NOT |

Example:

```java
System.out.println(64 > 5 && 64 > 98);
System.out.println(64 > 5 || 64 > 98);
```

---

## Bitwise Operators

Number-এর binary bits-এর উপর operation করে।

| Operator | কাজ |
|---|---|
| `&` | Bitwise AND |
| `|` | Bitwise OR |
| `^` | Bitwise XOR |
| `<<` | Left Shift |
| `>>` | Right Shift |

Example:

```java
System.out.println(2 & 3);
```

Binary:

```text
2 = 10
3 = 11
-----
    10
```

---

# 3. Operator Precedence

একটি expression-এ কোন operator আগে execute হবে সেটাকে **Precedence** বলে।

```java
int a = 6 * 5 - 34 / 2;
```

প্রথমে `*` এবং `/` হবে:

```text
= 30 - 17
= 13
```

### Parentheses ব্যবহার

Execution order পরিবর্তন করতে `()` ব্যবহার করা যায়।

```java
int result = (6 + 4) * 2;
```

---

# 4. Associativity

**Associativity** বলে দেয় একই precedence-এর operator কোন direction-এ execute হবে।

সাধারণভাবে:

```text
* / %  → Left to Right
+ -    → Left to Right
++     → Right to Left
=      → Right to Left
```

Example:

```java
int a = 6 * 5 - 34 / 2;
```

প্রথমে `*` ও `/`, তারপর `-`।

---

# 5. Data Type of Expressions

Arithmetic operation-এর ফলে result-এর Data Type পরিবর্তিত হতে পারে।

গুরুত্বপূর্ণ নিয়ম:

```text
byte + short       → int
short + int        → int
int + float        → float
long + float       → float
long + double      → double
float + double     → double
char + int         → int
char + short       → int
```

---

# 6. Increment & Decrement Operators

### Increment

Value ১ বাড়ায়।

```java
a++;
++a;
```

### Decrement

Value ১ কমায়।

```java
a--;
--a;
```

Boolean ছাড়া অন্যান্য numeric/character type-এর ক্ষেত্রে এগুলো ব্যবহার করা যায়।

---

## Post-Increment

```java
int i = 56;

System.out.println(i++);
System.out.println(i);
```

`i++` প্রথমে বর্তমান value ব্যবহার করে, তারপর `1` বাড়ায়।

---

## Pre-Increment

```java
int j = 67;

int c = ++j;
```

`++j` প্রথমে value `1` বাড়ায়, তারপর ব্যবহার করে।

---

## Example

```java
int y = 7;

System.out.println(++y * 8);
```

প্রথমে:

```text
y = 8
8 × 8 = 64
```

---

## Character-এর ক্ষেত্রেও Increment কাজ করে

```java
char ch = 'a';

System.out.println(++ch);
```

Output:

```text
b
```

---

# Practice Task

### Task 1
দুইটি Number নিয়ে:

- Addition
- Subtraction
- Multiplication
- Division
- Remainder

বের করুন।

### Task 2
নিচের expression-এর output বের করার চেষ্টা করুন:

```java
int x = 6;
int y = 5;

int result = x * y + 10 / 2;
System.out.println(result);
```

### Task 3
Pre-Increment এবং Post-Increment-এর পার্থক্য দেখানোর একটি program লিখুন।

### Task 4
নিচের code-এর output অনুমান করুন:

```java
int y = 7;
int x = ++y * 8;

System.out.println(x);
```

---

## Next Lesson

### Class 05 — Operators Practice & Chapter Practice Set

পরবর্তী Class-এ Operators এবং Expressions ব্যবহার করে বিভিন্ন **Practice Problems** সমাধান করব।