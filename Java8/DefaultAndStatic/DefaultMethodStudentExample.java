package Java8.DefaultAndStatic;

import Java8.Student;
import Java8.StudentDatabase;

import java.util.Comparator;
import java.util.List;

public class DefaultMethodStudentExample {

    public static void sortByName(List<Student> list) {
        list.sort(Comparator.comparing(Student::getName));
        list.forEach(System.out::println);
    }

    public static void comparatorSortingChain(List<Student> li) {
        li.sort(Comparator.comparing(Student::getCgpa)
                .thenComparingInt(Student::getGradeLevel));
        li.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Student> studs = StudentDatabase.getStudentsList();

        System.out.println("Sort by Name : ");
        sortByName(studs);

        System.out.println("Sort by Chaining : ");
        comparatorSortingChain(studs);
    }
}
