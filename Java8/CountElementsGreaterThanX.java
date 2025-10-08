package Java8;

import java.util.Arrays;
import java.util.List;

public class CountElementsGreaterThanX
{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,5,1,8,6);
        int x = 2;

        long count = numbers.stream()
                .filter(integer -> integer > x)
                        .count();
        System.out.println(count);
    }
}
