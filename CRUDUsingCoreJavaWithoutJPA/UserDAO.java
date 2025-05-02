package CRUDUsingCoreJavaWithoutJPA;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private final String jdbcUrl;
    private final String userName;
    private final String password;

    public UserDAO(String jdbcUrl, String userName, String password) {
        this.jdbcUrl = jdbcUrl;
        this.userName = userName;
        this.password = password;
    }

    //A private helper method to establish a database connection.
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(jdbcUrl, userName, password);
    }

    public boolean createUser(User user) {
        String sql = "INSERT INTO users(userId, userName, address) VALUES (?, ?, ?)";

        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, user.getUserId());
            preparedStatement.setString(2, user.getUserName());
            preparedStatement.setString(3, user.getAddress());
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";

        try (Connection connection = getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                users.add(new User(resultSet.getInt("userId"),
                        resultSet.getString("userName"),
                        resultSet.getString("address")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
}
