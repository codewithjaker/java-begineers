# Class 30 — Date, Time, Calendar & DateTimeFormatter in Java

## 1. Date & Time in Java

Java-তে Date & Time নিয়ে কাজ করার জন্য প্রধানত:

```java
java.util
java.time
```

Java 8 থেকে `java.time` package চালু হয়, যা আধুনিক Date & Time handling-এর জন্য ব্যবহৃত হয়।

---

## 2. Java কীভাবে Date সংরক্ষণ করে?

Java-তে সময়কে `long` number হিসেবে milliseconds-এ প্রকাশ করা যায়।

Reference point:

```text
1 January 1970
```

`System.currentTimeMillis()` বর্তমান সময়ের milliseconds return করে।

```java
System.out.println(System.currentTimeMillis());
```

Milliseconds থেকে সময়ের হিসাব করা যায়:

```java
System.out.println(
    System.currentTimeMillis() / 1000 / 3600 / 24 / 365
);
```

### কেন `long` ব্যবহার করা নিরাপদ?

`long`-এর maximum value:

```java
Long.MAX_VALUE
```

প্রায়:

```text
9223372036854775807
```

তাই milliseconds রাখার জন্য `long` যথেষ্ট।

---

# 3. Date Class

`Date` class পাওয়া যায়:

```java
import java.util.Date;
```

### Current Date & Time

```java
Date d = new Date();
System.out.println(d);
```

### Milliseconds থেকে Date

```java
Date d1 = new Date(1621709639111L);
System.out.println(d1);
```

### গুরুত্বপূর্ণ Methods

| Method | কাজ |
|---|---|
| `getTime()` | 1 Jan 1970 থেকে milliseconds |
| `getDate()` | Date/day |
| `getYear()` | Year value |
| `getSeconds()` | Seconds |
| `compareTo()` | দুইটি Date compare করে |

> `Date`-এর কিছু পুরোনো methods deprecated; নতুন Java code-এ `java.time` API ব্যবহার করা বেশি উপযোগী।

---

# 4. Calendar Class

`Calendar` একটি **abstract class**।

তাই সরাসরি object তৈরি করা যায় না। ব্যবহার করা হয়:

```java
Calendar c = Calendar.getInstance();
```

### Date & Time তথ্য পাওয়া

```java
System.out.println(c.get(Calendar.YEAR));
System.out.println(c.get(Calendar.MONTH));
System.out.println(c.get(Calendar.DAY_OF_WEEK));
System.out.println(c.get(Calendar.HOUR_OF_DAY));
System.out.println(c.get(Calendar.MINUTE));
System.out.println(c.get(Calendar.SECOND));
```

### গুরুত্বপূর্ণ বিষয়

`Calendar.MONTH` এর indexing:

```text
January = 0
February = 1
...
December = 11
```

---

## 5. Calendar `add()`

কোনো Date/Time field পরিবর্তন করতে:

```java
c.add(Calendar.YEAR, 4);
```

৪ বছর যোগ:

```java
c.add(Calendar.YEAR, 4);
```

১২ বছর বিয়োগ:

```java
c.add(Calendar.YEAR, -12);
```

২ মাস যোগ:

```java
c.add(Calendar.MONTH, 2);
```

---

## 6. Calendar-এর আরও Methods

```java
c.getWeeksInWeekYear();
```

এক বছরে কত সপ্তাহ আছে তা দেয়।

```java
c.getMaximum(Calendar.WEEK_OF_YEAR);
```

কোনো field-এর maximum value দেয়।

---

# 7. GregorianCalendar

`GregorianCalendar` হলো `Calendar` class-এর একটি concrete subclass।

```java
GregorianCalendar cal = new GregorianCalendar();
```

Import:

```java
import java.util.GregorianCalendar;
```

### Leap Year Check

```java
System.out.println(cal.isLeapYear(2000));
System.out.println(cal.isLeapYear(2021));
```

Output:

```text
true
false
```

### `roll()`

নির্দিষ্ট field-কে এক unit করে পরিবর্তন করতে:

```java
cal.roll(Calendar.MONTH, true);
```

- `true` → এক ধাপ সামনে
- `false` → এক ধাপ পিছনে

### TimeZone

```java
import java.util.TimeZone;

System.out.println(TimeZone.getAvailableIDs()[0]);
```

---

# 8. `java.time` API

Java 8 থেকে আধুনিক Date & Time API:

```java
java.time
```

গুরুত্বপূর্ণ Classes:

- `Clock`
- `Duration`
- `LocalDate`
- `LocalTime`
- `LocalDateTime`

---

## 9. Clock

বর্তমান instant এবং time zone-এর তথ্যের জন্য `Clock` ব্যবহার করা হয়।

```java
Clock cl = Clock.systemDefaultZone();

System.out.println(cl.getZone());
```

UTC instant:

```java
Clock cl = Clock.systemUTC();

System.out.println(cl.instant());
```

---

# 10. Duration

দুইটি Time-এর মধ্যে duration বা সময়ের পার্থক্য বের করতে ব্যবহার করা হয়।

```java
Duration d =
    Duration.between(LocalTime.MIN, LocalTime.NOON);
```

### `isNegative()`

```java
System.out.println(d.isNegative());
```

### `isZero()`

```java
System.out.println(d.isZero());
```

---

# 11. LocalDate

শুধু **Date** রাখার জন্য:

```java
LocalDate d = LocalDate.now();

System.out.println(d);
```

Output format:

```text
2021-05-26
```

### Date Compare

```java
LocalDate d1 = LocalDate.parse("2021-05-26");
LocalDate d2 = LocalDate.parse("2021-05-26");

System.out.println(d1.equals(d2));
```

Output:

```text
true
```

### Year পরিবর্তন

```java
LocalDate d = LocalDate.parse("2021-05-27");

System.out.println(d.withYear(2001));
```

---

# 12. LocalTime

শুধু **Time** রাখার জন্য:

```java
LocalTime t = LocalTime.now();

System.out.println(t);
```

### Hours যোগ

```java
LocalTime t = LocalTime.of(13, 18, 29);

LocalTime t1 = t.plusHours(5);

System.out.println(t1);
```

### Minutes বিয়োগ

```java
LocalTime t1 = t.minusMinutes(8);

System.out.println(t1);
```

---

# 13. LocalDateTime

Date এবং Time একসাথে:

```java
LocalDateTime dt = LocalDateTime.now();

System.out.println(dt);
```

### Basic Example

```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();

        System.out.println(d);
        System.out.println(t);
        System.out.println(dt);
    }
}
```

---

# 14. DateTimeFormatter

নিজের প্রয়োজন অনুযায়ী Date/Time format করার জন্য:

```java
import java.time.format.DateTimeFormatter;
```

### Custom Format

```java
LocalDateTime dt = LocalDateTime.now();

DateTimeFormatter df =
    DateTimeFormatter.ofPattern("dd.MM.yyyy");

String myDate = dt.format(df);

System.out.println(myDate);
```

Output:

```text
26.05.2021
```

### আরও একটি Format

```java
DateTimeFormatter df =
    DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a");

System.out.println(dt.format(df));
```

---

## 15. গুরুত্বপূর্ণ Formatting Symbols

| Symbol | অর্থ |
|---|---|
| `yyyy` | Year |
| `MM` | Month |
| `dd` | Day |
| `E` | Day of week |
| `H` | Hour |
| `m` | Minute |
| `s` | Second |
| `a` | AM/PM |

Example:

```java
"dd/MM/yyyy"
```

Output:

```text
26/05/2021
```

---

## 16. Predefined Formatter

Java-তে কিছু predefined formatter আছে:

```java
DateTimeFormatter.ISO_LOCAL_DATE
```

```java
DateTimeFormatter.ISO_WEEK_DATE
```

```java
DateTimeFormatter.ISO_ORDINAL_DATE
```

Example:

```java
DateTimeFormatter df =
    DateTimeFormatter.ISO_LOCAL_DATE;

System.out.println(dt.format(df));
```

---

# Quick Revision

```text
Date              → পুরোনো Date API
Calendar          → Date/Time field নিয়ে কাজ
GregorianCalendar → Calendar-এর concrete class
LocalDate         → শুধু Date
LocalTime         → শুধু Time
LocalDateTime     → Date + Time
Duration           → Time difference
Clock              → Current instant/time zone
DateTimeFormatter → Date/Time format
```

### Practice

1. `LocalDate` দিয়ে বর্তমান Date print করুন।
2. `LocalTime` দিয়ে বর্তমান Time print করুন।
3. `LocalDateTime` দিয়ে Date + Time print করুন।
4. বর্তমান Date-কে `dd/MM/yyyy` format-এ দেখান।
5. বর্তমান Time থেকে ৫ ঘণ্টা যোগ করুন।
6. একটি Date-এর year পরিবর্তন করে দেখুন।
7. `GregorianCalendar` দিয়ে একটি Leap Year check করুন।
8. `HashSet` ও `DateTimeFormatter` ব্যবহার করে একটি ছোট program তৈরি করুন।

### Next Lesson

**Class 31 — Advanced Practice & Calculator Solution**