/*

Reverse the Digits of a Number and Remove Specific Digits
Problem: Write a program to reverse the digits of a number N and remove any occurrences of a given digit D from the reversed number.

Example: For N = 12345 and D = 3, the result is 5421.

Difficulty: Beginner to Intermediate
*/

public class ReverseNumberAndRemoveD {
    private static int removeDFromN(int n, int d) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = String.valueOf(n).toCharArray();
        for (int i = charArray.length - 1; i >= 0 ; --i) {
            if(charArray[i] != (char) (d + '0'))
            {
                sb.append(charArray[i]);
            }
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        int N = 123458457;
        int D = 8;
        int numReturn = removeDFromN(N, D);
        System.out.println(numReturn);
    }
}
