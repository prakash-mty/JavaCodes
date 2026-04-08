package PracticeDaily;
import java.util.*;
public class CountVowelsAndConso {
    public static int[] countVowelsAndConsonants(String val)
    {
        int vowelCount = 0;
        int consonantCount =0;
        int nonLetterCount =0;
        String vowel = "aeiou";
        for(int i=0;i<val.length();i++)
        {
            if(vowel.contains(String.valueOf(val.charAt(i))))//convert character to string
            {
                vowelCount++;
            }
            else if(Character.isLetter(val.charAt(i)))// only calculates character
            {
                consonantCount++;
            }
            else
            {
                nonLetterCount++;
            }
        }
        return new int[]{vowelCount,consonantCount,nonLetterCount};//new int[]{...} creates a new array object in memory
                                                    //  that holds the integers you provide.
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any string to count vowels & consonants: ");
        String str = scn.nextLine().toLowerCase();
        int[] arr = countVowelsAndConsonants(str);
        System.out.println("Vowels: "+arr[0]+"|"+"Consonants: "+arr[1]);
        if(arr[2]!=0)
        {
            System.out.println("Non letter character count is :"+arr[2]);
        }
        scn.close();
    }
}
