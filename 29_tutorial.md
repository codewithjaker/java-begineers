# Class 29 — Hashing & HashSet in Java

## 1. Hashing কী?

**Hashing** হলো এমন একটি technique যেখানে **key**-কে একটি **index**-এ convert করা হয়।

এক্ষেত্রে **Hash Function** ব্যবহার করে key থেকে index নির্ধারণ করা হয়।

### Example

```text
arr = [11, 33, 22, 14]

hashIndex = key % 10
```

যেমন:

```text
22 % 10 = 2
```

অর্থাৎ `22` → index `2`

---

## 2. Collision কী?

যখন দুই বা তার বেশি key একই index-এ map হয়, তখন তাকে **Collision** বলে।

### Example

```text
22 % 10 = 2
42 % 10 = 2
```

এখানে `22` এবং `42` একই index `2`-এ যাচ্ছে।

### Collision Handling Techniques

- **Open Addressing**
- **Chaining**

---

# 3. HashSet in Java

`HashSet` হলো Java-এর একটি **Set implementation**, যা hashing ব্যবহার করে element সংরক্ষণ করে।

### প্রধান বৈশিষ্ট্য

- Duplicate value রাখা যায় না।
- Insertion order preserve করে না।
- `null` value রাখা যায়।
- Search operation-এর জন্য উপযোগী।
- Duplicate check করার সময় `hashCode()` এবং `equals()` ব্যবহার করে।

```java
import java.util.HashSet;
```

---

## 4. HashSet Constructor

### Default Constructor

```java
HashSet<Integer> set = new HashSet<>();
```

### Initial Capacity ও Load Factor

```java
HashSet<Integer> set = new HashSet<>(6, 0.5f);
```

এখানে:

- `6` → initial capacity
- `0.5f` → load factor

আরও constructor:

```java
HashSet(int initialCapacity)
HashSet(int initialCapacity, float loadFactor)
HashSet(Collection<? extends E> c)
```

---

# 5. HashSet-এ Element যোগ করা

`add()` method ব্যবহার করা হয়।

```java
HashSet<Integer> myHashSet = new HashSet<>();

myHashSet.add(6);
myHashSet.add(8);
myHashSet.add(3);
myHashSet.add(11);
myHashSet.add(11);
```

শেষের `11` duplicate হওয়ায় দ্বিতীয়বার যোগ হবে না।

```text
[8, 3, 11, 6]
```

**মনে রাখুন:** HashSet-এর output order নির্দিষ্ট নয়।

---

# 6. Element Remove করা

`remove()` method ব্যবহার করা হয়।

```java
myHashSet.remove(3);
```

`3` থাকলে সেটি remove হবে।

```java
System.out.println(myHashSet);
```

---

# 7. HashSet Empty কিনা Check

`isEmpty()` একটি `boolean` value return করে।

```java
System.out.println(myHashSet.isEmpty());
```

Output:

```text
false
```

Empty HashSet হলে:

```text
true
```

---

# 8. সব Element Remove করা

`clear()` method ব্যবহার করা হয়।

```java
myHashSet.clear();
```

এর ফলে HashSet-এর সব element remove হবে।

```text
[]
```

---

# 9. HashSet-এর Size

`size()` method দিয়ে মোট element সংখ্যা জানা যায়।

```java
System.out.println(myHashSet.size());
```

Example:

```text
The size of myHashSet is : 6
```

---

## 10. Complete Example

```java
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Integer> myHashSet =
                new HashSet<>(6, 0.5f);

        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11);

        System.out.println(myHashSet);

        myHashSet.remove(3);

        System.out.println(myHashSet);

        System.out.println(myHashSet.isEmpty());

        System.out.println(myHashSet.size());

        myHashSet.clear();

        System.out.println(myHashSet);
    }
}
```

---

## Quick Revision

| Method | কাজ |
|---|---|
| `add()` | Element যোগ করে |
| `remove()` | Element remove করে |
| `isEmpty()` | Empty কিনা check করে |
| `clear()` | সব element remove করে |
| `size()` | Element সংখ্যা দেয় |
| `hashCode()` | Hash value তৈরি করতে ব্যবহৃত হয় |
| `equals()` | Object/value comparison করে |

### মনে রাখুন

**Hashing → Key → Hash Function → Index**

**HashSet → Unique Elements + Hashing**

---

## Practice

1. একটি `HashSet<String>` তৈরি করে ৫টি নাম যোগ করুন।
2. একই নাম দুইবার যোগ করে দেখুন কী হয়।
3. একটি নির্দিষ্ট নাম `remove()` করুন।
4. `isEmpty()` দিয়ে HashSet check করুন।
5. `size()` দিয়ে element সংখ্যা বের করুন।
6. `clear()` ব্যবহার করে সব element remove করুন।

### Next Lesson

**Class 30 — Date, Time, Calendar & DateTimeFormatter in Java**