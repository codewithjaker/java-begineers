// -----------------------------------------------------------------------
// _08_cbse_percentage_calculator.java
// -----------------------------------------------------------------------

import java.util.Scanner;

public class _08_cbse_percentage_calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total marks: ");
        float total = sc.nextFloat();
        System.out.print("Enter marks for subject 1: ");
        float sub1 = sc.nextFloat();
        System.out.print("Enter marks for subject 2: ");
        float sub2 = sc.nextFloat();
        System.out.print("Enter marks for subject 3: ");
        float sub3 = sc.nextFloat();
        System.out.print("Enter marks for subject 4: ");
        float sub4 = sc.nextFloat();
        System.out.print("Enter marks for subject 5: ");
        float sub5 = sc.nextFloat();
        float percen = ((sub1+sub2+sub3+sub4+sub5)/(5*total))*100;
        System.out.print("The percentage is: "+percen);
    }
}

// -----------------------------------------------------------------------
// _09_have_a_good_day.java
// -----------------------------------------------------------------------


import java.util.Scanner;

public class _09_have_a_good_day {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String s = sc.nextLine();
        System.out.println("Good morning, "+s+". Have a nice day.");
    }
}

// -----------------------------------------------------------------------
// _10_kilometers_to_meters.java
// -----------------------------------------------------------------------



import java.util.Scanner;

public class _10_kilometers_to_meters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value in kilometers: ");
        float km = sc.nextFloat();
        float m = km*1000;
        System.out.print("The value in meters is: "+m+" meters.");
    }
}
