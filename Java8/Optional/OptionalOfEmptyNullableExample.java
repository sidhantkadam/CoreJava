package Java8.Optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {
    public static Optional<String> ofNullable() {

        Optional<String> returnResult = Optional.ofNullable("Hello");
        return returnResult;
    }

    public static Optional<String> of() {

        Optional<String> returnResult = Optional.of("Hello");
        return returnResult;
    }

    public static Optional<String> empty() {

        Optional<String> returnResult = Optional.empty();
        return returnResult;
    }

    public static void main(String[] args) {

        Optional<String> s = ofNullable();
        System.out.println(s);

        Optional<String> s1 = of();
        System.out.println(s1);

        Optional<String> s2 = empty();
        System.out.println(s2);
    }
}
