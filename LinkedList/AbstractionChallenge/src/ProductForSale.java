public abstract class ProductForSale {
    private String type;
    private double price;
    protected String descripion;

    public ProductForSale(String descripion, double price, String type) {
        this.descripion = descripion;
        this.price = price;
        this.type = type;
    }

    private double getSalesPrice(int quantity){
        return quantity * price;
    }

    public void printPricedItem(int quantity){
        System.out.printf("Type: %s Price: R%.2f x %d",
                type, getSalesPrice(quantity), quantity);
    }

    public abstract void showDetails();
}
