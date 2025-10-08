package Java8.StreamAPI.NumericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {

    public static int sumOfNNumbers(List<Integer> li) {
        return li.stream()
                .reduce(0, (x, y) -> x + y);
    }

    public static int sumOfNIntegerNumbers() {
        return IntStream.rangeClosed(1, 6)
                .sum();
    }

    public static void totalCountsUsingRangeClosed() {
        IntStream.rangeClosed(1, 50)
                .forEach(s -> System.out.print(s + ", "));
    }

    public static int maxInRange() {
        return IntStream.rangeClosed(1, 50)
                .max()
                .getAsInt();
    }

    public static double averageInGivenRange() {
        return IntStream.rangeClosed(20, 67)
                .average()
                .getAsDouble();
    }

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sum = sumOfNNumbers(li);
        System.out.println(sum);

        int sum1 = sumOfNIntegerNumbers();
        System.out.println(sum1);

        System.out.println("Total numbers in closed range : ");
        totalCountsUsingRangeClosed();

        System.out.println();

        int max = maxInRange();
        System.out.println("Max in the given range : " + max);

        System.out.println();

        double avg = averageInGivenRange();
        System.out.println("Avg in the given range : " + avg);
    }
}
