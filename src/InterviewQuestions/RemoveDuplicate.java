package InterviewQuestions;

public class RemoveDuplicate {
    public static void main(String[] args)
    {
        String s = "Raja";
        int len = s.length();
        String str = "";
        for(int i=0;i<len;i++)
        {
            char ch = s.charAt(i);
            if(!str.contains(String.valueOf(ch)))
            {
                //str += s.charAt(i);
                str = str.concat(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println(str);
    }
}
