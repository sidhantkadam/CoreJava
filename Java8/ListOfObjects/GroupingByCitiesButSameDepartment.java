package Java8.ListOfObjects;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByCitiesButSameDepartment {
    public static void main(String[] args) {
        List<Persons> persons = Arrays.asList(
                new Persons(1, "Ajay", 10000.0, "Technical Support", "Mumbai"),
                new Persons(2, "Vijay", 20000.0, "Devops", "Pune"),
                new Persons(3, "Sanjay", 15000.0, "Testing", "Mumbai"),
                new Persons(4, "Jay", 25000.0, "Development", "Nashik"),
                new Persons(5, "Raj", 30000.0, "HR", "Pune"),
                new Persons(6, "Sham", 18000.0, "HR", "Pune")
        );

        Map<String, Map<String, List<Persons>>> collect = persons.stream()
                .collect(Collectors.groupingBy(Persons::getDepartment, Collectors.groupingBy(Persons::getCity)));

        collect.forEach((s, map) -> System.out.println(s + " " + map));

        System.out.println("*******Another Approach********");

        Map<String, List<Persons>> collect1 = persons.stream()
                .collect(Collectors.groupingBy(Persons::getDepartment));

        collect1.forEach((dept, empList) -> {
            System.out.println("Department : " + dept);
            empList.stream()
                    .collect(Collectors.groupingBy(Persons::getCity))
                    .forEach((city, emps) ->
                    {
                        System.out.println("Employees in City : " + city);
                        emps.forEach(System.out::println);
                    });
        });
    }
}
