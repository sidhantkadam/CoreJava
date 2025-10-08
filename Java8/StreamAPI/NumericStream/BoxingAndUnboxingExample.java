package Java8.StreamAPI.NumericStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class BoxingAndUnboxingExample {

    public static List<Integer> boxing() {
        return IntStream.rangeClosed(1, 50)
                .boxed()
                .collect(toList());
    }

    public static int unboxing(List<Integer> li) {
        return li.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> boxing = boxing();
        System.out.println("Boxing : " + boxing);

        int unboxing = unboxing(Arrays.asList(20, 30, 40, 60));
        System.out.println("Unboxing : " + unboxing);
    }
}
