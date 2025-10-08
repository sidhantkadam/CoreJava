package Java8.StreamAPI.Terminal;

import Java8.Student;
import Java8.StudentDatabase;

import java.util.List;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamsSumAvg {

    public static Integer sum(List<Student> std) {
        return std.stream()
                .collect(summingInt(Student::getNoteBooks));
    }

    public static Double avg(List<Student> std) {
        return std.stream()
                .collect(averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {
        List<Student> std = StudentDatabase.getStudentsList();
        Integer sum = sum(std);
        System.out.println("Total note books : " + sum);

        Double avg = avg(std);
        System.out.println("Average note books : " + avg);
    }
}
