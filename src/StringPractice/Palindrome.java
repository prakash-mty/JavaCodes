package StringPractice;
import java.util.*;
public class Palindrome{
    public static void main(String[] args)
    {
        System.out.println("Enter a string to check if it is a palindrome:");
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String rev = "";
        for(int i = str.length()-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("The string is a palindrome.");
        }
        else
        {
            System.out.println("The string is not a palindrome.");
        }
        scn.close();
    }
}