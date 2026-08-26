public class Employee extends Worker{
    private long employeeID;
    private String hireDate;

    public Employee(String name, String birthDate, long employeeID, String hireDate) {
        super(name, birthDate);
        this.employeeID = employeeID;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
