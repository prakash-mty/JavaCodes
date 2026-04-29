package PracticeDaily;
import java.util.*;

public class FirstNonRepeatingChar {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any string to find first non repeating character: ");
        String str = scn.nextLine();
        findFirstNonrepeatingChar(str);

    }
    public static void findFirstNonrepeatingChar(String stx)
    {
        Map<Character, Integer> map = new HashMap<>();
        
        for(Character ch: stx.toCharArray())//convert to array
        {
            if(map.containsKey(ch))//if characer contains in map
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        System.out.println(map);
        for(Character c: stx.toCharArray())
        {
            if(map.get(c)==1)
            {
                System.out.print("Nonrepeating Character is: "+c);
                break;
            }
        }
    }
}
