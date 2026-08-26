public class Firearm {
    String brandName;
    double price;

    public Firearm(String brandName, double price){
        this.brandName = brandName;
        this.price = price;
    }

    public void shoot(){
        System.out.println("Firearm shoots");

    }

    public double getPrice(){
        return price;
    }

}
