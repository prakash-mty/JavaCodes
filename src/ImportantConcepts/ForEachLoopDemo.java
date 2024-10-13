package ImportantConcepts;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoopDemo {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<Integer>();
        int sum=0;
        for(int i=1;i<10;i++)
        {
            sum += i;
            list.add(sum);
        }
        //advance for loop
        for(int j:list)
        {
            System.out.print(j+" ");
        }
    }
}
