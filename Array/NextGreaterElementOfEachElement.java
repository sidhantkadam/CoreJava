package Array;

public class NextGreaterElementOfEachElement {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
        for (int i = 0; i < arr.length; i++) {
            int nextMax = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    nextMax = arr[j];
                    break;
                }
            }
            System.out.println("Next max for " + arr[i] + ": " + nextMax);
        }
    }
}
