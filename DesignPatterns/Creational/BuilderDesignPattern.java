package DesignPatterns.Creational;

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


public class BuilderDesignPattern {
    public static void main(String[] args) {
        User user = new User
                .UserBuilder()
                .setId(23)
                .setAddress("nsk")
                .build();
        System.out.println(user.toString());
    }
}
