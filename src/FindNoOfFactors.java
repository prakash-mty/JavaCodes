import java.util.*;
public class FindNoOfFactors {
    public static void main(String[] args)
    {
        System.out.println("Enter a number to know its factors");
        Scanner scn = new Scanner(System.in);
        int no = scn.nextInt();
        System.out.println("factors are :");
        for(int i=1;i<=no;i++)
        {
            if(no%i==0)
            {
                System.out.print(i+" ");
            }
        }
        scn.close();
    }
    
}
