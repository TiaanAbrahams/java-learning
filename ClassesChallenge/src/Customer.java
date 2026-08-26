public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    static String helloMessage = "Hello there";

    public Customer(String name, String email, double creditLimit){
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public Customer(){
        this("User", "user@hotmail.com");
    }

    public Customer(String name, String email){
        this(name, email, 1000);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
