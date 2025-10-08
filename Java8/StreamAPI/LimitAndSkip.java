package Java8.StreamAPI;

import Java8.Student;
import Java8.StudentDatabase;

import java.util.List;
import static java.util.stream.Collectors.toList;

public class LimitAndSkip {
    public static void main(String[] args) {
        List<Student> studentsList = StudentDatabase.getStudentsList();

        List<String> collect = studentsList.stream()
                .map(Student::getName)
                .limit(5)
                .skip(1)
                .collect(toList());
        System.out.println(collect);
    }
}
