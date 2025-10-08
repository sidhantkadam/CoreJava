package Java8.ListOfObjects;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDepartmentWithHighestAvgSalary {
    public static void main(String[] args) {
        List<Persons> persons = Arrays.asList(
                new Persons(1, "Ajay", 10000.0, "Technical Support", "Mumbai"),
                new Persons(2, "Vijay", 20000.0, "Devops", "Pune"),
                new Persons(3, "Sanjay", 15000.0, "Testing", "Mumbai"),
                new Persons(4, "Jay", 25000.0, "Development", "Nashik"),
                new Persons(5, "Raj", 30000.0, "HR", "Pune"),
                new Persons(6, "Sham", 18000.0, "HR", "Pune")
        );

        //Find the department with the highest average salary
        Map<String, Double> mapList = persons.stream()
                .collect(Collectors.groupingBy(Persons::getDepartment,
                        Collectors.averagingDouble(Persons::getSalary)));

        mapList.forEach(
                ((s, d) -> System.out.println(s + " : " + d))
        );
    }
}
