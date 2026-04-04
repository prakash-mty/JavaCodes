package PracticeDaily;
import java.util.*;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any string to check palindrome: ");
        String str = scn.nextLine();
        boolean palindrome;
        palindrome =verifyPalindrome(str);
        if(palindrome)
         {
            System.out.println("Entered string is palindrome.");
         }   
         else{
            System.out.println("Not a palindrome");
         }  
         scn.close();
    }
     public static boolean verifyPalindrome(String val)
    {
        String rev ="";
        for(int i=val.length()-1; i>=0; i--)
        {
            rev = rev + val.charAt(i);
        }
        if(val.equals(rev))
        {
            return true;
        }
        else {
            return false;
        }
    }
}
