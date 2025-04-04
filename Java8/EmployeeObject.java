package Java8;

import java.util.*;
import java.util.Comparator;

    /*
    Find emp with highest salary with Sales Dept.
     */

class Employee1 {
    String name;
    int salary;
    String department;

    public Employee1(String name, int salary, String department) {
        this.department = department;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee : " +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'';
    }
}

public class EmployeeObject {
    public static void main(String[] args) {
        List<Employee1> empList = new ArrayList<>();
        empList.add(new Employee1("sid", 200000, "Accounts"));
        empList.add(new Employee1("pranav", 300000, "Sales"));
        empList.add(new Employee1("keshav", 400000, "Sales"));
        empList.add(new Employee1("abhi", 800000, "Sales"));
        empList.add(new Employee1("ashok", 500000, "IT"));
        empList.add(new Employee1("aman", 500000, "IT"));
        empList.add(new Employee1("sham", 100000, "Marketing"));
        empList.add(new Employee1("ram", 2000000, "Marketing"));
        empList.add(new Employee1("bhim", 750000, "Marketing"));

        String max = empList.stream()
                .filter(employee -> Objects.equals(employee.department, "Sales"))
                .max(Comparator.comparing(employee -> employee.salary))
                .get()
                .toString();
        System.out.println(max);
    }
}