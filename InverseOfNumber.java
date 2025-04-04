
        /*
        8 7 6 5 4 3 2 1
        8 1 4 5 6 2 7 3

        8 7 6 5 4 3 2 1
        8 2 4 5 6 1 3 7
        */

public class InverseOfNumber {
    public static void main(String[] args) {
        int num = 81456273;
        doInverse(num);
    }

    private static void doInverse(int num) {
        int inv = 0;
        int count = 1;
        while (num > 0) {
            int value = num % 10;
            int id = count;
            int ip = value;
            inv = inv + id * (int) Math.pow(10, ip - 1);
            num = num / 10;
            count++;
        }
        System.out.println(inv);
    }
}
