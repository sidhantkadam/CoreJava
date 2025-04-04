package Java8;

import java.util.Arrays;
import java.util.List;

public class StringUpperLower
{
    public static void main(String[] args)
    {
        List<String> s = Arrays.asList("HELLO", "WORLD");
        s.replaceAll(
                (str) -> str.toLowerCase()
        );
        System.out.println(s);
    }
}
