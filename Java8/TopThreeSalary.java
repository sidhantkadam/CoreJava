package Java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employees {
    private String name;
    private int salary;

    public Employees(String name, int salary) {
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

public class TopThreeSalary
{
    public static void main(String[] args) {
        List<Employees> li = new ArrayList<>();

        li.add(new Employees("Hello", 500));
        li.add(new Employees("Hello", 1000));
        li.add(new Employees("Hello", 1500));
        li.add(new Employees("Hello", 2000));
        li.add(new Employees("Hello", 2500));
        li.add(new Employees("Hello", 3000));
        li.add(new Employees("Hello", 3500));

        List<Employees> reversed = li.reversed();
        List<Employees> list = reversed.stream()
                .limit(3)
                .toList();
        List<Integer> list1 = li.stream()
                .map(Employees::getSalary)
                .limit(li.size() - 3).toList();
        list1.forEach(System.out::println);
    }
}
