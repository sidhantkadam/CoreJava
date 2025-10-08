package Java8.StreamAPI;

import Java8.Student;
import Java8.StudentDatabase;

import java.util.List;

public class FindAnyFindManyExample {
    public static void main(String[] args) {
        List<Student> studentsList = StudentDatabase.getStudentsList();

        String findFirst = studentsList.stream()
                .map(Student::getName)
                .findFirst()
                .get();

        System.out.println(findFirst);

        String findAny = studentsList.stream()
                .map(Student::getName)
                .filter(s -> s.startsWith("P"))
                .findAny()
                .get();

        System.out.println(findAny);
    }
}
