package CollectionsFramework.CollectionInterface;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person {
    Integer id;
    String name;

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class HashSetClass {
    public static void main(String[] args) {
        Person p1 = new Person(1, "sid");
        Person p2 = new Person(2, "pranav");
        Person p3 = new Person(3, "sid");

        Set<Person> p = new HashSet<>();
        p.add(p1);
        p.add(p2);
        p.add(p3);

        p.forEach(System.out::println);
    }
}
