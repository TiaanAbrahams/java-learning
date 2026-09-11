import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    public void retire(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate end = LocalDate.parse(endDate, formatter);

        if(end.isBefore(LocalDate.now())){
            isRetired = true;
        }
    }

    @Override
    public double collectPay() {
            return isRetired? (annualSalary * 26) * 0.9 : annualSalary * 26;
    }
}
