package Java8.StreamAPI;

import Java8.Student;
import Java8.StudentDatabase;

import java.util.List;

public class ReduceExample {

    public static void main(String[] args) {
        List<Student> studentsList = StudentDatabase.getStudentsList();
        Double reduce = studentsList.stream()
                .map(Student::getCgpa)
                .reduce((s1, s2) -> s1 > s2 ? s1 : s2)
                .get();
        System.out.println(reduce);
    }
}
