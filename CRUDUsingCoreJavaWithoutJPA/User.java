package CRUDUsingCoreJavaWithoutJPA;


public class User {
    private int userId;
    private String userName;
    private String address;

    public User(int userId, String userName, String address) {
        this.userId = userId;
        this.userName = userName;
        this.address = address;
    }

    public User(String userName, String address) {
        this.userName = userName;
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
