package Comparator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class PersonP implements Comparable<PersonP> {
    public String name;
    public int id;
    public String address;
    public int age;

    public PersonP(String name, int id, String address, int age) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person: " +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                ", age=" + age;
    }

    //Natural ordering by implementing Comparable interface
    @Override
    public int compareTo(PersonP p) {
        return Integer.compare(age, p.age);
    }
}

class OperatorClass {
    public static void main(String[] args) {
        List<PersonP> persons = new ArrayList<>();

        PersonP p1 = new PersonP("sid", 12, "NSK", 27);
        PersonP p2 = new PersonP("pranav", 1, "Mumbai", 25);
        PersonP p3 = new PersonP("mani", 34, "Pune", 19);

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        Collections.sort(persons);
        persons.forEach(System.out::println);
        System.out.println("***********************");
        persons.sort(Comparator.comparing(PersonP :: getAddress));
        persons.forEach(System.out::println);
    }
}