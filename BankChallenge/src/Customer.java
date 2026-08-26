import java.util.ArrayList;
//customers transaction can be either a credit or debit
record Customer(String name, ArrayList<Double> transactions) {
    public Customer(String name, double initialDeposit){
        this(name.toUpperCase(),
                new ArrayList<Double>(5_000));
        transactions.add(initialDeposit);
    }

}