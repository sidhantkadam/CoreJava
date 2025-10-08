package CRUDUsingCoreJavaWithoutJPA;

public class FinancialDetails {
    private int id;
    private int empId;
    private long accountNumber;
    private double salary;
    private long pfAccountNumber;

    public FinancialDetails(int id, int empId, long accountNumber, double salary, long pfAccountNumber) {
        this.id = id;
        this.empId = empId;
        this.accountNumber = accountNumber;
        this.salary = salary;
        this.pfAccountNumber = pfAccountNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getPfAccountNumber() {
        return pfAccountNumber;
    }

    public void setPfAccountNumber(long pfAccountNumber) {
        this.pfAccountNumber = pfAccountNumber;
    }
}
