package Array;

public class CommonElementsInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 4};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    if (arr[i] == arr1[j] && arr1[j] == arr2[k] && arr[i] == arr[k])
                        System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
