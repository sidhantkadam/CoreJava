

import Java8.Student;
import Java8.StudentDatabase;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample1 {
    public static Supplier<List<Student>> allStudents = StudentDatabase::getStudentsList;
}

public static void main(String[] args) {
    System.out.println("All Students : " + SupplierExample1.allStudents.get());
}
