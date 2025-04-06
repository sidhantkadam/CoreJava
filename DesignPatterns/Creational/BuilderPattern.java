package DesignPatterns.Creational;

    /*
    It's used in software design to construct a complex object step by step. It allows the
    construction of a product in a step-by-step manner, where the construction process can
    change based on the type of product being built.
    */

class User {
    private final String name;
    private final String address;
    private final int id;

    public User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.address = userBuilder.address;
        this.id = userBuilder.id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User : " +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", id=" + id;
    }

    static class UserBuilder {
        private String name;
        private String address;
        private int id;

        public UserBuilder() {

        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}


public class BuilderPattern {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setId(20)
                .setAddress("NSK")
                .setName("ABC")
                .build();
        System.out.println(user.toString());
    }
}
