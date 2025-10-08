package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortNumbersInAseAndDescFromListAndArray {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 4, 8, 9, 3, 1, 7, 2, 6);

        int[] arrNum = new int[]{10, 5, 4, 8, 9, 3, 1, 7, 2, 6};

        //Using separate logic in reverse order
        List<Integer> listLogic = numbers.stream()
                .sorted((a, b) -> b - a)
                .toList();
        System.out.println(listLogic);

        //Using static method of Comparator Interface
        List<Integer> listStatic = numbers.stream()
                .sorted(Comparator.naturalOrder())
                .toList();
        System.out.println(listStatic);

        //Primitive to int conversion using boxed method
        List<Integer> listBoxed = Arrays.stream(arrNum)
                .boxed()
                .sorted(Comparator.naturalOrder())
                .toList();
        System.out.println(listBoxed);

        //Primitive to int conversion using boxed method and sort in reverse order
        List<Integer> listObj = Arrays.stream(arrNum)
                .mapToObj(value -> Integer.valueOf(value))
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(listObj);
    }
}
