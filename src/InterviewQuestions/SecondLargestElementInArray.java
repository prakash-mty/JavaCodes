package InterviewQuestions;

public class SecondLargestElementInArray {
    public static void getSecondHighestNo(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[len - 2]);
    }

    public static void main(String[] args) {
        int[] givenArr = {12, 34, 56, 78, 4, 5};
        getSecondHighestNo(givenArr);
    }
}
