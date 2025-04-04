package Array;

public class SumOfAll10 {
    public static boolean checkCondition(int[] a) {
        int addition = 0;
        for (int i : a) {
            if (i == 10) {
                addition = addition + i;
            }
        }
        if (addition == 30)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int[] a = {10, 77, 10, 54, -11, 10};
        System.out.println(checkCondition(a));
    }
}
