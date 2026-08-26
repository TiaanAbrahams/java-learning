public abstract class ProductForSale {
    private String type;
    protected double price;
    protected String description;

    public ProductForSale(String description, double price, String type) {
        this.description = description;
        this.price = price;
        this.type = type;
    }

    public double getSalesPrice(int quantity){
        return quantity * price;
    }

    public void printPricedItem(int quantity){
        System.out.printf("Description: %s (X%d) | R %.2f%n",
                description, quantity, getSalesPrice(quantity));
    }

    public abstract void showDetails();
    public abstract double getPrice();
}
