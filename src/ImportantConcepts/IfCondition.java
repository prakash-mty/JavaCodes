package ImportantConcepts;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        //find the largest no between two numbers
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two numbers to check larger number using If condition : ");
        int a = scn.nextInt();
        int b = scn.nextInt();
       /* if(a>b)
        {
            System.out.println(a+" larger then "+b);
        }
        if(b>a)
        {
            System.out.println(b+" larger then "+a);
        }*/
        if (a > b) {
            System.out.println(a + " larger then " + b);
        } else {
            System.out.println(b + " larger then " + a);
        }
    }
}
