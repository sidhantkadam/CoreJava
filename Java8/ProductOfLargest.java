package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

    /*
    Given a list of integers,
    find the product of the largest n distinct even numbers in the list
    (where n is a given integer).
     */


public class ProductOfLargest {
    public static void main(String[] args) {
        int n = 3;
        List<Integer> li = Arrays.asList(3, 6, 2, 8, 5, 10, 12, 14, 7);

        int product = li.stream()
                .filter(num -> num % 2 == 0)
                .sorted(Comparator.reverseOrder())
                .limit(n)
                .reduce(1, (a, b) -> a * b);
        System.out.println(product);
    }
}
