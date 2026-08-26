//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Customer tiaan = new Customer("Tiaan", "Tiaan@hotmail.com", 10_000);

        System.out.println(tiaan.getCreditLimit());

        System.out.print(Customer.helloMessage);
    }
}