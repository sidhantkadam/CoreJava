package Array;

public class MaxSumOfWindowSize {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 8, 9, 3, 4};
        int w = 4;
        int maxSum = calculateMaxSum(arr, w);
        System.out.println(maxSum);
    }

    private static int calculateMaxSum(int[] arr, int w) {
        int current = 0;

        for (int i = 0; i < w; i++) {
            current += arr[i];
        }
        int max = current;
        for (int j = 1; j <= arr.length - w; j++) {
            current = current - arr[j - 1] + arr[j + w - 1];
            if (current > max) {
                max = current;
            }
        }
        return max;
    }
}
