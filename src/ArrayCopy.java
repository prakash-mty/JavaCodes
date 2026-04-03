import java.util.*;

public class ArrayCopy {
    public static void main(String[] args)
    {
        //input an array
        System.out.println("Input array size");
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size];
        System.out.println("Input array element: "); 
        for(int i=0;i<size;i++)
        {
            arr1[i]= scn.nextInt();
        }

        //copying array elements
        for(int k=0;k<size;k++)
        {
            arr2[k]=arr1[k];
        }
        //printing copied array
        System.out.println();
        System.out.println("Copied array elements are: ");
        for(int j:arr2)
        {
            System.out.print(j+" ");
        }
        scn.close();
    }
}
