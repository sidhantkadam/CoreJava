package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMinValuesList
{
    public static void main(String[] args) {

        List<Integer> li = Arrays.asList(1,25,9,4,6,10,190);

        Optional<Integer> min = li.stream().min((s1,s2) -> s1.compareTo(s2));

        Optional<Integer> max = li.stream().max((s1,s2) -> s1.compareTo(s2));

        System.out.println("Min : " + min.orElse(null));
        System.out.println("Min : " + max.orElse(null));
    }
}
