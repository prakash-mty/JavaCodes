package StringPractice;
import java.util.*;

public class FrequencyHasmap {
    public static void main(String[] args)
    {
        System.out.println("Enter the string");
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        //empty hashmap
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : str.toCharArray())
        {
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        System.out.println(map);
        scn.close();
    }
    
}
