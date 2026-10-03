# Java Tutorial — Class 06
## Introduction to Strings, String Methods & Practice

## 1. String কী?

**String** হলো একাধিক Character-এর sequence।

```java
String name = "Harry";
```

Java-তে `String` একটি **class**, তবে Data Type হিসেবেও ব্যবহার করা যায়।

### String তৈরি

```java
String s1 = "Harry";
String s2 = new String("Harry");
```

### গুরুত্বপূর্ণ

Java-এর String **immutable**। অর্থাৎ তৈরি হওয়ার পর String-এর মূল value সরাসরি পরিবর্তন করা যায় না।

---

## 2. String Literal বনাম `new`

### String Literal

```java
String str1 = "CodeWithHarry";
String str2 = "CodeWithHarry";

System.out.println(str1 == str2);
```

Output:

```text
true
```

কারণ একই String **String Pool** থেকে reference নেওয়া হয়েছে।

### `new` দিয়ে String

```java
String str1 = new String("Keep coding");
String str2 = new String("Keep coding");

System.out.println(str1 == str2);
```

Output:

```text
false
```

কারণ দুটি আলাদা object তৈরি হয়েছে।

### String Compare করার সঠিক পদ্ধতি

String-এর value compare করার জন্য:

```java
str1.equals(str2);
```

ব্যবহার করুন।

---

# 3. String Methods

ধরি:

```java
String name = "Harry";
```

| Method | কাজ |
|---|---|
| `length()` | String-এর length |
| `toLowerCase()` | ছোট হাতের অক্ষর |
| `toUpperCase()` | বড় হাতের অক্ষর |
| `trim()` | শুরু ও শেষের অতিরিক্ত space বাদ দেয় |
| `substring(start)` | নির্দিষ্ট index থেকে শেষ পর্যন্ত |
| `substring(start, end)` | নির্দিষ্ট range |
| `replace()` | Character/String replace |
| `startsWith()` | নির্দিষ্ট text দিয়ে শুরু হয়েছে কিনা |
| `endsWith()` | নির্দিষ্ট text দিয়ে শেষ হয়েছে কিনা |
| `charAt()` | নির্দিষ্ট index-এর character |
| `indexOf()` | প্রথম occurrence-এর index |
| `lastIndexOf()` | শেষ occurrence-এর index |
| `equals()` | Case-sensitive comparison |
| `equalsIgnoreCase()` | Case ignore করে comparison |

### Example

```java
String name = "Harry";

System.out.println(name.length());
System.out.println(name.toUpperCase());
System.out.println(name.toLowerCase());
System.out.println(name.charAt(2));
System.out.println(name.substring(1, 4));
System.out.println(name.replace('r', 'p'));
System.out.println(name.equals("Harry"));
System.out.println(name.equalsIgnoreCase("HARRY"));
```

### Index

```text
Harry
01234
```

অর্থাৎ:

```text
H → 0
a → 1
r → 2
r → 3
y → 4
```

---

# 4. Escape Sequence

String-এর মধ্যে বিশেষ Character ব্যবহারের জন্য **Escape Sequence** ব্যবহার করা হয়।

| Escape | কাজ |
|---|---|
| `\n` | New Line |
| `\t` | Tab |
| `\'` | Single Quote |
| `\"` | Double Quote |
| `\\` | Backslash |

Example:

```java
System.out.println("Hello\nJava");
System.out.println("Hello\tJava");
```

---

# 5. Printing & Formatting

### `print()`

নতুন line তৈরি করে না।

```java
System.out.print("Hello");
```

### `println()`

Output-এর পরে নতুন line তৈরি করে।

```java
System.out.println("Hello");
```

### `printf()`

Formatted output-এর জন্য ব্যবহার করা হয়।

```java
int a = 6;
float b = 5.6454f;

System.out.printf("a = %d, b = %.2f", a, b);
```

Common format:

```text
%d → int
%f → float
%c → char
%s → String
```

---

# 6. String Practice Set

## Question 1

একটি String-কে lowercase করুন।

```java
String name = "JACK PARKER";
System.out.println(name.toLowerCase());
```

---

## Question 2

String-এর Space-গুলো `_` দিয়ে replace করুন।

```java
String text = "To My Friend";

System.out.println(text.replace(" ", "_"));
```

---

## Question 3 — Letter Template

```java
String letter = "Dear <|name|>, Thanks a lot!";

letter = letter.replace("<|name|>", "Sachin");

System.out.println(letter);
```

---

## Question 4 — Double & Triple Space

String-এ double বা triple space আছে কিনা check করুন।

```java
String text = "This string contains double and  triple spaces";

System.out.println(text.indexOf("  "));
System.out.println(text.indexOf("   "));
```

`-1` হলে ওই sequence পাওয়া যায়নি।

---

## Question 5 — Escape Sequence

নিচের Letter-টি সুন্দরভাবে format করুন:

```java
String letter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";

System.out.println(letter);
```

Output:

```text
Dear Harry,
    This Java Course is Nice.
Thanks!
```

---

# Practice Task

নিজে তৈরি করুন:

1. একটি String-এর length বের করুন।
2. String-কে Uppercase ও Lowercase করুন।
3. String-এর প্রথম ও শেষ Character বের করুন।
4. একটি নির্দিষ্ট Word replace করুন।
5. দুটি String `equals()` দিয়ে compare করুন।
6. একটি multiline message `\n` ও `\t` ব্যবহার করে তৈরি করুন।

---

## Next Lesson

### Class 07 — Conditional Statements

পরবর্তী Class-এ শিখব:

- `if`
- `if-else`
- `else-if`
- Relational Operators
- Logical Operators
- `switch-case`