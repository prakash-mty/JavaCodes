package OopsConcepts;

import java.util.Scanner;

public class ClassAndItsObject {
    //class is a collection of objects and methods
    //class does not consume any memory space
    int sum(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any two numbers to add: ");
        int no1 = scn.nextInt();
        int no2 = scn.nextInt();
        //create object
        //object is a real world entity having some properties and functions
        // Also called instance of a class
        //object takes some space in memory
        ClassAndItsObject obj = new ClassAndItsObject();
        System.out.println(obj.sum(no1, no2) + " ");
    }
}
