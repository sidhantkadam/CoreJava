/*

Problem
Given the range [L, R] = [50, 70] and the digit N = 5,
count how many numbers in this range do not contain the digit 5.

*/

public class CountNumberNotInGivenRangeNumbers {
    private static boolean checkNumberIsPresent(int num, int d) {
        while (num > 10) {
            if (num % 10 == d) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    private static int findCountOfNNotInRange(int l, int r, int D) {
        int count = 0;
        for (int i = l; i <= r; i++) {
            if(checkNumberIsPresent(i,D)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int L = 101;
        int R = 110;
        int D = 2;

        int count = findCountOfNNotInRange(L, R, D);
        System.out.println(count);
    }
}
