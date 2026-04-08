package PracticeDaily;
import java.util.*;
public class RemoveDuplicateChar {
    public static void main(String[] args)
    {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter any string to find duplicate: ");
    String str = scn.nextLine().toLowerCase();
    StringBuilder filtered = findDuplicate(str);
    System.out.println(filtered);
    }
    public static StringBuilder findDuplicate(String stx)
    {
        StringBuilder result = new StringBuilder();//it is mutable and avoids creating multiple
                                                   // String objects during concatenation.
        for(int i=0;i<stx.length();i++)
        {
            char ch = stx.charAt(i);
            if(result.indexOf(String.valueOf(ch))==-1 && ch!=' ')//converting to string and checking returns -1 if String not found default
            {
                result.append(ch);
            }
        }
        return result;
    }
}
