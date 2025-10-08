package CRUDUsingCoreJavaWithoutJPA;

import java.sql.*;

public class DAOClass {

    private static final String URL = "jdbc:mysql://localhost:3306/employeejdbc";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private final Connection connection;

    public DAOClass() throws SQLException {
        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        System.out.println("Successfully Connected to MySql DB");
    }

    //Create New Employee using statement
    public boolean createNewEmployee() {

        PreparedStatement statement1 = null;
        PreparedStatement statement2 = null;
        PreparedStatement statement3 = null;
        ResultSet generatedKeysEmployee = null;
        ResultSet generatedKeysAddress = null;
        ResultSet generatedKeysFinancial = null;

        String createNewAddressQuery = "Insert Into address (emp_id, street, city, state, country, pin_code) Values (?, ?, ?, ?, ?, ?)";

        String createNewFinancialDetailsQuery = "Insert Into financial_details (emp_id, account_number, salary, pf_account_number) Values(?, ?, ?, ?)";

        String createNewEmployee = "INSERT INTO employee_details (name, age, blood_group, email_id, gender, designation, unit, base_location, date_of_birth, date_of_joining) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            connection.setAutoCommit(false);

            //1. Insert data into Employee DB
            statement1 = connection.prepareStatement(createNewEmployee, Statement.RETURN_GENERATED_KEYS);
            statement1.setString(1, "Santosh Sharma");
            statement1.setInt(2, 26);
            statement1.setString(3, "B+ve");
            statement1.setString(4, "santosh.sharma@gmail.com");
            statement1.setString(5, Character.toString('M'));
            statement1.setString(6, "Senior Systems Engineer");
            statement1.setString(7, "FSADM-3");
            statement1.setString(8, "Pune, Phase-2");
            statement1.setDate(9, Date.valueOf("1972-01-10"));
            statement1.setDate(10, Date.valueOf("2022-03-22"));

            int employeeId;
            int rowAffected = statement1.executeUpdate();
            if (rowAffected > 0) {
                generatedKeysEmployee = statement1.getGeneratedKeys();
                if (generatedKeysEmployee.next()) {
                    employeeId = generatedKeysEmployee.getInt(1);
                    System.out.println("Data stored in Employee Details DB with ID: " + employeeId);
                } else {
                    throw new RuntimeException("Failed to retrieve employee Id.");
                }
            } else {
                throw new SQLException("Failed to Insert Data into Employee Details!");
            }

            //2. Insert Data into Address DB
            statement2 = connection.prepareStatement(createNewAddressQuery, Statement.RETURN_GENERATED_KEYS);
            statement2.setInt(1, employeeId);
            statement2.setString(2, "Wakad");
            statement2.setString(3, "Pune");
            statement2.setString(4, "Maharashtra");
            statement2.setString(5, "India");
            statement2.setString(6, "411033");

            int addressId;
            int rowsUpdated = statement2.executeUpdate();

            if (rowsUpdated > 0) {
                generatedKeysAddress = statement1.getGeneratedKeys();
                if (generatedKeysAddress.next()) {
                    addressId = generatedKeysAddress.getInt(1);
                    System.out.println("Data stored in Address DB with ID: " + addressId);
                } else {
                    throw new RuntimeException("Failed to retrieve address Id :");
                }
            } else {
                throw new SQLException("Failed to Insert Data !");
            }

            //3. Insert Data into Financial DB
            statement3 = connection.prepareStatement(createNewFinancialDetailsQuery, Statement.RETURN_GENERATED_KEYS);
            statement3.setInt(1, employeeId);
            statement3.setLong(2, 276327236790L);
            statement3.setDouble(3, 48000.00);
            statement3.setLong(4, 376786);

            int financialId;
            int rowsAffected = statement3.executeUpdate();

            if (rowsAffected > 0) {
                generatedKeysFinancial = statement3.getGeneratedKeys();
                if (generatedKeysFinancial.next()) {
                    financialId = generatedKeysFinancial.getInt(1);
                    System.out.println("Data stored in Financial DB with ID: " + financialId);
                } else {
                    throw new RuntimeException("Failed to retrieve address Id :");
                }
            } else {
                throw new SQLException("Failed to Insert Data !");
            }

            //Update Employee Details with financial and address id's
            String updateIds = "Update employee_details set address_id = ?, financial_details_id = ? Where id = ? ";

            PreparedStatement statement = connection.prepareStatement(updateIds);
            statement.setInt(1, addressId);
            statement.setInt(2, financialId);
            statement.setInt(3, employeeId);
            int updatedRows = statement.executeUpdate();
            if (updatedRows > 0) {
                System.out.println("Employee Details updated with Address ID: " + addressId + " and Financial ID: " + financialId);
                connection.commit();
                return true;
            } else {
                throw new SQLException("Failed to update Employee Details with Address and Financial IDs.");
            }
        } catch (SQLException | RuntimeException e) {
            System.err.println("Error during employee creation. Rolling back transaction.");
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException rollbackException) {
                System.err.println("Error during rollback: " + rollbackException.getMessage());
            }
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (generatedKeysEmployee != null) generatedKeysEmployee.close();
                if (generatedKeysAddress != null) generatedKeysAddress.close();
                if (generatedKeysFinancial != null) generatedKeysFinancial.close();
                if (statement1 != null) statement1.close();
                if (statement2 != null) statement2.close();
                if (statement3 != null) statement3.close();
                if (connection != null) {
                    connection.setAutoCommit(true);
                }
            } catch (SQLException e) {
                System.out.println("Error closing resources !" + e.getMessage());
            }
        }
    }

    public EmployeeDetails getEmployeeById(int id) {
        String query = "Select * From employee_details Where id = ? ";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                EmployeeDetails emp = new EmployeeDetails();
                emp.setId(resultSet.getInt(1));
                emp.setName(resultSet.getString(2));
                emp.setAge(resultSet.getInt(3));
                emp.setBloodGroup(resultSet.getString(4));
                emp.setEmailId(resultSet.getString(5));
                emp.setGender(resultSet.getString(6).charAt(0));
                emp.setDesignation(resultSet.getString(7));
                emp.setUnit(resultSet.getString(8));
                emp.setBaseLocation(resultSet.getString(9));
                emp.setDateOfBirth(resultSet.getDate(10).toLocalDate());
                emp.setDateOfJoining(resultSet.getDate(11).toLocalDate());
                return emp;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean deleteEmployeeById(int empID) {
        String queryAddress = "Delete From address Where emp_id = ?";
        String queryFinancial = "Delete From financial_details Where emp_id = ?";
        String queryEmp = "Delete From employee_details where id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(queryAddress);
            statement.setInt(1, empID);
            int rowsAffected = statement.executeUpdate();

            PreparedStatement statement1 = connection.prepareStatement(queryFinancial);
            statement1.setInt(1, empID);
            int rowsAffected1 = statement.executeUpdate();

            PreparedStatement statement2 = connection.prepareStatement(queryEmp);
            statement2.setInt(1, empID);
            int rowsAffected2 = statement.executeUpdate();
            if (rowsAffected > 0 && rowsAffected1 > 0 && rowsAffected2 > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
