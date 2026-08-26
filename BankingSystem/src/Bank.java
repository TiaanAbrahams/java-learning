import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    private Branch findBranch(String name){
        Branch branch = null;
        if(branches.size() < 0){
            return branch;
        }
        for(Branch b: branches){
            if(b.getName().equalsIgnoreCase(name)){
                return b;
            }
        }
        return branch;
    }

    public boolean addBranch(String branch){
        if(findBranch(branch) == null){
            branches.add(new Branch(branch));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName, String customerName,
                               double initialTransaction) {

        Branch branch = findBranch(branchName);

        if (branch != null) {

            for (Customer c : branch.getCustomers()) {
                if (c.getName().equalsIgnoreCase(customerName)) {
                    return false;
                }
            }

            Customer customer = new Customer(customerName, initialTransaction);
            branch.getCustomers().add(customer);

            return true;
        }

        return false;
    }
    public boolean addCustomerTransaction(String branchName ,String customerName ,double transaction){
        if(findBranch(branchName) != null){
            for(Customer cus: findBranch(branchName).getCustomers()){
                if(cus.getName().equalsIgnoreCase(customerName)){
                    cus.addTransaction(transaction);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransactions){
        int n = 1;

        if(findBranch(branchName) != null){
            System.out.printf("Customer details for branch %s%n",branchName);
            //System.out.println(findBranch(branchName).getCustomers());
                for(Customer b: findBranch(branchName).getCustomers()) {
                    System.out.printf("Customer: %s[%d]%n", b.getName(), n++);
                    if (printTransactions) {
                        System.out.println("Transactions");
                        int i = 1;
                        for (double t : b.getTransactions()) {
                            System.out.printf("[%d] Amount %.2f%n", i++, t);
                        }
                    }
                }
                return true;
            }
        return false;
    }
}

