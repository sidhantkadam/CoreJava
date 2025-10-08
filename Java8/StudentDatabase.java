package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDatabase {

    public static Supplier<Student> newStudent = () -> new Student("abc", 3, 7.5, "M", 69, Arrays.asList("xyz", "pqr", "jkl"));

    public static List<Student> getStudentsList() {
        return Arrays.asList(
                new Student("Siddhant", 8, 5.9, "M", 22, Arrays.asList("swimming", "basketball", "volleyball"))
                , new Student("Ankit", 7, 7.5, "M", 48, Arrays.asList("swimming", "gymnastic", "soccer"))
                , new Student("Tushar", 9, 9.5, "M", 67, Arrays.asList("swimming", "gymnastic", "aerobics"))
                , new Student("Shubham", 6, 5.8, "M", 31, Arrays.asList("swimming", "dancing", "football"))
                , new Student("Sarang", 8, 8.2, "M", 44, Arrays.asList("swimming", "basketball", "baseball", "volleyball"))
                , new Student("Pankaj", 10, 10.0, "M", 75, Arrays.asList("swimming", "volleyball", "football"))
                , new Student("Sonali", 7, 9.0, "F", 19, Arrays.asList("gymnastic", "dancing", "volleyball"))
        );
    }
}
