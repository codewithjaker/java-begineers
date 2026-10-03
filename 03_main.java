// -----------------------------------------------------------------------
// _06_hasNext_method.java
// -----------------------------------------------------------------------

import java.util.Scanner;

public class _06_hasNext_method {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();           // a will have an int
        // if you enter a non-int val in case of .nextInt(), compiler will throw an error
        boolean b = sc.hasNextInt();    // b is true if you enter int, false if you enter a non-int val
        // however, whatever input you enter in case of .hasNextInt(), the compiler will not throw any error
        // hasNext() method is used to check the validity of an expression
        System.out.println("The value in a is: "+a);
        System.out.println("b has an int value: "+b);
    }
}

// -----------------------------------------------------------------------
// _07_taking_string_as_an_input.java
// -----------------------------------------------------------------------

import java.util.Scanner;

public class _07_taking_string_as_an_input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter string s1:");
//        String s1 = sc.next();      // .next() takes first continuous string of characters without whitespaces
//        System.out.println("The string in s1 is: "+s1);

        System.out.println("Enter string s2:");
        String s2 = sc.nextLine();  // .nextLine() takes first line of characters with whitespaces
        // though if .next() was called right before it, .nextLine() doesn't get called (check line 16)
        System.out.println("The string in s2 is: "+s2);
    }
}
// That's because the .next() method does not read the newline character in your input created by
// hitting "Enter", and so the call to .nextLine() returns after reading that newline
// workaround: place a .nextLine() after every next() method to consume the nextline thrown in after pressing "Enter"

