import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialtransaction){
        this.name = name;
        transactions = new ArrayList<Double>();
        transactions.add(initialtransaction);
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double transactoin){
        transactions.add(transactoin);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
