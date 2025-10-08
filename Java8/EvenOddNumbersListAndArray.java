package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class EvenOddNumbersListAndArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("Even : ");
        List<Integer> Even = list.stream().filter(
                (num) -> num % 2 == 0
        ).toList();
        for (int i : Even) {
            System.out.print(i + " ");
        }
        System.out.println();
        List<Integer> Odd = list.stream().filter(
                (num) -> num % 2 != 0
        ).toList();
        System.out.println("Odd: ");
        for (int i : Odd) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] evenArray = Arrays.stream(arr)
                .filter(num -> num % 2 == 0)
                .toArray();
        System.out.println("Even Array : " + Arrays.toString(evenArray));

        int[] oddArray = Arrays.stream(arr)
                .filter(num -> num % 2 != 0)
                .toArray();
        System.out.println("Odd Array : " + Arrays.toString(oddArray));

        System.out.println("***************");

        //If we want the even and odd numbers in particular range like in 10-100
        IntStream.rangeClosed(10, 100).filter(
                (num) -> num % 2 == 0
        ).forEach(System.out::println);

        System.out.println();

        IntStream.rangeClosed(10, 100).filter(
                (num) -> num % 2 != 0
        ).forEach(System.out::println);
    }
}
