// -----------------------------------------------------------------------
// _03_literals_in_java.java
// -----------------------------------------------------------------------
public class _03_literals_in_java {
    public static void main(String[] args) {

        byte b = 99;                    // can have only up to two digits
        int i = 999999999;              // can have up to nine digits
        short s = 9999;                 // can have only up to four digits
        long l = 999999999999999999l;   // can have up to 18 digits, suffixed with l or L

        float f = 3;                    // is 3.0
//      float f1 = 3.0;                 // gives error as decimals in java are by default double
        float f1 = 3.0f;                // so we use suffix f or F
        System.out.println(f);

        double d = 3;                   // is also 3.0
        double d1 = 3.0;                // valid without the suffix since decimals are by default double
        double d2 = 3.0d;               // is also 3.0, same as 3.0D
        System.out.println(d);

        boolean t = true;               // booleans can have true or false
        System.out.println(t);          // will print: true

        String str = "Boom. You looking for this?";     // string literal
        System.out.println(str);
    }
}


// -----------------------------------------------------------------------
// _04_taking_input_from_user.java
// -----------------------------------------------------------------------

import java.util.Scanner;                           // importing the scanner class to take input

public class _04_taking_input_from_user {
    public static void main(String[] args){
        System.out.println("Taking input from the user:");

        Scanner sc = new Scanner(System.in);    // creating an object sc to use functions of class Scanner
        // System.in to assign what function sc will perform: it will take input from the console

        System.out.println("Enter num1: ");
        int a = sc.nextInt();       // taking an integer as input and placing it in integer variable a
        // .nextInt() to take an integer as input, similarly, .next(), .nextByte(), .nextFloat(), etc.

        System.out.println("Enter num2: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The sum is: ");
        System.out.println(sum);
    }
}


// -----------------------------------------------------------------------
// _05_taking_float_input_from_user.java
// -----------------------------------------------------------------------


import java.util.Scanner;                           // importing the scanner class to take input

public class _05_taking_float_input_from_user {
    public static void main(String[] args){
        System.out.println("Taking floating point input from the user:");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1: ");
        float a = sc.nextFloat();       // taking a float number as input and placing it in float variable a
        // .nextFloat() to take a float number as input, similarly, .next(), .nextByte(), .nextInt(), etc.

        System.out.println("Enter num2: ");
        float b = sc.nextFloat();

        float sum = a + b;
        System.out.println("The sum is: ");
        System.out.println(sum);
    }
}
