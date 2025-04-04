package String;

import java.time.LocalDateTime;

public class StringEndsWithAnotherString
{
    public static void main(String[] args) {
        String s = "Python Exercise";
        String s1 = "python exercise";

        boolean b = s.endsWith(s1);
        System.out.println(b);

        System.out.println(s.equalsIgnoreCase(s1));

        LocalDateTime now = LocalDateTime.now();
        System.out.format("%tB %te, %tY%n ", now,now,now);
        System.out.format("%tl:%tM %tp%n", now,now,now);
    }
}
