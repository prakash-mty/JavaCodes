package InterviewQuestions;

public class ReverseString {
    public static void reverseString(String s1)
    {
       String str=s1.toLowerCase();
        int len = str.length();
        String s="";

        for(int i=0;i<len;i++)
        {
            char ch= str.charAt(i);
            s = ch+s;
        }
        System.out.println(s);
    }
    public static void main(String[] args)
    {
        reverseString("chandan");
    }
}
