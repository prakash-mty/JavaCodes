package PracticeDaily;

import java.util.*;

public class ArrayMaxElem {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter array size: ");
        System.out.println("Enter array elements: ");
        int size= scn.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=scn.nextInt();
        }
        int maxElm = calMaxArray(arr);
        System.out.println("maximum Element is: "+maxElm);
        scn.close();
    }
    public static int calMaxArray(int[] arr1)
    {
        int max = arr1[0];
        for(int i=1;i<arr1.length;i++)
        {
            if(max<arr1[i])
            {
                max=arr1[i];
            }
        }
        return max;
    }

}
