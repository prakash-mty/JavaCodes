package InterviewQuestions;

public class PrintFirstRepeatedCharacter {
    public static void getFirstRepeatedChar(String str) {
        int len = str.length();
        char[] ch = str.toCharArray();
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {// as we need only one repeating char
                if (ch[i] == ch[j]) {
                    System.out.println(ch[i]);
                    return;//we are returning nothing to stop both for loops
                }
            }
        }
        System.out.println("No repeated character found");
    }
        public static void main (String[]args)
        {
            getFirstRepeatedChar("programme is easy");
        }
    }
