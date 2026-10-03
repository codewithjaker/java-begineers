# Java Tutorial — Class 08
## Project: Rock, Paper, Scissors Game

এই Project-এ আমরা **Conditional Statements, User Input এবং Random** ব্যবহার করে একটি simple Rock, Paper, Scissors Game তৈরি করব।

---

## 1. Game Rules

তিনটি Choice:

```text
1 → Rock
2 → Paper
3 → Scissors
```

### Winning Rules

```text
Rock     beats Scissors
Paper    beats Rock
Scissors beats Paper
```

একই Choice হলে:

```text
Draw
```

---

## 2. Program Logic

```text
User Choice
     ↓
Computer Random Choice
     ↓
Compare Both Choices
     ↓
Winner / Loser / Draw
```

---

## 3. Java Code

```java
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        System.out.print("Enter your choice: ");
        int user = sc.nextInt();

        int computer = random.nextInt(3) + 1;

        System.out.println("Computer choice: " + computer);

        if (user == computer) {
            System.out.println("Draw!");
        }
        else if (
            (user == 1 && computer == 3) ||
            (user == 2 && computer == 1) ||
            (user == 3 && computer == 2)
        ) {
            System.out.println("You Win!");
        }
        else {
            System.out.println("Computer Wins!");
        }
    }
}
```

---

## 4. Important Concepts

এই Project-এ আমরা ব্যবহার করেছি:

- `Scanner` → User Input নেওয়ার জন্য
- `Random` → Computer-এর random choice তৈরি করতে
- `if-else` → Winner নির্ধারণ করতে
- `&&` → Multiple conditions
- `||` → Alternative conditions
- Variables → Choice store করতে

### Random Number

```java
int computer = random.nextInt(3) + 1;
```

এটি `1`, `2` অথবা `3` তৈরি করবে।

---

# Practice Task

1. `1, 2, 3` এর পরিবর্তে User-কে `Rock`, `Paper`, `Scissors` input দেওয়ার ব্যবস্থা করুন।
2. User এবং Computer-এর actual choice (`Rock`, `Paper`, `Scissors`) দেখান।
3. Game-এ **5 rounds** যোগ করুন।
4. শেষে Score দেখান।

---

## Next Lesson

### Class 09 — Loops in Java

পরবর্তী Class-এ শিখব:

- `while` loop
- `do-while` loop
- `for` loop
- `break`
- `continue`