
// -----------------------------------------------------------------------
// _26_day_of_the_week.java
// -----------------------------------------------------------------------

import java.util.Scanner;
public class _26_day_of_the_week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the day of the week: ");
        int n = sc.nextInt();
        switch (n){
            case 1 -> System.out.println("It's Monday!");
            case 2 -> System.out.println("It's Tuesday!");
            case 3 -> System.out.println("It's Wednesday!");
            case 4 -> System.out.println("It's Thursday!");
            case 5 -> System.out.println("It's Friday!");
            case 6 -> System.out.println("It's Saturday!");
            case 7 -> System.out.println("It's Sunday!");
            default -> System.out.println("Invalid number.");
        }
    }
}

// -----------------------------------------------------------------------
// _27_leap_year_or_not.java
// -----------------------------------------------------------------------

import java.util.Scanner;
public class _27_leap_year_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        if(year%100==0){        // if year is divisible by 100
            if(year%400==0){    // then it should be divisible by 400 too to be leap year
                System.out.println("Leap year.");
            }
            else System.out.println("Not leap year");
        }
        else if(year%4==0){     // if not divisible by 100 but divisible by 4, then it's leap year too
            System.out.println("Leap year.");
        }
        else System.out.println("Not leap year.");      // otherwise not a leap year
    }
}


// -----------------------------------------------------------------------
// _28_type_of_website.java
// -----------------------------------------------------------------------

import java.util.Scanner;
public class _28_type_of_website {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter url for website:");
        String s = sc.nextLine();
        if(s.endsWith(".com")) System.out.println("It's a commercial website.");
        else if(s.endsWith(".org")) System.out.println("It's an organisation website.");
        else if(s.endsWith(".in")) System.out.println("It's an Indian website.");
        else System.out.println("Not in directory.");
    }
}



// -----------------------------------------------------------------------
// _29_rock_paper_scissors.java
// -----------------------------------------------------------------------

import java.util.Random;        // Random class to generate random numbers
import java.util.Scanner;
public class _29_rock_paper_scissors {
    public static void main(String[] args) {
        Random a = new Random();        // creating object to call Random class' methods
        Scanner sc = new Scanner(System.in);
        int compChoice = a.nextInt(1,4);         // nextInt() method to get a random int
        // note: we used the version of this method with bound limits
        // here, lower limit is inclusive while the upper limit is exclusive
        // 1 and 4 as lower and upper limits, to get any number between 1, 2 and 3 randomly
        System.out.println("1 for Rock");
        System.out.println("2 for Paper");
        System.out.println("3 for Scissors");
        System.out.println("4 to exit.");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1 -> {
                if(compChoice==1) System.out.println("Tied.");
                if(compChoice==2) System.out.println("Computer chose Paper. YOU LOST.");
                if(compChoice==3) System.out.println("Computer chose Scissors. YOU WON.");
            }
            case 2 -> {
                if(compChoice==1) System.out.println("Computer chose Rock. YOU WON.");
                if(compChoice==2) System.out.println("Tied.");
                if(compChoice==3) System.out.println("Computer chose Scissors. YOU LOST.");
            }
            case 3 -> {
                if(compChoice==1) System.out.println("Computer chose Rock. YOU LOST.");
                if(compChoice==2) System.out.println("Computer chose Paper. YOU WON.");
                if(compChoice==3) System.out.println("Tied.");
            }
            case 4 -> System.out.println("Thank you for playing!");
        }

    }
}
