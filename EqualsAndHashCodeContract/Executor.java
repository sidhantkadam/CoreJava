package EqualsAndHashCodeContract;

import java.util.*;

class Employee {
    private final String name;
    private final int id;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee e = (Employee) o;
        return e.id == id && e.name.equals(((Employee) o).name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class Executor {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Sid");
        Employee e2 = new Employee(1, "Sid");

        System.out.println("Shallow Compare : " + (e1 == e2));
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

        System.out.println("Deep Compare : " + (e1.equals(e2)));

        Set<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);

        System.out.println(set.size());

        for (Employee employee : set) {
            System.out.println(employee);
        }
    }
}
