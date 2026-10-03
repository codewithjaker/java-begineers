# Class 34 — Annotations in Java

## 1. Annotation কী?

**Annotations** হলো Java class/method সম্পর্কে **metadata** দেওয়ার একটি ব্যবস্থা।

Annotation সাধারণত `@` দিয়ে শুরু হয়।

```java
@Override
```

Annotations compiler-কে কিছু তথ্য দিতে এবং বিভিন্ন ভুল শনাক্ত করতে সাহায্য করে।

---

# 2. `@Override`

`@Override` নিশ্চিত করে যে subclass-এর method সত্যিই parent class-এর method **override** করছে।

Typo বা spelling mistake হলে compiler error দেখায়।

### Example

```java
class KeyPadPhone {
    void sendMessage() {
        System.out.println("Text message sent!");
    }
}

class AndroidPhone extends KeyPadPhone {

    @Override
    void sendMessage() {
        System.out.println("Message sent via WhatsApp!");
    }
}

public class Main {
    public static void main(String[] args) {

        AndroidPhone phone = new AndroidPhone();

        phone.sendMessage();
    }
}
```

Output:

```text
Message sent via WhatsApp!
```

### মূল কথা

```text
Parent Method
      ↓
Subclass Method
      ↓
@Override
      ↓
Compiler checks overriding
```

---

# 3. `@Deprecated`

কোনো method বা API আর ব্যবহার না করার জন্য `@Deprecated` ব্যবহার করা হয়।

```java
class KeyPadPhone {

    @Deprecated
    void sendMessage() {
        System.out.println("Text message sent!");
    }
}
```

Deprecated method ব্যবহার করলে compiler warning দিতে পারে।

```text
Deprecated → Warning
```

ভবিষ্যতের version-এ deprecated API remove হতে পারে।

---

# 4. `@SuppressWarnings`

Compiler-এর নির্দিষ্ট warning suppress করতে:

```java
@SuppressWarnings("deprecation")
```

Example:

```java
public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        // Deprecated method ব্যবহার
    }
}
```

এক্ষেত্রে deprecation warning দেখানো হবে না।

---

# 5. `@FunctionalInterface`

যে interface-এ **একটি abstract method** থাকে তাকে Functional Interface বলা হয়।

`@FunctionalInterface` compiler-কে নিশ্চিত করতে সাহায্য করে যে interface-এ একটির বেশি abstract method নেই।

### Correct Example

```java
@FunctionalInterface
interface MyFunctionalInterface {
    void method1();
}
```

### ভুল Example

```java
@FunctionalInterface
interface MyFunctionalInterface {

    void method1();
    void method2();
}
```

এখানে error হবে, কারণ interface-এ একাধিক abstract method রয়েছে।

```text
Unexpected @FunctionalInterface annotation
```

---

# 6. Combined Example

```java
@FunctionalInterface
interface MyFunctionalInterface {
    void thisMethod();
}

class NewPhone extends Phone {

    @Override
    public void showTime() {
        System.out.println("Time is 8PM");
    }

    @Deprecated
    public int sum(int a, int b) {
        return a + b;
    }
}

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        NewPhone phone = new NewPhone();

        phone.showTime();
        phone.sum(5, 6);
    }
}
```

---

## Quick Revision

| Annotation | কাজ |
|---|---|
| `@Override` | Method overriding check করে |
| `@Deprecated` | পুরোনো API/method হিসেবে mark করে |
| `@SuppressWarnings` | Compiler warning suppress করে |
| `@FunctionalInterface` | Functional interface নিশ্চিত করে |

### মনে রাখুন

```text
@Override
→ Override check

@Deprecated
→ Deprecated API

@SuppressWarnings
→ Warning hide/suppress

@FunctionalInterface
→ One abstract method
```

---

## Practice

1. একটি parent class ও child class তৈরি করে `@Override` ব্যবহার করুন।
2. একটি method-কে `@Deprecated` করুন।
3. `@SuppressWarnings("deprecation")` ব্যবহার করে warning suppress করুন।
4. একটি `@FunctionalInterface` তৈরি করুন।
5. Functional Interface-এ দুইটি abstract method দিয়ে compiler error দেখুন।
6. চারটি annotation-এর ব্যবহার আলাদাভাবে practice করুন।

### Next Lesson

**Class 35 — Anonymous Classes & Lambda Expressions**