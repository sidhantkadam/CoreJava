package Java8.ListOfObjects;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Persons {
    private Integer empId;
    private String empName;
    private Double salary;
    private String department;
    private String city;

    public Persons(Integer empId, String empName, Double salary, String department, String city) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.department = department;
        this.city = city;
    }

    public Persons() {
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

}

public class PersonGroupingByDepartment {
    public static void main(String[] args) {
        List<Persons> persons = Arrays.asList(
                new Persons(1, "Ajay", 10000.0, "Technical Support", "Mumbai"),
                new Persons(2, "Vijay", 20000.0, "Devops", "Pune"),
                new Persons(3, "Sanjay", 15000.0, "Testing", "Mumbai"),
                new Persons(4, "Jay", 25000.0, "Development", "Nashik"),
                new Persons(5, "Raj", 30000.0, "HR", "Pune")
        );

        //Group the persons by department using grouping by static method
        persons.stream()
                .collect(Collectors.groupingBy(Persons::getDepartment)).forEach(
                        (s, persons1) -> System.out.println(s + " " + persons1)
                );
    }
}
