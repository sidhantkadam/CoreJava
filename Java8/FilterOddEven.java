package Java8;

import java.util.Arrays;
import java.util.List;

public class FilterOddEven
{
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(23,45,67,80,22);

        List<Integer> even  = li.stream().filter(num -> num%2==0).toList();
        List<Integer> odd  = li.stream().filter(num -> num%2!=0).toList();
        even.forEach(
                System.out::println
        );
        odd.forEach(
                System.out::println
        );
    }
}
