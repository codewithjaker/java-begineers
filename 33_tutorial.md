# Class 33 — JavaDocs & Documentation in Java

## 1. JavaDoc কী?

**JavaDoc** হলো Java source code থেকে automatically **HTML documentation** তৈরি করার একটি tool।

এটি **JDK-এর সাথে built-in** থাকে।

Documentation-এর মাধ্যমে:

- Code বুঝতে সহজ হয়
- Project maintain করা যায়
- অন্য Developer-কে code সম্পর্কে ধারণা দেওয়া যায়
- Knowledge transfer সহজ হয়

---

# 2. IntelliJ IDEA থেকে JavaDoc তৈরি

### Steps

1. Java project IntelliJ IDEA-তে খুলুন।
2. **Tools** menu-তে যান।
3. **Generate JavaDoc** নির্বাচন করুন।
4. Project ও প্রয়োজনীয় package select করুন।
5. কোন কোন class-এর documentation তৈরি হবে তা নির্বাচন করুন।
6. **Output directory** নির্বাচন করুন।
7. **OK** চাপুন।
8. নির্দিষ্ট folder-এ HTML documentation তৈরি হবে।

---

# 3. JavaDoc Comment

JavaDoc-এর জন্য বিশেষ **Documentation Comment** ব্যবহার করা হয়:

```java
/**
 * This is a documentation comment.
 */
```

সাধারণ comment:

```java
// Normal comment
```

JavaDoc comment:

```java
/**
 * JavaDoc comment
 */
```

---

# 4. JavaDoc Tags

গুরুত্বপূর্ণ JavaDoc tags:

| Tag | কাজ |
|---|---|
| `@author` | Author-এর নাম |
| `@version` | Version information |
| `@since` | কোন release/version থেকে |
| `@see` | Related documentation/reference |
| `@param` | Method parameter-এর তথ্য |
| `@return` | Return value-এর তথ্য |
| `@throws` | কোন exception throw হতে পারে |
| `@deprecated` | API deprecated |
| `{@code}` | Code format-এ text দেখায় |

---

# 5. Class Documentation Example

```java
/**
 * This class demonstrates JavaDoc.
 *
 * @author Harry
 * @version 0.1
 * @since 2002
 * @see <a href="https://docs.oracle.com/">
 * Java Documentation
 * </a>
 */
public class Main {

    public void add(int a, int b) {
        System.out.println("The sum is: " + (a + b));
    }
}
```

---

# 6. Method Documentation

Method-এর parameter, return value এবং exception document করতে:

```java
/**
 * Adds two numbers.
 *
 * @param i First number
 * @param j Second number
 * @return Sum of two numbers
 * @throws Exception if i is 0
 */
public int add(int i, int j) throws Exception {

    if (i == 0) {
        throw new Exception();
    }

    return i + j;
}
```

---

# 7. HTML JavaDoc-এর মধ্যে

JavaDoc-এর মধ্যে HTML tags ব্যবহার করা যায়।

Example:

```java
/**
 * <i>This is italic text.</i>
 *
 * <p>This is a new paragraph.</p>
 */
```

`{@code}` ব্যবহার:

```java
/**
 * Use {@code int} for integer values.
 */
```

এতে code-style text তৈরি হয়।

---

# 8. `@deprecated`

কোনো পুরোনো method ব্যবহার না করার নির্দেশ দিতে:

```java
/**
 * @deprecated Use + operator instead.
 */
public int add(int a, int b) {
    return a + b;
}
```

---

## Quick Revision

```text
JavaDoc
   ↓
Java Source Code
   ↓
Generate JavaDoc
   ↓
HTML Documentation
```

### সবচেয়ে গুরুত্বপূর্ণ Tags

```text
@author
@version
@since
@see
@param
@return
@throws
@deprecated
{@code}
```

### Practice

1. নিজের একটি `Student` class তৈরি করুন।
2. Class-এর জন্য JavaDoc লিখুন।
3. `@author`, `@version`, `@since` ব্যবহার করুন।
4. একটি method-এর জন্য `@param` ও `@return` লিখুন।
5. একটি method-এর জন্য `@throws` ব্যবহার করুন।
6. `{@code}` এবং HTML `<i>` tag ব্যবহার করে documentation তৈরি করুন।
7. IntelliJ IDEA থেকে JavaDoc generate করে HTML output দেখুন।

### Next Lesson

**Class 34 — Annotations in Java**