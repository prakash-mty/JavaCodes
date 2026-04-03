import java.util.*;
public class EvenPositionElmOfArr {
    public static void main(String[] args)
    {
        //Take array inputs
        System.out.println("Enter the size of the array:");
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++)
        {
            arr[i]=scn.nextInt();
        }

        //Print elements in even position of the array
        System.out.println("Even elements of the array are:");
        for(int j=0;j<size;j++)
        {
            if(j%2==0 && j!=0)
            {
                System.out.print(arr[j]+" ");//2,4,6...
            }
        }
        scn.close();
    }
    }
