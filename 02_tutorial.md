# Java Tutorial — Class 02
## Variables, Data Types, Literals & User Input

### 1. Java Syntax

Java program লেখার কিছু নির্দিষ্ট নিয়ম আছে। এই নিয়মগুলোকে **Syntax** বলা হয়।

---

## 2. Variables

**Variable** হলো এমন একটি container যেখানে কোনো value store করা হয়।

```java
int number = 8;
```

এখানে:

- `int` → Data Type
- `number` → Variable Name
- `8` → Value

### Variable Naming Rules

- Digit দিয়ে শুরু করা যাবে না: `1number` ❌
- Case-sensitive: `age` এবং `Age` আলাদা
- Java Keyword ব্যবহার করা যাবে না
- Space ব্যবহার করা যাবে না
- Letter, digit, `_` এবং `$` ব্যবহার করা যায়

---

# 3. Data Types

Java একটি **Statically Typed Language**। অর্থাৎ Variable ব্যবহার করার আগে তার Data Type declare করতে হয়।

Java-এর Data Types দুই ধরনের:

1. **Primitive Data Types**
2. **Non-Primitive Data Types**

### Primitive Data Types

Java-তে ৮টি Primitive Data Type রয়েছে:

| Data Type | সাধারণ ব্যবহার |
|---|---|
| `byte` | ছোট পূর্ণসংখ্যা |
| `short` | ছোট/মাঝারি পূর্ণসংখ্যা |
| `int` | সাধারণ পূর্ণসংখ্যা |
| `long` | বড় পূর্ণসংখ্যা |
| `float` | Decimal value |
| `double` | বড়/নির্ভুল Decimal value |
| `char` | একটি Character |
| `boolean` | `true` / `false` |

### Example

```java
int age = 25;
long population = 5666666666666L;
float price = 5.6f;
double value = 4.66;
char grade = 'A';
boolean isStudent = true;
```

### Data Type নির্বাচন

কোন Data Type ব্যবহার করব তা নির্ভর করে আমরা কী ধরনের এবং কত বড় value store করতে চাই তার উপর।

---

# 4. Literals

কোনো Variable-এ সরাসরি যে constant value assign করা হয় তাকে **Literal** বলা হয়।

```text
101       → Integer Literal
10.1f     → Float Literal
10.1      → Double Literal
'A'       → Character Literal
true      → Boolean Literal
"Harry"   → String Literal
```

### Example

```java
byte age = 34;
int age2 = 56;
short age3 = 87;
long ageDino = 5666666666666L;

char ch = 'A';
float f1 = 5.6f;
double d1 = 4.66;

boolean a = true;
String str = "Harry";

System.out.println(age);
System.out.println(str);
```

---

# 5. Keywords

**Keywords** হলো Java-এর কিছু reserved word, যেগুলো Java Compiler-এর জন্য নির্দিষ্ট কাজ করে।

এসব word Variable বা অন্য Identifier হিসেবে ব্যবহার করা যায় না।

উদাহরণ:

```text
int
class
public
static
void
if
else
return
```

---

# 6. Taking User Input

Keyboard থেকে User-এর কাছ থেকে Input নেওয়ার জন্য Java-এর **Scanner Class** ব্যবহার করা হয়।

প্রথমে Scanner import করতে হবে:

```java
import java.util.Scanner;
```

তারপর Scanner object তৈরি করতে হবে:

```java
Scanner sc = new Scanner(System.in);
```

---

## Integer Input

```java
Scanner sc = new Scanner(System.in);

int a = sc.nextInt();

System.out.println(a);
```

## Float Input

```java
float a = sc.nextFloat();
```

## String Input

একটি word নেওয়ার জন্য:

```java
String str = sc.next();
```

একটি সম্পূর্ণ line নেওয়ার জন্য:

```java
String str = sc.nextLine();
```

---

# 7. Complete Example

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
```

---

# Practice Task

### Task 1
তিনটি Integer Input নিয়ে তাদের যোগফল বের করুন।

### Task 2
User-এর কাছ থেকে Name, Age এবং Marks নিয়ে Output দেখান।

### Task 3
নিচের Variable তৈরি করুন:

```text
int
float
double
char
boolean
String
```

এবং তাদের value print করুন।

---
