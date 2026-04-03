import java.util.*;
public class SmallestElmArray {
    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        // Finding the smallest element in the array
        int smallest = arr[0];
        for(int j=1;j<arr.length;j++)
        {
            if(arr[j]<smallest)
            {
                smallest = arr[j];

            }
        }
        System.out.println("The smallest element in the array is: " + smallest);
        sc.close();
    } 
}
