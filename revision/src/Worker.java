import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;

    }
    public Worker(){

    }

    public  int getAge(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate birth = LocalDate.parse(birthDate,formatter);
        LocalDate today = LocalDate.now();

        return Period.between(birth,today).getYears();
    }

    public void terminate(String endDate){
        this.endDate = endDate;
        System.out.println("End date Set to " + endDate);
    }

    public double collectPay() {
        return 0.0;
    }
}
