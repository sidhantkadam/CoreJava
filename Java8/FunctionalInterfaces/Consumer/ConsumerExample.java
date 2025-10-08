package Java8.FunctionalInterfaces.Consumer;

import Java8.Student;
import Java8.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static List<Student> studentsList = StudentDatabase.getStudentsList();

    public static Consumer<Student> s1 = student -> System.out.println(student);
    public static Consumer<Student> getName = (student -> System.out.print(student.getName()));
    public static Consumer<Student> getActivities = (student -> System.out.println(student.getActivities()));

    public static void printStudents() {
        System.out.println("Student List : ");

        studentsList.forEach(s1);
    }

    public static void printNameAndActivities() {
        System.out.println();
        System.out.println("Student name with activities : ");

        studentsList.forEach(getName.andThen(getActivities));
    }

    public static void printNameAndActivitiesWithConditions() {
        System.out.println();
        System.out.println("Student name with activities and condition : ");

        studentsList.forEach(
                student -> {
                    if (student.getGradeLevel() > 8) {
                        getName.andThen(getActivities).accept(student);
                    }
                }
        );
    }

    public static void main(String[] args) {
        printStudents();
        printNameAndActivities();
        printNameAndActivitiesWithConditions();
    }
}
