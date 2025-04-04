package Array;

public class ThirdLargestElement {
    private static int findThirdMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
        int secondMax = Integer.MIN_VALUE;
        for (int j = 1; j < arr.length; j++) {
            if (secondMax < arr[j] && arr[j] < max) {
                secondMax = arr[j];
            }
        }
        System.out.println(secondMax);
        int thirdMax = Integer.MIN_VALUE;
        for (int k = 1; k < arr.length; k++) {
            if (thirdMax < arr[k] && arr[k] < secondMax) {
                thirdMax = arr[k];
            }
        }
        return thirdMax;
    }

    public static void main(String[] args) {
        int[] arr = {1, 14, 2, 16, 10, 20};
        int thirdMax = findThirdMax(arr);
        System.out.println(thirdMax);
    }
}
