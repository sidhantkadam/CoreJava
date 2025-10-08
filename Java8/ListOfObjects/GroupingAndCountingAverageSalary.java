package Java8.ListOfObjects;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Emp {
    long salary;
    String department;

    public Emp(long salary, String department) {
        this.salary = salary;
        this.department = department;
    }
}


public class GroupingAndCountingAverageSalary {
    public static void main(String[] args) {
        Emp e1 = new Emp(10000, "A");
        Emp e2 = new Emp(20000, "B");
        Emp e3 = new Emp(30000, "A");
        Emp e4 = new Emp(40000, "A");
        Emp e5 = new Emp(50000, "B");

        List<Emp> lis = Arrays.asList(e1, e2, e3, e4, e5);
        Map<String, Double> collect = lis.stream()
                .collect(Collectors.groupingBy(employee -> employee.department, Collectors.averagingLong(emp -> emp.salary)));
        System.out.println(collect);
    }
}
