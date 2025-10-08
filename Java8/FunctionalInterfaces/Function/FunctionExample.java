import Java8.FunctionalInterfaces.Predicate.PredicateExample;
import Java8.Student;
import Java8.StudentDatabase;

public class FunctionExample1 {

    public static Function<List<Student>, Map<String, Double>> studentFunctionMethod() {
        return students -> {
            Map<String, Double> mp = new HashMap<>();
            students.forEach(
                    student -> {
                        if (PredicateExample.s2.test(student)) {
                            mp.put(student.getName(), student.getCgpa());
                        }
                    }
            );
            return mp;
        };
    }
}

public static void main(String[] args) {

    List<Student> studentsList = StudentDatabase.getStudentsList();

    Map<String, Double> studentMp = FunctionExample1.studentFunctionMethod().apply(studentsList);
    System.out.println(studentMp);
}
