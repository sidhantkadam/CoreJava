package Array;

public class DuplicateInKDistance {
    private static boolean checkDuplicateDistance(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (j - i <= k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 3, 4};
        int k = 3;
        boolean result = checkDuplicateDistance(arr, k);
        if (result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
