package Java8;

import java.util.Arrays;
import java.util.List;

public class StringsInAlphabetical
{
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Hello", "Bye", "Aalo", "Challo","Zang");

        List<String> list = str.stream().sorted(
                ((o1, o2) -> o1.compareToIgnoreCase(o2))
        ).toList();
        for(String s : list)
        {
            System.out.print(s + " ");
        }
    }
}
