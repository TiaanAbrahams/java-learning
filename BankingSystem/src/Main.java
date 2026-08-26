//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        System.out.println(bank.addBranch("Adelaide") + "Bank branch added");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        System.out.println(bank.addCustomer("Adelaide", "Mike", 175.34) + "Second client added");
        bank.addCustomer("Adelaide", "Percy", 220.12);

        System.out.println(bank.addCustomerTransaction("Adelaide", "Tim", 44.22) + " add transaction");
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);
        System.out.println(bank.listCustomers("Adelaide", true));

        //bank.listCustomers("Adelaide", true);
    }
}