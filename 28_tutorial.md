# Java Tutorial — Class 28: ArrayList, LinkedList & ArrayDeque

## 1. ArrayList

`ArrayList` হলো `java.util` package-এর একটি **dynamic array**।

Normal Array-এর size fixed, কিন্তু `ArrayList` প্রয়োজন অনুযায়ী size বাড়াতে বা কমাতে পারে।

```java
ArrayList<Integer> l1 = new ArrayList<>();
```

### গুরুত্বপূর্ণ Methods

#### `add()`

শেষে element যোগ:

```java
l1.add(10);
```

নির্দিষ্ট index-এ যোগ:

```java
l1.add(2, 20);
```

#### `remove()`

নির্দিষ্ট index-এর element remove:

```java
l1.remove(0);
```

#### `contains()`

কোনো element আছে কি না check:

```java
l1.contains(4);
```

Result:

```text
true / false
```

#### `addAll()`

একটি ArrayList-এর elements অন্যটিতে যোগ:

```java
l1.addAll(l2);
```

শুরুতে যোগ করতে:

```java
l1.addAll(0, l2);
```

#### `indexOf()`

প্রথম occurrence-এর index:

```java
l1.indexOf(3);
```

না থাকলে:

```text
-1
```

#### `lastIndexOf()`

শেষ occurrence-এর index:

```java
l1.lastIndexOf(3);
```

### Example

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);

        l1.add(2, 10);

        System.out.println(l1);
        System.out.println(l1.contains(3));
        System.out.println(l1.indexOf(3));
    }
}
```

---

# 2. LinkedList

`LinkedList` একটি **doubly linked list** data structure।

প্রতিটি element একটি **Node**, যেখানে পরবর্তী এবং পূর্ববর্তী node-এর reference থাকে।

### LinkedList-এর বৈশিষ্ট্য

- Insertion/Deletion-এর ক্ষেত্রে সুবিধাজনক।
- Random access-এর জন্য ArrayList বেশি সুবিধাজনক।
- LinkedList-এ নির্দিষ্ট element access করতে traversal প্রয়োজন হয়।

### ArrayList vs LinkedList

| ArrayList | LinkedList |
|---|---|
| Random access ভালো | Random access ধীর |
| Access বেশি হলে উপযোগী | Frequent insertion/deletion-এর ক্ষেত্রে উপযোগী |
| Dynamic array | Doubly linked list |

---

## 3. LinkedList Methods

### `add()`

```java
l1.add(11);
```

নির্দিষ্ট index:

```java
l1.add(2, 20);
```

### `remove()`

```java
l1.remove(2);
```

### `set()`

Existing element পরিবর্তন:

```java
l1.set(2, 100);
```

### `addFirst()`

শুরুতে element যোগ:

```java
l1.addFirst(10);
```

### `addLast()`

শেষে element যোগ:

```java
l1.addLast(100);
```

### `addAll()`

```java
l1.addAll(0, l2);
```

### অন্যান্য গুরুত্বপূর্ণ Methods

```java
l1.contains(27);
l1.indexOf(6);
l1.lastIndexOf(6);
l1.get(2);
l1.size();
l1.clear();
```

### Example

```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(6);
        l1.add(7);
        l1.add(4);

        l1.addFirst(1);
        l1.addLast(100);

        l1.set(1, 566);

        System.out.println(l1);
    }
}
```

---

# 4. ArrayDeque

`ArrayDeque` হলো **Resizable Array + Deque**।

Deque = **Double Ended Queue**

অর্থাৎ দুই দিক থেকেই element add/remove করা যায়।

```java
ArrayDeque<Integer> ad1 = new ArrayDeque<>();
```

### প্রধান সুবিধা

- Front থেকে add/remove করা যায়।
- Rear/End থেকেও add/remove করা যায়।
- Queue ও Deque-এর functionality ব্যবহার করা যায়।

---

# 5. ArrayDeque-তে Element Add

### Front

```java
ad1.addFirst(10);
ad1.offerFirst(20);
```

### End

```java
ad1.addLast(30);
ad1.offerLast(40);
```

সাধারণ:

```java
ad1.add(50);
```

---

# 6. ArrayDeque থেকে Element Access

### First Element

```java
ad1.getFirst();
ad1.peekFirst();
```

### Last Element

```java
ad1.getLast();
ad1.peekLast();
```

---

# 7. ArrayDeque থেকে Element Remove

### First Element

```java
ad1.removeFirst();
ad1.pollFirst();
```

### Last Element

```java
ad1.removeLast();
ad1.pollLast();
```

### `remove` vs `poll`

Empty deque হলে:

- `removeFirst()` → exception দিতে পারে
- `pollFirst()` → `null` return করে

একইভাবে `removeLast()` ও `pollLast()`-এর ক্ষেত্রেও এই পার্থক্য মনে রাখতে হবে।

---

## 8. ArrayDeque Example

```java
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();

        ad1.add(6);
        ad1.add(56);
        ad1.add(9);

        ad1.addFirst(5);

        System.out.println(ad1);

        System.out.println("First: " + ad1.getFirst());
        System.out.println("Last: " + ad1.getLast());

        ad1.removeFirst();
        ad1.removeLast();

        System.out.println(ad1);
    }
}
```

---

# Quick Revision

### ArrayList

```text
Dynamic Array
↓
add()
remove()
contains()
addAll()
indexOf()
lastIndexOf()
```

### LinkedList

```text
Doubly Linked List
↓
add()
remove()
set()
addFirst()
addLast()
get()
```

### ArrayDeque

```text
Double Ended Queue
↓
addFirst()
addLast()
removeFirst()
removeLast()
peekFirst()
peekLast()
```

## কখন কোনটি?

- **ArrayList** → Random access বেশি প্রয়োজন হলে
- **LinkedList** → Frequent insertion/deletion-এর ক্ষেত্রে
- **ArrayDeque** → দুই দিক থেকে Queue operation দরকার হলে

## Practice Tasks

1. একটি `ArrayList<Integer>` তৈরি করে 10টি সংখ্যা যোগ করো।
2. `contains()`, `indexOf()` এবং `lastIndexOf()` ব্যবহার করো।
3. দুইটি `ArrayList` `addAll()` দিয়ে merge করো।
4. একটি `LinkedList` তৈরি করে `addFirst()` ও `addLast()` ব্যবহার করো।
5. `set()` দিয়ে একটি element পরিবর্তন করো।
6. `ArrayDeque`-এ front ও rear—দুই দিক থেকে element add/remove করো।

## Next Lesson

**Class 29 — Hashing & HashSet**