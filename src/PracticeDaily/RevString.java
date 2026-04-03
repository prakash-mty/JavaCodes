package PracticeDaily;

import java.util.*;

public class RevString {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any string to reverse");
        String str = scn.nextLine();
        String rev = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.print(rev);
    }
}
