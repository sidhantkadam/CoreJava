package InterviewOrExams;

public class WissenTech2 {
    public static int checkMiddle(int[] arr) {
        int totalSum = 0;
        for (int i : arr) {
            totalSum += i;
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum;
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, -5, 5};
        int i = checkMiddle(arr);
        System.out.println(i);
    }
}
