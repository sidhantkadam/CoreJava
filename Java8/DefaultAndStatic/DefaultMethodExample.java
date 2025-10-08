package Java8.DefaultAndStatic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExample {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("Jane", "Adam", "Stefan", "Morgan", "Haris");

//        System.out.println("Sorting using Collection.sort() method : ");
//        Collections.sort(strs);

        System.out.println("Sorting using Java 8 default method : ");
        strs.sort(Comparator.naturalOrder());
        System.out.println(strs);
    }
}
