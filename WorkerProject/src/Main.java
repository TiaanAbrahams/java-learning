//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "16/12/1985",9200000, "01/01/2000");
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());
        System.out.println(tim);
    }
}