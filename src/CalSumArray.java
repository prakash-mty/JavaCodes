import java.util.*;
public class CalSumArray {
    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array: ");
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] array1 = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<array1.length;i++)
        {
            array1[i] = scn.nextInt();
        } 
        int sum = 0;
        for(int j:array1)
        {
            sum = sum + j;
        }
        System.out.println("The sum of the array is: " + sum);
        scn.close();

    }
}
