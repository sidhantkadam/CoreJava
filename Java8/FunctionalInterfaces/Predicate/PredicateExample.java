package Java8.FunctionalInterfaces.Predicate;

import Java8.Student;
import Java8.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static Predicate<Student> s1 = student -> student.getActivities().contains("dancing");
    public static Predicate<Student> s2 = student -> student.getCgpa() > 8.2;

    public static void filterStudentsWithDancing() {
        List<Student> studentsList = StudentDatabase.getStudentsList();
        studentsList.forEach(student -> {
            if (s1.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void filterStudentsCgpa() {
        List<Student> studentsList = StudentDatabase.getStudentsList();
        studentsList.forEach(student -> {
            if (s2.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentsWithDancing();
        System.out.println("****************");
        filterStudentsCgpa();
    }
}
