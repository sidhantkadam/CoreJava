import java.util.Objects;

class Person1
{
    private int id;
    private String name;
    private String address;

    public Person1(int id, String name,String address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return id == person1.id && Objects.equals(name, person1.name) && Objects.equals(address, person1.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }
}

public class EqualsAndHashcode
{
    public static void main(String[] args) {
        Person1 p1 = new Person1(2,"sid", "nsk");
        Person1 p2 = new Person1(2,"sid", "nsk");
        System.out.println(p1.equals(p2));
    }
}
