package InterviewQuestions;

public class RemoveRepeatedCharacters {
    public static void main(String[] args)
    {
        String str= "Hello";
        int len = str.length();
        StringBuilder s= new StringBuilder();
        for(int i=0;i<len;i++)
        {
            boolean temp=false;
            for(int j=i+1;j<len;j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    temp=true;
                    break;
                }
            }
            if(!temp)
            {
                s.append(str.charAt(i));
            }
        }
        System.out.println(s);
    }
}
