package Java8.Optional;

import Java8.Student;
import Java8.StudentDatabase;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalOrElse {

    //OrElse
    public static String optionalOrElse() {
//      Optional<Student> student = Optional.of(StudentDatabase.newStudent.get());

        Optional<Student> nullStd = Optional.ofNullable(null);

        return nullStd.map(Student::getName)
                .orElse("Default");
    }

    //OrElseGet
    public static String optionalOrElseGet() {
        Optional<Student> student = Optional.of(StudentDatabase.newStudent.get());

//        Optional<Student> nullStd = Optional.ofNullable(null);

        return student.map(Student::getName)
                .orElseGet(() -> "Default");
    }

    //orElseThrow
    public static Student optionalOrElseThrow() {

        Student studentName = StudentDatabase.getStudentsList()
                .stream()
                .filter(stdName -> stdName.getName()
                        .equals("Pratik"))
                .findAny()
                .orElseThrow(() -> new RuntimeException("Student not Found !"));

        return studentName;
    }

    public static void main(String[] args) {
        String orElse = optionalOrElse();
        System.out.println("optionalOrElse : " + orElse);

        String get = optionalOrElseGet();
        System.out.println("optionalOrElseGet : " + get);

        Student orElseThrow = optionalOrElseThrow();
        System.out.println("optionalOrElseGet : " + orElseThrow);
    }
}
