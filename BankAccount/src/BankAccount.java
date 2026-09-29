public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public boolean deposit(double amount){
        if(amount > 0){
            balance+=amount;
            return true;
        }
        return false;
    }
    public Boolean withdraw(double amount){
        double testAmount = balance - amount;
        if(testAmount > 0){
            balance-=amount;
            return true;
        }
        return false;
    }
}
