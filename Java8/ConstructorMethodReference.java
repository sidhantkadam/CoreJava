package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

class People {
    private String name;
    private int age;

    public People() {
        Random ran = new Random();
        this.name
                = ran
                .ints(97, 122 + 1)
                .limit(7)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


public class ConstructorMethodReference {
    public static <T> List<T> getObjectList(int length,
                                            Supplier<T> objectSupply) {
        List<T> list = new ArrayList<>();

        for (int i = 0; i < length; i++)
            list.add(objectSupply.get());
        return list;
    }

    public static void main(String[] args) {
        List<People> peopleList = getObjectList(5, People::new);
        peopleList.stream().map(
                x -> x.getName()
        ).forEach(System.out::println);
    }
}
