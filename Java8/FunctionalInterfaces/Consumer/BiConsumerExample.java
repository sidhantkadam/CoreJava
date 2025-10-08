package Java8.FunctionalInterfaces.Consumer;

import Java8.Student;
import Java8.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class BiConsumerExample {
    public static BiConsumer<Student, Double> biConsumer = (student, bonusPoint) -> {
        Double newScore = student.getCgpa() + bonusPoint;
        student.setCgpa(newScore);
        System.out.println(student.getName() + " : " + student.getCgpa());
    };

    public static Predicate<Student> filterForCgpa = student -> student.getCgpa() <= 9.5;

    public static void main(String[] args) {
        List<Student> studentsList = StudentDatabase.getStudentsList();

        studentsList.forEach(student -> {
            if (filterForCgpa.test(student)) {
                biConsumer.accept(student, 0.5);
            } else {
                biConsumer.accept(student, 0.0);
            }
        });
    }
}
