package Java8.ListOfObjects;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfPersonsByDepartment {
    public static void main(String[] args) {
        List<Persons> persons = Arrays.asList(
                new Persons(1, "Ajay", 10000.0, "Technical Support", "Mumbai"),
                new Persons(2, "Vijay", 20000.0, "Devops", "Pune"),
                new Persons(3, "Sanjay", 15000.0, "Testing", "Mumbai"),
                new Persons(4, "Jay", 25000.0, "Development", "Nashik"),
                new Persons(5, "Raj", 30000.0, "HR", "Pune")
        );

        Map<String, Long> collect = persons.stream()
                .collect(Collectors.groupingBy(Persons::getDepartment, Collectors.counting()));

        collect.forEach(
                (s, count) -> System.out.println(s + " : " + count)
        );
    }
}
