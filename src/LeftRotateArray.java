import java.util.*;
//shift left all elements of array by one position
public class LeftRotateArray {
    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array:");
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int arr1[] = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++)
        {
            arr1[i]= scn.nextInt();
        }
        //left ratation of array
        int firstelm= arr1[0];
        for(int j=0;j<size-1;j++)
        {
            arr1[j]=arr1[j+1];
        }
        arr1[arr1.length-1]=firstelm;
        System.out.println("Array after left rotation:");
        System.out.println();
        for(int x: arr1)
        {
            System.out.print(x+" ");
        }
        scn.close();
    }
    
}
