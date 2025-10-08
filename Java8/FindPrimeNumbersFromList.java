package Java8;

import java.util.Arrays;
import java.util.List;

public class FindPrimeNumbersFromList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 6, 8, 9, 11, 15, 16);

        List<Integer> primeNumbers = numbers.stream()
                .filter(FindPrimeNumbersFromList::isPrime)
                .toList();
        System.out.println(primeNumbers);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
