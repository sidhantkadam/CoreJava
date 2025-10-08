package CRUDUsingCoreJavaWithoutJPA;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            DAOClass daoClass = new DAOClass();
            Scanner sc = new Scanner(System.in);
            String continueLoop = "";

            do {
                System.out.println("Available operations: Create Employee, Get Employee by Id, Delete Employee by Id");
                System.out.print("Enter operation: ");
                String operation = sc.nextLine();
                switch (operation) {
                    case "Create Employee":
                        boolean newEmployee = daoClass.createNewEmployee();
                        if (newEmployee) {
                            System.out.println("Employee Created Successfully..");
                        } else {
                            System.out.println("Failed to Create Employee !");
                        }
                        break;

                    case "Get Employee by Id":
                        System.out.println("Enter Employee Id : ");
                        int empId = sc.nextInt();
                        EmployeeDetails employeeById = daoClass.getEmployeeById(empId);
                        if (employeeById != null) {
                            System.out.println(employeeById);
                        } else {
                            System.out.println("Employee not found with ID: " + empId);
                        }
                        break;

                    case "Update Employee":
                        System.out.println("Please Try After Some Time !");

                    case "Delete Employee by Id":
                        System.out.println("Enter Emp Id : ");
                        int empID = sc.nextInt();
                        boolean deleted = daoClass.deleteEmployeeById(empID);
                        if(deleted){
                            System.out.println("Successful..");
                        }
                        else {
                            System.out.println("Failed to Delete !");
                        }
                        break;
                    default:
                        System.out.println("Invalid operation: " + operation);
                        break;
                }
                System.out.println("Do you want to continue? (yes/no): ");
                continueLoop = sc.nextLine();
            } while (continueLoop.equalsIgnoreCase("yes"));

            sc.close();
            System.out.println("Exiting Program");
        } catch (SQLException e) {
            System.out.println("DataBase Error !" + e.getMessage());
            e.printStackTrace();
        }
    }
}
