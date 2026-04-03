import java.util.*;
public class FrequencyCountArray {
    public static void main(String[] args)
    {
        System.out.println("Enter the size of the array:");
        Scanner scn = new Scanner(System.in);
        int size=scn.nextInt();
        System.out.println("Enter the elements of the array:");
        int arr1[]=new int[size];
        int frequency[] = new int[size];
        int visited = -1;
        for(int i=0;i<size;i++)
        {
           int element =scn.nextInt();
           arr1[i]= element;
        }

        //calculate frequency -- this is the main logic
        for(int k=0;k<size;k++)
        {
            int element1=arr1[k];
            int count=1;
            for(int j=k+1;j<size;j++)
            {
                int element2=arr1[j];
                if(element1==element2)
                {
                    count++;
                    frequency[j]=visited;
                }
            }
            if(frequency[k]!=visited)
            {
                frequency[k]=count;
                count=0;
            }
        }
        //print frequency
        System.out.println("Element | Frequency");
        for(int l=0;l<size;l++)
        {
            if(frequency[l]!=visited)
            {
                System.out.println(arr1[l]+"|"+frequency[l]);
            }
        }
        scn.close();
    }
    
}
