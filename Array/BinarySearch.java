package Array;

public class BinarySearch {
    public static int doBinarySearch(int[] a, int e) {
        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (e == a[mid]) {
                return mid;
            }
            if (e > a[mid]) {
                left = mid + 1;
            }
            if (e < a[mid]) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6, 7, 8, 9};
        int e = 7;
        System.out.println(doBinarySearch(a, e));
    }
}
