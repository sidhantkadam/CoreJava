package ObjectCreationMethods;

import java.lang.reflect.Constructor;

class UserInfo {
    String name;
    int userId;

    public UserInfo(String name, int userId) {
        this.name = name;
        this.userId = userId;
        System.out.println("Constructor called");
    }

    @Override
    public String toString() {
        return "userInfo :" + "\n"
                + name + "\n" +
                userId;
    }
}

class UsingNewInstanceConstructorClassMethod {
    public static void main(String[] args) throws Exception, ClassNotFoundException {
        Class<?> classObj = Class.forName("ObjectCreationMethods.UserInfo");

        Constructor<?> constructor = classObj.getConstructor(String.class, int.class);

        UserInfo abc = (UserInfo) constructor.newInstance("abc", 40);
        String string = abc.toString();
        System.out.println(string);
    }
}

