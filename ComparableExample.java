import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
    Integer age;
    String name;
    Integer id;

    public Employee(Integer age, String name, Integer id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee : " +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id=" + id +
                "\n";
    }

    @Override
    public int compareTo(Employee o) {
        if (id.equals(o.id))
            return 0;
        else if (id > o.id) {
            return 1;
        } else {
            return -1;
        }
    }
}

class compareByComparable implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.age.compareTo(o2.age);
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();

        employee.add(new Employee(25, "Ram", 2));
        employee.add(new Employee(26, "Sham", 3));
        employee.add(new Employee(120, "Lakhan", 4));
        employee.add(new Employee(100, "Bharat", 1));

        Collections.sort(employee, new compareByComparable());

        for (Employee e : employee) {
            System.out.println(e.age + " " + e.id + " " + e.name);
        }

        Collections.sort(employee);
        for (Employee e : employee) {
            System.out.println(e.age + " " + e.id + " " + e.name);
        }
    }
}
