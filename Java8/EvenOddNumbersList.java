package Java8;

import java.util.Arrays;
import java.util.List;

public class EvenOddNumbersList
{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        System.out.println("Even : ");
        List<Integer> Even = list.stream().filter(
                (num) -> num % 2 == 0
        ).toList();
        for(int i : Even)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        List<Integer> Odd = list.stream().filter(
                (num) -> num % 2 != 0
        ).toList();
        System.out.println("Odd: ");
        for(int i: Odd)
        {
            System.out.print(i + " ");
        }
    }
}
