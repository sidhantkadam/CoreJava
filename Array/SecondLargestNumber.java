package Array;

    /*
    Given an array of positive integers arr[], return the second-largest element from the array. If the second largest element doesn't exist then return -1.
    Note: The second largest element should not be equal to the largest element.
     */

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int secondLargest = findSecondLargest(arr);
        System.out.println(secondLargest);
    }

    private static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int k : arr) {
            if (k > largest) {
                largest = k;
            }
        }
        for (int j : arr) {
            if (j > secondLargest && j != largest) {
                secondLargest = j;
            }
        }
        if (secondLargest > 1) {
            return secondLargest;
        }
        return -1;
    }
}
