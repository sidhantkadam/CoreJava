package Java8;

import java.util.*;

class Person
{
    private int id;
    private String name;
    private int age;
    private String address;

    public Person(int id, String name, int age, String address)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }


}

public class PersonPredicate
{
    public static void main(String[] args)
    {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(12,"Ankit", 26, "Panchak"));
        personList.add(new Person(10,"Shubham", 26, "Makhmalabad"));
        personList.add(new Person(15,"Tushar", 26, "Ambad"));
        personList.add(new Person(11,"Sarang", 24, "Govind Nagar"));

        personList.forEach(System.out::println);

//        Predicate<Integer> person =
    }
}
