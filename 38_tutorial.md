# Class 38 — Advanced Java Practice Set 2

## Question 1 — `@Deprecated`

একটি class ও method তৈরি করে `@Deprecated` annotation ব্যবহার করুন।

```java id="a1"
class MyDeprecated {

    @Deprecated
    void meth1() {
        System.out.println("I am method 1");
    }
}

public class Main {
    public static void main(String[] args) {

        MyDeprecated d = new MyDeprecated();
        d.meth1();
    }
}
```

Output:

```text id="a2"
I am method 1
```

### Effect

`@Deprecated` program execution বন্ধ করে না।

Deprecated method/class ব্যবহার করলে **compiler warning** generate করে।

---

# Question 2 — Warning Suppress করা

`@SuppressWarnings("deprecation")` ব্যবহার করে warning suppress করুন।

```java id="a3"
class MyDeprecated {

    @Deprecated
    void meth1() {
        System.out.println("I am method 1");
    }
}

public class Main {
    public static void main(String[] args) {

        @SuppressWarnings("deprecation")
        MyDeprecated d = new MyDeprecated();

        d.meth1();
    }
}
```

### Key Concept

```text id="a4"
@Deprecated
     ↓
Compiler Warning
     ↓
@SuppressWarnings("deprecation")
     ↓
Warning Suppressed
```

---

# Question 3 — Interface-এর Instance তৈরি

Functional Interface-এর implementation Lambda Expression দিয়ে করা যায়।

```java id="a5"
interface MyInt {
    void display();
}

public class Main {
    public static void main(String[] args) {

        MyInt i =
            () -> System.out.println("I am display");

        i.display();
    }
}
```

Output:

```text id="a6"
I am display
```

### Key Concept

```java id="a7"
MyInt i = () -> ...;
```

এখানে Lambda Expression `MyInt` interface-এর `display()` method implement করছে।

---

# Question 4 — Multiplication Table File-এ Write

একটি number-এর multiplication table তৈরি করে file-এ লিখুন।

```java id="a8"
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        int i = 19;
        String table = "";

        for (int j = 0; j < 10; j++) {

            table += i + " X " +
                     (j + 1) + " = " +
                     i * (j + 1);

            table += "\n";
        }

        try {

            FileWriter fileWriter =
                new FileWriter("MultiplicationTable.txt");

            fileWriter.write(table);
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

File তৈরি হবে:

```text id="a9"
MultiplicationTable.txt
```

এর মধ্যে থাকবে:

```text id="a10"
19 X 1 = 19
19 X 2 = 38
19 X 3 = 57
...
19 X 10 = 190
```

---

## Quick Revision

| Topic | মূল বিষয় |
|---|---|
| `@Deprecated` | Deprecated API mark করে |
| `@SuppressWarnings` | Compiler warning suppress করে |
| Lambda | Functional Interface implement করতে পারে |
| `FileWriter` | File-এ data লেখে |
| `write()` | Content লিখে |
| `close()` | Writer বন্ধ করে |
| `IOException` | File operation-এর exception handle করে |

### Practice

1. `@Deprecated` দিয়ে একটি method তৈরি করুন।
2. `@SuppressWarnings("deprecation")` ব্যবহার করুন।
3. একটি Functional Interface তৈরি করে Lambda দিয়ে implement করুন।
4. `5` থেকে `20` পর্যন্ত যেকোনো একটি multiplication table file-এ লিখুন।
5. `Scanner` ব্যবহার করে file থেকে সেই table পড়ে print করুন।
6. User-এর দেওয়া number অনুযায়ী multiplication table file-এ save করুন।

### Next Lesson

**Class 39 — Final Exercise & Java Course Review**