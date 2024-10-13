package ImportantConcepts;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Select any option");
        System.out.println("""
                1.Addition
                2.Subtraction
                3.Multiplication
                4.Division""");
        String str = scn.nextLine();
        String con = str.toLowerCase();
        switch (con) {
            case "addition":
                System.out.println("Enter two numbers: ");
                int no1 = scn.nextInt();
                int no2 = scn.nextInt();
                int sum = no1 + no2;
                System.out.println("Addition = " + sum);
                break;
            case "subtraction":
                System.out.println("Enter two numbers: ");
                int no3 = scn.nextInt();
                int no4 = scn.nextInt();
                int sub = no3 - no4;
                System.out.println("Subtraction = " + sub);
                break;
            case "multiplication":
                System.out.println("Enter two numbers: ");
                int no5 = scn.nextInt();
                int no6 = scn.nextInt();
                int mul = no5 * no6;
                System.out.println("Multiplication = " + mul);
                break;
            case "division":
                System.out.println("Enter two numbers: ");
                int no7 = scn.nextInt();
                int no8 = scn.nextInt();
                int div = no7 / no8;
                System.out.println("Division " + div);
                break;
            default:
                System.out.println("Rerun and enter a valid choice in text format.");
        }
    }
}
