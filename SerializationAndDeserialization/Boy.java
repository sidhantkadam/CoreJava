package SerializationAndDeserialization;

import java.io.Serial;
import java.io.Serializable;

public class Boy implements Serializable
{
    @Serial
    private static final long serialVersionUID = 2198102181460897974L;

    private String name;
    private transient int  id;
    private String address;
    private String school;

    public Boy(String name, int id, String address, String school) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void print()
    {
        System.out.println("Boy has name is : " + this.getName());
    }
}
