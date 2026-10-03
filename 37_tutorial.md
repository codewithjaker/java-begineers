# Class 37 — File Handling in Java

## 1. File Handling কী?

**File Handling** হলো program-এর মাধ্যমে file তৈরি, লেখা, পড়া ও delete করার কাজ।

Java-তে File Handling-এর জন্য প্রধানত `java.io` package ব্যবহার করা হয়।

```java id="a1"
import java.io.File;
```

### Common Operations

1. Create a file
2. Write to a file
3. Read a file
4. Delete a file

---

# 2. File Object তৈরি

```java id="a2"
File myFile = new File("cwh111file.txt");
```

এখানে `File` object-এর মাধ্যমে file-এর সাথে কাজ করা হয়।

---

# 3. নতুন File তৈরি

`createNewFile()` method ব্যবহার করা হয়।

```java id="a3"
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File myFile = new File("cwh111file.txt");

        try {
            myFile.createNewFile();
            System.out.println("File created successfully.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### Key Method

```java id="a4"
createNewFile()
```

---

# 4. File-এ Write করা

File-এ data লেখার জন্য `FileWriter` এবং `write()` method ব্যবহার করা হয়।

```java id="a5"
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter =
                new FileWriter("cwh111file.txt");

            fileWriter.write(
                "This is our first file.\n"
                + "Keep learning, Keep coding!"
            );

            fileWriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### গুরুত্বপূর্ণ

কাজ শেষ হলে:

```java id="a6"
fileWriter.close();
```

করতে হবে।

---

# 5. File থেকে Read করা

File পড়ার জন্য `Scanner` ব্যবহার করা যায়।

```java id="a7"
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File myFile = new File("cwh111file.txt");

        try {
            Scanner sc = new Scanner(myFile);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }

            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

### গুরুত্বপূর্ণ Methods

```java id="a8"
hasNextLine()
nextLine()
```

- `hasNextLine()` → আরও line আছে কিনা check করে
- `nextLine()` → পরবর্তী line পড়ে

---

# 6. File Delete করা

`delete()` method ব্যবহার করে file delete করা যায়।

```java id="a9"
import java.io.File;

public class Main {
    public static void main(String[] args) {

        File myFile =
            new File("cwh111file.txt");

        if (myFile.delete()) {
            System.out.println(
                "I have deleted: " + myFile.getName()
            );
        }
        else {
            System.out.println(
                "Some problem occurred while deleting the file"
            );
        }
    }
}
```

### গুরুত্বপূর্ণ Methods

```java id="a10"
delete()
getName()
```

---

# 7. File Handling-এর Flow

```text id="a11"
File
 │
 ├── createNewFile()
 │
 ├── FileWriter → write()
 │
 ├── Scanner → read
 │
 └── delete()
```

---

## Quick Revision

| Operation | Class/Method |
|---|---|
| File Object | `File` |
| Create | `createNewFile()` |
| Write | `FileWriter`, `write()` |
| Read | `Scanner`, `nextLine()` |
| Check next line | `hasNextLine()` |
| Delete | `delete()` |
| File name | `getName()` |
| Close Writer | `close()` |

### Important Imports

```java id="a12"
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
```

---

## Practice

1. `student.txt` নামে একটি file তৈরি করুন।
2. File-এ ৫ জন Student-এর নাম লিখুন।
3. `Scanner` দিয়ে file-এর সব নাম পড়ুন।
4. File-এর প্রতিটি line print করুন।
5. `getName()` ব্যবহার করে file-এর নাম দেখান।
6. শেষে `delete()` ব্যবহার করে file delete করুন।
7. File তৈরি বা read করার সময় `try-catch` ব্যবহার করুন।

### Next Lesson

**Class 38 — Advanced Java Practice**