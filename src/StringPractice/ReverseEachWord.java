package StringPractice;

public class ReverseEachWord {
    public static void main(String[] args)
    {
        String str = "Hello World";
        String rev = " ";
        String[] arr = str.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            String word = arr[i];
            String revword = " ";
            for(int j = word.length()-1;j>=0;j--)
            {
                revword = revword + word.charAt(j);
            }
            rev = rev + revword + " ";
        }
        System.out.println(rev);
    }
}
