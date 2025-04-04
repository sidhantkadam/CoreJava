public class NextPalindromicNumber {
    private static int findNextPalindromicNumber(int n) {

        int last = Integer.MAX_VALUE;

        while (n < last) {
            if (checkPalindrome(n)) {
                return n;
            }
            n++;
        }
        return -1;
    }

    private static boolean checkPalindrome(int nextP) {
        int org = nextP;
        int reverseNum = 0;
        while (nextP > 0) {
            int lastD = nextP % 10;
            reverseNum = reverseNum * 10 + lastD;
            nextP = nextP / 10;
        }
        return org == reverseNum;
    }

    public static void main(String[] args) {
        int n = 1002;
        int nextPalindrome = findNextPalindromicNumber(n);
        System.out.println(nextPalindrome);
    }
}
