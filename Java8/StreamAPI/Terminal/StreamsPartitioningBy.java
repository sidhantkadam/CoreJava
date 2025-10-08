package Java8.StreamAPI.Terminal;

import Java8.Student;
import Java8.StudentDatabase;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.partitioningBy;

public class StreamsPartitioningBy {

    public static void partitioningBy_1(List<Student> li) {
        Map<Boolean, List<Student>> s = li.stream()
                .collect(partitioningBy(student -> student.getName().startsWith("S")));

        s.forEach((aBoolean, students) -> System.out.println(
                aBoolean + " : " + students
        ));
    }

    public static void main(String[] args) {
        List<Student> stds = StudentDatabase.getStudentsList();

        partitioningBy_1(stds);
    }
}
