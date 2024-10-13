package ImportantConcepts;

import java.util.Scanner;

public class NestedIfCondition {
    //find larger number among 3 numbers using nested if
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        System.out.print("Entered numbers are: " + a + " " + b + " " + c + "\n");
        if (a > b && a > c) {
            System.out.println(a + " is larger.");
        } else if (b > a && b > c) {
            System.out.println(b + " is larger.");
        } else {
            System.out.println(c + " is larger.");
        }
    }
}
