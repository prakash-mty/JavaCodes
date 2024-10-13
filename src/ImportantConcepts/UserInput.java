package ImportantConcepts;

import java.util.Scanner;

public class UserInput {
    //take input from user at run time using scanner class
    public void sum(int x, int y) {
        int sum = x + y;
        System.out.println("sum :" + sum);
    }

    public static void main(String[] args) {
        //using scanner class
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any two digits to add them: ");
        int no1 = scn.nextInt();
        int no2 = scn.nextInt();
        UserInput obj = new UserInput();
        obj.sum(no1, no2);
    }
}
