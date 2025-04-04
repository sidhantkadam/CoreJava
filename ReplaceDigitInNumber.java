/*
Problem: Given a number N and two digits X and Y, replace all occurrences of X in N with Y.

Example: For N = 1024, X = 2, Y = 5, the result is 1054.

*/


public class ReplaceDigitInNumber {
    private static int replaceTheXWithY(int N, int X, int Y) {

        char c1 = (char) (X + '0');
        char c2 = (char) (Y + '0');
        StringBuilder sb = new StringBuilder();
        String s = String.valueOf(N);
        char[] charArray = s.toCharArray();

        for(int i=0;i<charArray.length;i++)
        {
            if(charArray[i] == c1)
            {
                 charArray[i] = c2;
            }
            sb.append(charArray[i]);
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        int N = 10224;
        int X = 2;
        int Y = 5;

        int updated = replaceTheXWithY(N, X, Y);
        System.out.println(updated);
    }
}
