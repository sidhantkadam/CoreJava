package Java8.StreamAPI.Terminal;

import Java8.Student;
import Java8.StudentDatabase;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamsMinByMaxBy {

    public static Student findMaxBy(List<Student> studentsList) {
        return studentsList.stream()
                .collect(maxBy(Comparator.comparingDouble(Student::getCgpa)))
                .get();
    }

    public static Student findMinBy(List<Student> studentsList) {
        return studentsList.stream()
                .collect(minBy(Comparator.comparingDouble(Student::getCgpa)))
                .get();
    }

    public static void main(String[] args) {
        List<Student> studentsList = StudentDatabase.getStudentsList();

        Student maxBy = findMaxBy(studentsList);
        System.out.println("Max cgpa student : " + maxBy);

        Student minBy = findMinBy(studentsList);
        System.out.println("Min cgpa student : " + minBy);
    }
}
