package CRUDUsingCoreJavaWithoutJPA;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/userdb";
        String userName = "root";
        String passWord = "root";

        UserDAO userDAO = new UserDAO(jdbcUrl, userName, passWord);

        User user = new User(1, "sid", "nsk");
        if (userDAO.createUser(user)) {
            System.out.println("User created !");
        }

        List<User> allUsers = userDAO.getAllUsers();
        System.out.println("All users :" + allUsers);
    }
}
