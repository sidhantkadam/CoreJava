package Java8;

import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;

public class NumberIsPrime
{
    public static void main(String[] args) {
        int num = 19;
        Predicate<Integer> op = n ->
        {
            for (int i = 2; i <=Math.sqrt(n); i++)
            {
                if (num%i==0) {
                    return false;
                }
            }
            return true;
        };


        IntUnaryOperator uni = n ->
        {
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    System.out.println("Not Prime !");
                    break;
                }
                System.out.println("Prime No");
                break;
            }
            return n;
        };
        boolean test = op.test(num);
        System.out.println(test);

        uni.applyAsInt(num);
    }
}
