package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class PrintRepeatingCharFrequency {
    public static void getCharCount(String str)
    {
        Map<Character,Integer> charMap = new HashMap<Character,Integer>();
        char[] charArray= str.toCharArray();
        for(char c: charArray)
        {
            //converts char at c to string and compare
            if(!String.valueOf(c).isBlank())
            {
                if(charMap.containsKey(c))
                {
                    charMap.put(c,charMap.get(c)+1);
                }
                else {
                    charMap.put(c,1);
                }
            }
        }
        System.out.print(str+":"+charMap);
    }
    public static void main(String[] args)
    {
        getCharCount("Programming");
    }
}
