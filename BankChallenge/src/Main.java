//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer bob = new Customer("bob", 1000);
        System.out.println(bob);
        Bank fnb = new Bank("Fnb");

        System.out.println(fnb.addCustomer("Bob", 50_000));
        System.out.println(fnb);

        fnb.addTransaction("BOB",150);
        fnb.printStatement("BOB");
    }

}