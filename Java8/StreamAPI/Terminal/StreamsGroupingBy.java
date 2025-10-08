package Java8.StreamAPI.Terminal;

import Java8.Student;
import Java8.StudentDatabase;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamsGroupingBy {

    public static void groupBy_1(List<Student> ls) {
        Map<String, List<Student>> mp = ls.stream()
                .collect(groupingBy(Student::getGender, toList()));
        System.out.println("Map using simple grouping By : " + mp);
    }

    public static void customizedGroupingBy(List<Student> ls) {
        Map<String, List<Student>> custMp = ls.stream()
                .collect(groupingBy(
                        student -> student.getCgpa() >= 6.0 ? "First Class" : "Average"));

        System.out.println("Map using custom grouping By : ");
        custMp.forEach((s, students)
                -> System.out.println(s + ": " + students));
    }

    public static void twoLevelGrouping(List<Student> ls) {
        Map<Integer, Map<String, Set<Student>>> twoMp = ls.stream()
                .collect(groupingBy(Student::getGradeLevel
                        , groupingBy(Student::getGender, toSet())));

        System.out.println("Map using two level grouping : ");
        twoMp.forEach((integer, stringSetMap) ->
                System.out.println(integer + ": " + stringSetMap));
    }

    public static void threeLevelGrouping(List<Student> ls) {
        LinkedHashMap<String, Long> collect = ls.stream()
                .collect(groupingBy(Student::getGender, LinkedHashMap::new, counting()));

        System.out.println("Map using three level grouping (map factory) : " + collect);
    }

    public static void main(String[] args) {
        List<Student> std = StudentDatabase.getStudentsList();
        groupBy_1(std);
        customizedGroupingBy(std);
        twoLevelGrouping(std);
        threeLevelGrouping(std);
    }
}
