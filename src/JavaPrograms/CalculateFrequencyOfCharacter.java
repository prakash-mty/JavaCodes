package JavaPrograms;

public class CalculateFrequencyOfCharacter {
    public static void calFreq(String str) {
        int len = str.length();
        char[] charArr = str.toCharArray();
        int[] freqency = new int[len];
        for (int i = 0; i < len; i++) {
                freqency[i] = 1;
                for (int j = 0; j < len; j++) {
                    if (i != j && charArr[i] == charArr[j]) {
                        freqency[i]++;
                        charArr[j] = 0; //here we are only replacing duplicate char to zero so no impact on size
                    }
                }
            }
        System.out.println("Repeated characters in " + str);
        for (int i = 0; i < len; i++) {
            if (charArr[i] != 0&&charArr[i]!=' ') {
                System.out.print(charArr[i] + ":" + freqency[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        calFreq("programme");
    }
}
