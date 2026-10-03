# Java Tutorial — Class 18: Interfaces, Default Methods & Polymorphism

## 1. Default Methods in Interface

Java 8 থেকে Interface-এ `default` ও `static` methods ব্যবহার করা যায়।

**Default Method-এর সুবিধা:**
- Existing interface-এ নতুন functionality যোগ করা যায়।
- Implementing class-কে default method অবশ্যই implement করতে হয় না।
- Default method চাইলে override করা যায়।
- Default method-এর ভিতরের common কাজের জন্য `private` method ব্যবহার করা যায়।

### Example

```java
interface Animal {
    default void say() {
        System.out.println("Hello, this is default method");
    }

    void bark();
}

public class CWH implements Animal {

    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }

    public static void main(String[] args) {
        CWH obj1 = new CWH();

        obj1.bark();
        obj1.say();
    }
}
```

**Output:**
```text
Dog barks!
Hello, this is default method
```

### Important

```java
private void greet() {
    System.out.println("Good Morning");
}

default void record4KVideo() {
    greet();
    System.out.println("Recording in 4k...");
}
```

`private` interface method বাইরে থেকে সরাসরি call করা যায় না। এটি interface-এর ভিতরের helper method হিসেবে কাজ করে।

---

## 2. Inheritance in Interfaces

একটি interface অন্য interface-কে `extends` করতে পারে।

```java
interface Interface1 {
    void meth1();
}

interface Interface2 extends Interface1 {
    void meth2();
}
```

এখানে `Interface2`-এর মধ্যে `Interface1`-এর method-ও থাকবে।

### Important Rule

> Interface অন্য Interface-কে **extend** করে।  
> Class Interface-কে **implement** করে।

### Example

```java
interface SampleInterface {
    void meth1();
    void meth2();
}

interface ChildSampleInterface extends SampleInterface {
    void meth3();
    void meth4();
}

class MySampleClass implements ChildSampleInterface {

    public void meth1() {
        System.out.println("meth1");
    }

    public void meth2() {
        System.out.println("meth2");
    }

    public void meth3() {
        System.out.println("meth3");
    }

    public void meth4() {
        System.out.println("meth4");
    }
}
```

---

## 3. Polymorphism in Interfaces

Interface reference দিয়ে implementing class-এর object রাখা যায়।

```java
MyCamera2 cam1 = new MySmartPhone2();
```

এখানে object হলো `MySmartPhone2`, কিন্তু reference type হলো `MyCamera2`।

তাই `cam1` শুধু `MyCamera2`-তে থাকা accessible methods ব্যবহার করতে পারবে।

```java
cam1.record4KVideo();
```

কিন্তু:

```java
// cam1.getNetworks();   // Error
// cam1.sampleMeth();    // Error
```

কারণ এই methods `MyCamera2` interface-এ নেই।

অন্যদিকে:

```java
MySmartPhone2 s = new MySmartPhone2();

s.sampleMeth();
s.recordVideo();
s.getNetworks();
s.callNumber(7979);
```

এখানে `s` হলো `MySmartPhone2` reference, তাই class-এর accessible methods ব্যবহার করা যায়।

### মূল ধারণা

```java
InterfaceReference obj = new ImplementingClass();
```

**Object-এর actual type** এবং **reference type** আলাদা হতে পারে। এটিই Interface-এর মাধ্যমে Polymorphism-এর গুরুত্বপূর্ণ ব্যবহার।

---

# 4. Practice Set — Abstract Classes & Interfaces

### Q1
একটি abstract class `Pen` তৈরি করো যেখানে:

```java
write()
refill()
```

abstract methods থাকবে।

### Q2
`Pen` থেকে `FountainPen` class তৈরি করো এবং অতিরিক্ত:

```java
changeNib()
```

method যোগ করো।

### Q3
`Monkey` class তৈরি করো:

```java
jump()
bite()
```

এরপর `Human` class তৈরি করে `Monkey`-কে inherit করো এবং `BasicAnimal` interface implement করো।

`BasicAnimal`-এ থাকবে:

```java
eat()
sleep()
```

### Q4
একটি abstract `Telephone` class তৈরি করো এবং abstract methods:

```java
ring()
lift()
disconnect()
```

রাখো। এরপর `SmartTelephone` তৈরি করো।

### Q5
`Monkey` ও `Human` ব্যবহার করে Interface/Class reference-এর মাধ্যমে Polymorphism demonstrate করো।

```java
Monkey m1 = new Human();
```

### Q6
`TVRemote` interface তৈরি করো এবং `SmartTVRemote` interface-কে `TVRemote` থেকে extend করো।

### Q7
`TV` class তৈরি করে `TVRemote` interface implement করো।

---

## Quick Revision

- `default` method Interface-এ method body রাখতে পারে।
- Java 8 থেকে default methods এসেছে।
- Default method implement করা বাধ্যতামূলক নয়।
- Default method override করা যায়।
- Interface → Interface = `extends`
- Class → Interface = `implements`
- Interface reference দিয়ে Polymorphism করা যায়।
- Reference type নির্ধারণ করে কোন methods সরাসরি ব্যবহার করা যাবে।
- Actual object type নির্ধারণ করে কোন implementation execute হবে।
- Interface-এর `private` method বাইরে থেকে access করা যায় না।

## Next Lesson

**Class 19 — OOP Exercise & Review**