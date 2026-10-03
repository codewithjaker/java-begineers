
# Java Tutorial — Class 27: Collections Framework & Documentation

## 1. Collection Framework কী?

**Collection Framework** হলো Java-এর এমন একটি system যেখানে বিভিন্ন ধরনের objects/data efficiently store ও manipulate করার জন্য বিভিন্ন **Classes ও Interfaces** রয়েছে।

### কেন Collection ব্যবহার করব?

Array ব্যবহার করলে অনেক ক্ষেত্রে সীমাবদ্ধতা থাকে। যেমন:

- Array-এর size পরিবর্তন করা
- মাঝখানে element insert করা
- Element delete করা
- Data-এর উপর বিভিন্ন operation করা

Collection Framework এসব কাজ সহজ করে।

---

# 2. Common Collections

Java-তে বহুল ব্যবহৃত কিছু Collection:

### ArrayList

Variable-size collection-এর জন্য ব্যবহার করা হয়।

```java id="i8q8dv"
ArrayList<Integer> numbers = new ArrayList<>();
```

### Set

**Distinct/unique elements** রাখার জন্য ব্যবহার করা হয়।

```java id="n7t9jc"
Set<Integer> numbers = new TreeSet<>();
```

### Stack

**LIFO (Last In, First Out)** data structure।

```text id="z6qv3f"
Last item
   ↓
  First Out
```

### HashMap

**Key-Value pair** সংরক্ষণের জন্য ব্যবহার করা হয়।

```text id="w8h3ts"
Key → Value
```

---

# 3. `java.util` Package

Collections Framework-এর গুরুত্বপূর্ণ classes/interfaces `java.util` package-এর মধ্যে পাওয়া যায়।

Example:

```java id="8f4j1p"
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
```

অথবা:

```java id="6q5zxr"
import java.util.*;
```

---

# 4. Collections Class

Java-এর `Collections` class-এ data manipulate করার জন্য বিভিন্ন **static methods** রয়েছে।

যেমন:

- Sorting
- Searching
- অন্যান্য collection operations

---

# 5. Collection-এর Basic ধারণা

```text id="n8x0oc"
Java Collections
       │
       ├── ArrayList
       ├── Set
       ├── Stack
       └── HashMap
```

### মনে রাখবে

- **ArrayList** → Variable-size collection
- **Set** → Distinct/unique collection
- **Stack** → LIFO
- **HashMap** → Key-Value pair
- **Collections** → Collection-এর উপর বিভিন্ন utility operation

---

# 6. Java Documentation

Java-এর কোনো class, interface বা method কীভাবে কাজ করে তা জানার জন্য **Java Documentation (JavaDocs)** ব্যবহার করা হয়।

Documentation থেকে সাধারণত জানা যায়:

- Class কী কাজ করে
- কোন methods আছে
- Method-এর parameters
- Return type
- Constructor
- ব্যবহারের নিয়ম

### Practice

Java Documentation ব্যবহার করে নিচের বিষয়গুলো খুঁজে দেখো:

1. `ArrayList`
2. `Set`
3. `TreeSet`
4. `HashMap`
5. `Collections`

## Quick Revision

```text id="7gk9ad"
Collection Framework
        ↓
Data Store + Manipulation
        ↓
ArrayList / Set / Stack / HashMap
```

**Next Lesson:**  
**Class 28 — ArrayList, LinkedList & ArrayDeque**