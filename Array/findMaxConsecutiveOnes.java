package Array;

public class findMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0};

        int maxConsecutiveOnes = findMaxConsecutiveOne(arr);
        System.out.println(maxConsecutiveOnes);
    }

    private static int findMaxConsecutiveOne(int[] arr) {
        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }
        return maxCount;
    }
}
