import java.util.*;
public class FactorialNo{
    public static void main(String[] args)
    {
        System.out.println("Enter any number to find its factorial");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
        scn.close();
    }
}