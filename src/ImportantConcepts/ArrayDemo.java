package ImportantConcepts;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        //Array is collection of elements of similar data type
        //It has fixed size
        int[] arr = new int[5];
        int len = arr.length;
        Scanner scn = new Scanner(System.in);
        System.out.println(" Enter five elements into array: ");
        for (int i = 0; i < len; i++) {
            arr[i] = scn.nextInt();
        }
        //printing array elements
        System.out.println("Printing entered array elements");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
