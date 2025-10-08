package Java8.ListOfObjects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                ", salary=" + salary +
                '}';
    }
}

public class NthHighestSalary {
    public static void main(String[] args) {
        List<Employee> li = new ArrayList<>();

        li.add(new Employee("Hello", 343434));
        li.add(new Employee("Hello", 3646373));
        li.add(new Employee("Hello", 978896987));

        Integer salary = li.stream()
                .map(Employee::getSalary)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();
        System.out.println(salary);
    }
}
