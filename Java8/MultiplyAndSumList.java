package Java8;

import java.util.Arrays;
import java.util.List;

public class MultiplyAndSumList
{
    public static void main(String[] args)
    {
        List<Integer> li = Arrays.asList(1,2,3,4);

        int mul = li.stream().reduce(1, (x,y) -> x*y);
        int add = li.stream().reduce(0, (x,y)-> x+y);

        System.out.println("Addition : " + add);
        System.out.println("Multiplication : " + mul);
    }
}
