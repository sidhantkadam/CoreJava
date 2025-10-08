package Java8.Optional;

import java.util.Optional;

public class OptionalIfPresentExample {
    public static void main(String[] args) {
        Optional<String> hello = Optional.ofNullable("hello");

        System.out.println(hello.isPresent());

        hello.ifPresent(System.out::println);
    }
}
