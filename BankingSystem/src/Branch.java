import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers= new ArrayList<Customer>();

    public Branch(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialTransaction) {

        for (Customer c : customers) {
            System.out.println(c.getName());
            if (c.getName().equalsIgnoreCase(name)) {
                return false;  // Customer already exists
            }
        }

        customers.add(new Customer(name, initialTransaction));
        return true;
    }


    public boolean addCustomerTransaction(String name, double transaction){
        for(Customer c: customers){
            if(c.getName().equalsIgnoreCase(name)){
                c.addTransaction(transaction);
                return true;
            }
        }
        return false;
    }

    private Customer findCustomer(String name){
        Customer customer = null;

        for(Customer c: customers){
            if(c.getName().equalsIgnoreCase(name)){
                customer = c;
            }
        }
        return customer;
    }
}
