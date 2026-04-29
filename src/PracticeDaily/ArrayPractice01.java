package PracticeDaily;

public class ArrayPractice01 {
    public static void main(String[] args)
    {
         int[] arr = {5,0,0,9,0,4};  // expected result {5,9,4,0,0,0}
         int length = arr.length;
         int[] result = new int[length];
         int index=0;
         for(int i=0;i<length;i++)
         {
            if(arr[i]!=0)
            {
                result[index]=arr[i];//here index : 0,1,2
                index++;//1,2,3;
            }
         }
         System.out.println(index);//initial 0,(1,2,3)in loop
         while(index<length)
         {
            result[index]=0;
            index++;
         }
         for(int x: result)
         {
            System.out.print(x + " ");
         }
    }
    
}
