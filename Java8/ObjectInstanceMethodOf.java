package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person1
{
    private String name;
    private Integer age;

    public Person1(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

class Comparator
{
    public int compareByName(Person1 a, Person1 b)
    {
        return a.getName().compareTo(b.getName());
    }

    public int compareByAge(Person1 a, Person1 b)
    {
        return a.getName().compareTo(b.getName());
    }
}

public class ObjectInstanceMethodOf
{
    public static void main(String[] args) {
        List<Person1> personList = new ArrayList<>();
        personList.add(new Person1("sid", 26));
        personList.add(new Person1("jay", 24));

        Comparator comp  = new Comparator();

        Collections.sort(personList, comp::compareByAge);
        System.out.println("Compare by age: ");
        personList.stream()
                .map(Person1::getAge)
                .forEach(System.out::println);

        Collections.sort(personList, comp::compareByName);
        System.out.println("Compare by name: ");
        personList.stream()
                .map(Person1::getName)
                .forEach(System.out::println);
    }
}
