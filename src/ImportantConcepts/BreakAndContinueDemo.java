package ImportantConcepts;

public class BreakAndContinueDemo {
    public static void main(String[] args)
    {
        for(int i=1;i<15;i++)
        {
            if(i==4)
            {
                continue;//continue doing the iteration
            }
            if(i==13)
            {
                break;//moves out of loop
            }
            System.out.print(i+" ");
        }
    }
}
