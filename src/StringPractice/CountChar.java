package StringPractice;
import java.util.*;
public class CountChar {
    public static void main(String[] args)
    {
        System.out.println("Enter a string to count the characters: ");
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                count++;
            }
                
        }
        System.out.println("The number of characters in the string is: "+count);
        scn.close();
    }
    
}
