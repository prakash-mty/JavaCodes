import java.util.*;
public class CountElmsArray {
    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int j=0;j<size;j++)
        {
            if(arr[j] != 0)
            {
                count++;
            }
        }
        System.out.println("The number of non-zero elements in the array is: " + count);
        sc.close();
    }
}
