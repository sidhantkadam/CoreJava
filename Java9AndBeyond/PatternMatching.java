package Java9AndBeyond;


public class PatternMatching {

    //Using InstanceOf Method
    public static String patternMatchingUsingInstanceOf(Object o) {
        //Traditional Approach
        if (o instanceof String) {
            String s = (String) o;
            return "String Type : " + s;
        }
        //Java 16
        if (o instanceof Integer i) {
            return "Integer Type : " + i;
        }
        return "No Match Found !";
    }

    public static String patternMatchingUsingSwitchExpression(Object o) {
        return switch (o) {
            case String s -> "String Type : " + s;
            case Integer i -> "Integer Type : " + i;
            default -> "No Match Found !";
        };
    }

    public static void main(String[] args) {
        String abc = patternMatchingUsingInstanceOf("ABC");
        System.out.println(abc);

        String s = patternMatchingUsingSwitchExpression(100);
        System.out.println(s);
    }
}
