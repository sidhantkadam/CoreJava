package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindStringsHandlingWithOptional {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("Public", "Person", "Human", "Man", "Living Thing");
        Optional<String> list = li.stream().filter(r -> r.length() > 5).findFirst();
        System.out.println(list);
    }
}
