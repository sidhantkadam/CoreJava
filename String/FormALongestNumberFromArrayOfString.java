package String;

import java.util.Arrays;

public class FormALongestNumberFromArrayOfString {
    private static int formLargestNumber(String[] s) {
        Arrays.sort(s, (num1, num2) -> (num2 + num1).compareTo(num1 + num2));
        String str ="";
        for (String num : s) {
            str = str + num;
        }
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        String[] s = {"3", "30", "34", "5", "9"};
        int num = formLargestNumber(s);
        System.out.println(num);
    }
}
