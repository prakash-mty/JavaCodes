package PracticeDaily;
import java.util.*;

public class RemoveDuplicateCollection {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any string to remove duplicate: ");
        String str = scn.nextLine().toLowerCase();
        removeDuplicateChar(str);
        scn.close();
    }
    public static void removeDuplicateChar(String stx)
    {
        Set<Character> set = new LinkedHashSet<>();//removes duplicate & maintains same order 
        
        for(char ch:stx.toCharArray())
        {
            if(ch!=' ')
            {
                set.add(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        for(char c: set)
        {
            result.append(c);
        }
        System.out.println(result.toString());//convertion to string
    }  
}