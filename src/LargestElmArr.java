import java.util.*;
public class LargestElmArr {
    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array");
        for(int k=0;k<size;k++)
        {
            arr[k] = sc.nextInt();
        }

        //logic to find largest element in array
        int largest = arr[0];
        int largestPosition = 0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest = arr[i];
                largestPosition = i;
            }
        }

        System.out.println("Largest element is: " + largest + " at position: " + largestPosition);
        sc.close();
    }
}
