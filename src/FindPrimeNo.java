import java.util.*;
public class FindPrimeNo {
    static boolean isPrime(int x)
    {
        if(x==1)
        {
            return false;
        }
            for(int j=2;j<=x/2;j++)
            {
                if(x%j==0)
                {
                    return false;
                }
            }
        
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter a number to check whether it is prime or not");
        Scanner scn = new Scanner(System.in);
        int no = scn.nextInt();
        if(isPrime(no))
        {
            System.out.println(no+" is a prime number");
        }
        else
        {
            System.out.println(no+" is not a prime number");
        }
        scn.close();
    }
    
}
