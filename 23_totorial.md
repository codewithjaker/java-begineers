# Java Tutorial — Class 22: Multithreading Fundamentals

## 1. Multithreading কী?

**Multithreading** হলো একই program-এর মধ্যে একাধিক thread একসাথে/concurrently execute করার ব্যবস্থা।

Multithreading ও Multiprocessing—দুটিই **Multitasking** অর্জনে ব্যবহৃত হয়।

### মূল ধারণা

- Threads shared memory area ব্যবহার করে।
- Thread হলো **lightweight**, আর Process হলো **heavyweight**।
- Thread switching তুলনামূলক দ্রুত।
- CPU utilization বাড়াতে Multithreading ব্যবহার করা হয়।

### Example

একটি Word Processor-এ:

- একটি thread → document edit করছে
- অন্য thread → background-এ document auto-save করছে

---

# 2. Without Threading vs With Threading

### Without Threading

```java
class ThreadExample {
    public static void main(String[] args) {
        Func1();
        Func2();
    }
}
```

এখানে `Func2()` শুরু হবে `Func1()` শেষ হওয়ার পরে।

```text
Func1()
   ↓
Func2()
```

### With Threading

```java
class Multi extends Thread {

    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        Multi func1 = new Multi();
        func1.start();

        Multi func2 = new Multi();
        func2.start();
    }
}
```

এখানে দুইটি thread concurrent execution-এর জন্য শুরু হয়।

```text
Thread 1 ────────►
Thread 2 ────────►
```

---

# 3. Java-তে Thread তৈরি করার ২টি উপায়

### Method 1
**Extending `Thread` class**

### Method 2
**Implementing `Runnable` interface**

---

# 4. Thread Class Extend করে Thread তৈরি

`Thread` class extend করে `run()` method override করতে হয়।

```java
class MyThread extends Thread {

    @Override
    public void run() {
        // Thread-এর code
    }
}
```

Thread চালু করতে:

```java
MyThread t1 = new MyThread();
t1.start();
```

### গুরুত্বপূর্ণ

`start()` method call করলে নতুন thread শুরু হয় এবং JVM `run()` method execute করে।

```java
class MyThread1 extends Thread {

    @Override
    public void run() {
        int i = 0;

        while (i < 10) {
            System.out.println("My Cooking Thread is Running");
            i++;
        }
    }
}

class MyThread2 extends Thread {

    @Override
    public void run() {
        int i = 0;

        while (i < 10) {
            System.out.println("Thread 2 for Chatting");
            i++;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}
```

---

# 5. Thread Life Cycle

একটি Thread সাধারণত নিচের states-এর মধ্য দিয়ে যায়:

1. **New** — Thread object তৈরি হয়েছে, কিন্তু `start()` করা হয়নি।
2. **Runnable** — `start()` হয়েছে এবং scheduler-এর জন্য অপেক্ষা করছে।
3. **Running** — Thread scheduler thread-টিকে execution-এর জন্য নির্বাচন করেছে।
4. **Non-runnable** — Thread alive, কিন্তু বর্তমানে run করার জন্য eligible নয়।
5. **Terminated** — `run()` method শেষ হয়েছে।

```text
New
 ↓
Runnable
 ↓
Running
 ↓
Terminated
```

---

# 6. Thread Constructors

`Thread` class-এর গুরুত্বপূর্ণ constructors:

```java
Thread()
Thread(String name)
Thread(Runnable r)
Thread(Runnable r, String name)
```

### Thread-এর Name ও ID

```java
MyThr t1 = new MyThr("Harry");

t1.start();

System.out.println(t1.getId());
System.out.println(t1.getName());
```

প্রধান methods:

- `start()`
- `getId()`
- `getName()`

---

# 7. Runnable Interface দিয়ে Thread তৈরি

Thread তৈরি করার দ্বিতীয় পদ্ধতি হলো **Runnable interface implement করা**।

### Steps

1. একটি class তৈরি করে `Runnable` implement করতে হবে।
2. `run()` method override করতে হবে।
3. Implementing class-এর object তৈরি করতে হবে।
4. সেই object `Thread` constructor-এ pass করতে হবে।
5. `start()` call করতে হবে।

### Example

```java
class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

public class Main {
    public static void main(String[] args) {

        MyThread obj = new MyThread();

        Thread t = new Thread(obj);

        t.start();
    }
}
```

এখানে:

```text
MyThread
   ↓
implements Runnable
   ↓
run()
   ↓
new Thread(obj)
   ↓
start()
```

`start()` call করলে `run()` method execute হয়।

---

# 8. Runnable vs Thread Class

| Thread Class | Runnable Interface |
|---|---|
| `extends Thread` | `implements Runnable` |
| Class-এর inheritance ব্যবহার করে | Interface ব্যবহার করে |
| অন্য class extend করা কঠিন/অসম্ভব | অন্য class extend করার সুযোগ থাকে |
| Thread object-এর সাথে কাজ করে | Runnable object আলাদাভাবে রাখা যায় |
| তুলনামূলক বেশি memory প্রয়োজন হতে পারে | Shared Runnable object ব্যবহার করা যায় |

Source অনুযায়ী, Java-তে multiple inheritance supported নয়, তাই কোনো class আগে থেকেই অন্য class extend করলে `Thread` extend করা সম্ভব নয়; এই কারণে `Runnable` approach সুবিধাজনক।

---

# Quick Revision

- **Multithreading** → একাধিক thread-এর concurrent execution।
- **Thread** → lightweight execution unit।
- Thread তৈরির প্রধান ২টি উপায়:
  1. `extends Thread`
  2. `implements Runnable`
- `run()` → Thread-এর কাজ নির্ধারণ করে।
- `start()` → Thread execution শুরু করে।
- Thread states → `New → Runnable → Running → Terminated`
- `getName()` → Thread-এর নাম।
- `getId()` → Thread-এর ID।
- `Runnable` ব্যবহার করলে class inheritance-এর flexibility বেশি থাকে।

## Practice Tasks

1. `Thread` class extend করে দুইটি thread তৈরি করো।
2. `Runnable` interface ব্যবহার করে দুইটি thread তৈরি করো।
3. Thread-এর `name` ও `id` print করো।
4. দুইটি thread দিয়ে দুই ধরনের message একসাথে print করো।
5. Thread Life Cycle-এর diagram আঁকো।

## Next Lesson

**Class 23 — Thread Priorities, Methods & Practice**