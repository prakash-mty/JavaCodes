import java.util.*;
public class FindPerfectNo {
    static int sum=0;
    static int calPerfectNo(int x)
    {
        for(int i=1;i<=x/2;i++) //x/2 as we need to exclude the number itself and 
                                // we know that no number can be divided by more than its half.
        {
            if(x%i==0)
            {
                sum = sum + i; //static variable can be used in static methods directly.
                               //for non static variable we need to create object of the class and then we can use it.
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the number to check perfect no or not");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int result = calPerfectNo(n);
        if(result == n)
        {
            System.out.println(n+" is a perfect number");
        }
        else
        {
            System.out.println(n+" is not a perfect number");   
        }
        scn.close();
    }
    
}
