package Array;

public class FindPeakElement {

    private static int calculatePeak(int[] arr) {

        for (int i = 1; i < arr.length - 2; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return arr[i];
            }
        }

        if (arr[0] > arr[1]) {
            return arr[0];
        }
        if (arr[arr.length - 1] > arr[arr.length - 2]) {
            return arr[arr.length - 1];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 5, 1, 2};
        int peak = calculatePeak(arr);
        System.out.println(peak);
    }
}
