public class Gun extends ProductForSale{

    public Gun(String description, double price, String type) {
        super(description, price, type);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void showDetails() {
        if(description.equalsIgnoreCase("Glock 17")){
            System.out.println("""
                    Glock 17:
                    *Capacity: 17 +1
                    *Caliber: 9mm
                    *Gen 5 Mos
                    *Magazines x2
                    """);
        } else if (description.equalsIgnoreCase("Sig P320")) {
            System.out.println("""
                    Sig P320:
                    *Capacity: 17 +1
                    *Caliber: 9mm
                    *Optics Ready
                    *Magazines x3
                    """);
        } else if (description.equalsIgnoreCase("Daniel Defence V7")) {
            System.out.println("""
                    Daniel Defence V7:
                    *Capacity: 30
                    *Caliber: 556rem
                    *Free-Float Handguard
                    *Magazines x1
                    *Barrel Length: 16 inches
                    """);
        }else {
            System.out.println("There is no product description available");
        }
    }
}
