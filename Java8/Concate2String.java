package Java8;

import java.util.function.BiFunction;

public class Concate2String
{
    public static void main(String[] args)
    {

        BiFunction <String, String ,String> concate = (s1,s2) ->
            s1+s2;

        String s1="Hello ";
        String s2 = "World";
        System.out.println(concate.apply(s1,s2));
    }
}
