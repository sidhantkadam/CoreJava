package CRUDUsingCoreJavaWithoutJPA;

import java.time.LocalDate;

public class EmployeeDetails {
    private int id;
    private String name;
    private int age;
    private String bloodGroup;
    private String emailId;
    private char gender;
    private String designation;
    private String unit;
    private String baseLocation;
    private LocalDate dateOfBirth;
    private LocalDate dateOfJoining;
    private Address address;
    private FinancialDetails accountDetails;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getBaseLocation() {
        return baseLocation;
    }

    public void setBaseLocation(String baseLocation) {
        this.baseLocation = baseLocation;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public FinancialDetails getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(FinancialDetails accountDetails) {
        this.accountDetails = accountDetails;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", emailId='" + emailId + '\'' +
                ", gender=" + gender +
                ", designation='" + designation + '\'' +
                ", unit='" + unit + '\'' +
                ", baseLocation='" + baseLocation + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dateOfJoining=" + dateOfJoining +
                ", address=" + address +
                ", accountDetails=" + accountDetails +
                '}';
    }
}
