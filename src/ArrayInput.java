import java.util.*;

public class ArrayInput {
    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array: ");
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int arr[] = new int[size]; 

        //input array elements
        for(int i=0; i<size; i++)
        {
            System.out.println("Enter element: ");
            int element = scn.nextInt();
            arr[i] = element;
        }
        //print array elements
        System.out.println("Array elements are: ");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+" ");
        }
        scn.close();
    }
}
