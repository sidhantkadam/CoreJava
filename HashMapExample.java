import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Person
{
    private String name;
    private Integer id;

    public Person(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }
}

public class HashMapExample
{
    public static void main(String[] args)
    {
        Map<Person, Integer> personDetails = new HashMap<>();
        personDetails.put(new Person("aman", 20), 30000);
        personDetails.put(new Person("sunny",23),40000);

        System.out.println(personDetails.get(new Person("aman", 20)));
        System.out.println(personDetails.get(new Person("sunny", 23)));
    }
}
