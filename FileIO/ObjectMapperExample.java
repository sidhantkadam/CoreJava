package FileIO;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

class Person{
    private String name;
    private long mobile;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name:" + name + '\'' +
                ", mobile:" + mobile +
                ", age:" + age +
                '}';
    }
}

public class ObjectMapperExample
{
    public static void main(String[] args) throws IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("G:\\BackEnd\\Projects\\Core Java\\FileIO\\text.txt"));
        ObjectMapper objectMapper = new ObjectMapper();

        Person person = new Person();
        person.setAge(27);
        person.setMobile(342374673);
        person.setName("Ajay");

        String s = objectMapper.writeValueAsString(person);
        System.out.println(s);
        outputStream.writeChars(s);
    }
}
