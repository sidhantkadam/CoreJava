package Java8.Optional;

import Java8.Student;
import java.util.Optional;

public class OptionalExample {

    public static String getStudentName() {
//        Student student = StudentDatabase.NewStudent.get();
        Student student = null;
        if (student != null) {
            return student.getName();
        }
        return null;
    }

    public static Optional<String> getStudentNameOptional() {
//        Optional<String> optionalStudent = Optional.ofNullable(StudentDatabase.NewStudent.get().getName());
        Optional<Student> optionalStudent = Optional.ofNullable(null);
        if(optionalStudent.isPresent()) {
            return optionalStudent.map(Student::getName);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
//        String studentName = getStudentName();
//        if (studentName != null) {
//            System.out.println("Length of Student name without optional : " + studentName.length());
//        }
//        System.out.println("Student not found..");

        Optional<String> studentNameOptional = getStudentNameOptional();
        System.out.println("Length of Optional Student name : " + studentNameOptional.get().length());
    }
}
