// -----------------------------------------------------------------------
// _21_has_double_and_triple_spaces_or_not.java
// -----------------------------------------------------------------------

import java.util.Scanner;
public class _21_has_double_and_triple_spaces_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with double or triple spaces:");
        String s = sc.nextLine();
        int ds = s.indexOf("  "), ts = s.indexOf("   ");
        if(ds==-1) {    // if not double spaces, then no triple spaces either
            System.out.println("Entered string has neither double nor triple spaces.");
        }
        else if (ts==-1) {  // condition only true if there are double spaces, but no triple spaces
            System.out.println("Entered string has double spaces.");
        }
        else {      // condition only true when ds==-1 and ts==-1 fails
            System.out.println("Entered string has both double and triple spaces.");
        }
    }
}

// -----------------------------------------------------------------------
// _22_format_letter.java
// -----------------------------------------------------------------------

public class _22_format_letter {
    public static void main(String[] args) {
        String letter = "Dear Harry, long time no see. Thanks.";
        System.out.println("Before formatting, the letter is:");
        System.out.println(letter);
        String letter2 = "Dear Harry,\n\t\tlong time no see.\n\t\t\t\t  Thanks.";
        System.out.println("After formatting, the letter is:");
        System.out.println(letter2);
    }
}

// -----------------------------------------------------------------------
// _23_switch_case_and_enhanced_switch.java
// -----------------------------------------------------------------------

public class _23_switch_case_and_enhanced_switch {
    public static void main(String[] args) {
        int var = 4;
//        // Syntax for switch case statement in Java
//        switch (var){       // var can be int, char or String in Java
//            case 1:
//                System.out.println("Var has value 1.");
//                break;
//            case 2:
//                System.out.println("Var has value 2.");
//                break;
//            case 3:
//                System.out.println("Var has value 3.");
//                break;
//            case 4:
//                System.out.println("Var has value 4.");
//                break;
//            default:        // break isn't required for default case, though you can still put it in
//                System.out.println("Var is neither of 1, 2, 3 or 4.");
//        }

        // Syntax for enhanced switch in Java (doesn't require a break statement)
        // (and you need curly braces if you write more than one statement in a case)
        switch (var) {      // this is syntax for enhanced switch in Java, which doesn't require break statement
            case 1 -> System.out.println("Var has value 1.");
            case 2 -> System.out.println("Var has value 2.");
            case 3 -> System.out.println("Var has value 3.");
            case 4 -> System.out.println("Var has value 4.");
            default -> System.out.println("None of values 1, 2, 3 or 4 encountered.");
        }
        // Syntax to check a char value as condition for switch case
        char c = 'b';
        switch (c) {
            case 'a' -> System.out.println("char has value a.");
            case 'b' -> System.out.println("char has value b.");
            case 'c' -> System.out.println("char has value c.");
            case 'd' -> System.out.println("char has value d.");
            default -> System.out.println("None of values a, b, c, or d encountered.");
        }
        // Syntax to check a string value as condition for switch case
        String s = "Rishu";
        switch (s) {
            case "Harry" -> {
                System.out.println("Hello Harry");
                System.out.println("Nice playlist.");
            }
            case "Rishu" -> {
                System.out.println("Hello Rishu");
                System.out.println("Happy coding.");
            }
            case "Rocky Bhai" -> {
                System.out.println("Salaam Rocky Bhai.");
            }
            case "Endeavor" -> {
                System.out.println("Hello Endeavor");
                System.out.println("Go to hell.");
            }
            default -> {
                System.out.println("Ja na.");
            }
        }
/*
        The Java switch statement only works with:

        Primitive data types: byte, short, char, and int
        Enumerated types
        String Class
        Wrapper Classes: Character, Byte, Short, and Integer.
*/
    }
}

// -----------------------------------------------------------------------
// _24_pass_or_fail.java
// -----------------------------------------------------------------------

import  java.util.Scanner;

public class _24_pass_or_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float phys, chem, maths, tots;
        System.out.print("Enter total marks: ");
        tots = sc.nextFloat();
        System.out.print("Enter marks for physics: ");
        phys = sc.nextFloat();
        System.out.print("Enter marks for chemistry: ");
        chem = sc.nextFloat();
        System.out.print("Enter marks for maths: ");
        maths = sc.nextFloat();

        float totsPercen = ((phys+chem+maths)/(3*tots))*100;
        float physPercen = (phys/tots)*100;
        float chemPercen = (chem/tots)*100;
        float mathsPercen = (maths/tots)*100;
        if(totsPercen<40.0 || physPercen<33.0 || chemPercen<33.0 || mathsPercen<33.0){
            System.out.println("Failed.");
        }
        else System.out.println("Passed");
    }
}

// -----------------------------------------------------------------------
// _25_tax_calculator.java
// -----------------------------------------------------------------------

import java.util.Scanner;

public class _25_tax_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income in lacs per annum: ");
        float income = sc.nextFloat();
        float tax = 0.0f;
        if(income<=2.5){
            tax = tax + 0.0f;                   // no tax below income of 2.5 lacs
        }
        else if(income>2.5 && income<=5.0){
            tax = tax + (0.05f*(income-2.5f));  // above 2.5 and below 5.0, 5% on rest of income minus 2.5
        }
        else if(income>5.0 && income<=10.0){
            tax = tax + (0.05f*2.5f);           // above 5, 5% on 2.5 between 2.5-5.0 income
            tax = tax + (0.2f*(income-5.0f));   // and 20% on rest of income minus 5.0
        }
        else {
            tax = tax + (0.05f*2.5f);           // above 10.0, 5% on 2.5 between 2.5-5.0 income
            tax = tax + (0.2f*5.0f);            // 20% on 5.0 between 5.0-10.0 income
            tax = tax + (0.3f*(income-10.0f));  // and 30% on the rest of income above 10.0
        }
        System.out.println("The tax to be paid is: "+tax);
    }
}
