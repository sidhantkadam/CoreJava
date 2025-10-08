package Java8.StreamAPI.Terminal;

import Java8.Student;
import Java8.StudentDatabase;

import java.util.List;

import static java.util.stream.Collectors.*;

public class StreamsMapping {
    public static void main(String[] args) {
        List<Student> studentsList = StudentDatabase.getStudentsList();

        List<Double> collect = studentsList.stream()
                .collect(mapping(Student::getCgpa, toList()));
        System.out.println(collect);
    }
}
