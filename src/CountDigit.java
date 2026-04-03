import java.util.*;
public class CountDigit {
    static int countDigit(int n)
    {
        int count =0;
        while(n>0)
        {
            count++;
            n=n/10;
            
        }
        return count;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter any number to count the digits: ");
        Scanner scn = new Scanner(System.in);
        int no = scn.nextInt();
        int result = countDigit(no);
        System.out.println("The number of digits in the given number is: "+result);
        scn.close();
    }
    
}
