package Java8.StreamAPI.Terminal;

import Java8.Student;
import Java8.StudentDatabase;
import java.util.List;
import static java.util.stream.Collectors.counting;

public class StreamsCounting
{
    public static void main(String[] args) {
        List<Student> studentsList = StudentDatabase.getStudentsList();
        Long s = studentsList.stream()
                .map(Student::getName)
                .filter(str -> str.startsWith("S"))
                .collect(counting());

        System.out.println(s);
    }
}
