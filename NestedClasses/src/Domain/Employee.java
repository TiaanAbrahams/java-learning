package Domain;

public class Employee {
    private String name;
    private int yearStarted;
    private int empID;

    public Employee() {
    }

    public Employee(int empID, String name, int yearStarted) {
        this.empID = empID;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%d %-8s %d".formatted(empID, name, yearStarted);
    }
}
