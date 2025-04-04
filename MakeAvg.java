/*
You are given 2 integers - A & C
You need to find if there exists any integer B which meets the following condition
1. B must be an integer
2. B is the average of A and C
For each test case, output B, If no such integer exists, output −1
 */

public class MakeAvg {
    public static void main(String[] args) {
        int A = 3;
        int C = 5;
        int B = 0;

        if ((A + C) % 2 == 0) {
            B = (A + C) / 2;
            System.out.println(B);
        } else {
            System.out.println(-1);
        }
    }
}
