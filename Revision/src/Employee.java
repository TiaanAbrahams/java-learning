import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;

public class Employee extends Worker {
    private static long employeeId;
    private String hireDate;

    public Employee(){

    }

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeId++;
        this.hireDate = hireDate;
    }
}
