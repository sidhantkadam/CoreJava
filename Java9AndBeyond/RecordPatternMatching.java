package Java9AndBeyond;

sealed interface Animal permits Cat, Horse {
}

record Cat(String name, String color) implements Animal {
}

record Horse(String name, String color) implements Animal {
}

class AnimalService {
    public static String doRecordPatternMatching(Animal animal) {
        return switch (animal) {
            case Cat cat -> cat.color() + " " + cat.name();
            case Horse horse -> horse.color() + " " + horse.name();
            case null -> "";
        };
    }

    public static String doRecordPatternMatchingV2(Animal animal) {
        return switch (animal) {
            case Cat(var color, var name) -> color + " " + name;
            case Horse(var color, var name) -> color + " " + name;
            case null -> "";
        };
    }

    public static String doGuardedPatternMatchingV3(Animal animal) {
        return switch (animal) {
            case Cat(var color, var name) when name.isBlank() || color.isBlank() -> "";     //guarded
            case Cat(var color, var name) -> color + " " + name;
            case Horse(var color, var name) -> color + " " + name;
        };
    }
}

public class RecordPatternMatching {
    public static void main(String[] args) {
        String result = AnimalService.doRecordPatternMatching(new Cat("Kitty", "White"));
        System.out.println("doRecordPatternMatching : " + result);

        String result1 = AnimalService.doGuardedPatternMatchingV3(new Horse("Toofan", "Brown"));
        System.out.println("doRecordPatternMatchingV2 : " + result1);

        String result2 = AnimalService.doGuardedPatternMatchingV3(new Horse("", "Black"));
        System.out.println("doGuardedPatternMatchingV3 : " + result2);
    }
}
