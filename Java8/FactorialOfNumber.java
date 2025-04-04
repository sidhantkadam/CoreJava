package Java8;

import java.util.function.LongUnaryOperator;

public class FactorialOfNumber
{
    public static void main(String[] args)
    {
        LongUnaryOperator operator = s ->
        {
            int fact = 1;
            for (int i = 2; i <= s; i++)
            {
                fact = fact * i;
            }
            return fact;
        };
        long n =3;
        long l = operator.applyAsLong(n);
        System.out.println("Fact : " + l);
    }
}
