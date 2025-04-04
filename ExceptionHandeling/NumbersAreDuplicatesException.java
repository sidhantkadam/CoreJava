package ExceptionHandeling;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class NumbersAreDuplicatesException {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(20, 30, 40, 50, 50, 50, 6);
        checkDuplicates(numbers);
    }

    private static void checkDuplicates(List<Integer> numbers) {
        try {
            for (int i = 0; i < numbers.size(); i++) {
                for (int j = i + 1; j < numbers.size(); j++) {
                    if (numbers.get(i).equals(numbers.get(j))) {
                        throw new Exception("Duplicate Element Spotted !");
                    }
                }
            }
            System.out.println(numbers);
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
