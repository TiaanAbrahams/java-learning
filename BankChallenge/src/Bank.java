import java.util.ArrayList;
//Should be able to add a customer to a list
//the bank should allow the the customer make transactions to an exiting customer
//print statement : Customer name, transaction amounts - This method should use unboxing
public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    public String addCustomer(String name, double initialDeposit){
        if(getCustomer(name) == null){
            Customer customer = new Customer(name, initialDeposit);
            customers.add(customer);
            return String.format("Customer (%s) was added", name);
        }
        return String.format("Customer (%s) already created", name);
    }

    private Customer getCustomer(String name){
        for(Customer customer: customers){
            if(customer.name().equalsIgnoreCase(name)){
                return customer;
            }
        }
        System.out.printf("Customer (%s) not found %n", name);
        return null;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "customers=" + customers +
                ", name='" + name + '\'' +
                '}';
    }
    public void addTransaction(String name, double transactionAmount){
        Customer customer = getCustomer(name);
        if(customer != null){
            customer.transactions().add(transactionAmount);
            System.out.println("Tansaction of R" + transactionAmount + " processed");
        }else{
            System.out.println("Transaction failed!");
        }

    }

    public void printStatement(String customerName){
        Customer customer = getCustomer(customerName);
        if(customer == null){
            return;
        }

        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customer.name());
        for(double d: customer.transactions()){
            System.out.println("Transaction " + d);
        }
    }

}
