public class SquareArray {

    public static void main(String[] args) {
        double result = 1.0f;

        int base = 2;
        int exp = -3;

        for(int i=0;i<exp;i++)
        {
            result = result * base;
        }
        result = 1/result;
        System.out.println(result);
    }
}
