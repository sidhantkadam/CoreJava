package Array;

public class SubArrayWithMaxSum {

    private static int calculateMaximumSumUsingKadanesAlgo(int[] arr) {
        int res = arr[0];
        int maxFind = arr[0];

        int l = 1;
        while (l < arr.length) {
            maxFind = Math.max(maxFind + arr[l], arr[l]);
            res = Math.max(res, maxFind);
            l++;
        }
        return res;
    }

    private static int calculateMaximumSumUsingNavieApproach(int[] arr) {
        int res = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                res = Math.max(res, currentSum);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum1 = calculateMaximumSumUsingNavieApproach(arr);
        System.out.println(maxSum1);
        int maxSum = calculateMaximumSumUsingKadanesAlgo(arr);
        System.out.println(maxSum);
    }
}
