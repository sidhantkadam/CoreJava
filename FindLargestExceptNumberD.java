public class FindLargestExceptNumberD {

    public static boolean check(int L, int D) {
        int l;
        while (L > 10) {
            l = L % 10;
            if (l == D) {
                return false;
            } else {
                L = L / 10;
            }
        }
        return true;
    }

    private static int checkMaxNotContainingD(int number, int D) {
        int returnNum = 0;
        while (number > 0) {
            boolean check = check(number, D);
            if (check) {
                returnNum = number;
                break;
            } else {
                number = number - 1;
            }
        }
        return returnNum;
    }

    public static void main(String[] args) {
        int number = 745875;
        int D = 4;
        System.out.println(checkMaxNotContainingD(number, D));
    }
}
