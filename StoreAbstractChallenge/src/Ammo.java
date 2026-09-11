public class Ammo extends ProductForSale{

    public Ammo(String description, double price, String type) {
        super(description, price, type);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void showDetails() {
        if(description.equalsIgnoreCase("Winchester 9mm")){
            System.out.println("""
                   Winchester 9mm
                   *Capacity: 50 rounds (box)
                   *Caliber: 9mm Luger
                   *115 Grain
                   *Muzzle Velocity: 1190 fps
                    """);
        } else if (description.equalsIgnoreCase("Federal Champion 9mm")) {
            System.out.println("""
                    Federal Champion 9mm
                    *Capacity: 50 rounds (box)
                    *Caliber: 9mm Luger
                    *115 Grain
                    *Muzzle Velocity: 1125 fps
                    """);
        } else if (description.equalsIgnoreCase("PMC Bronze .223")) {
            System.out.println("""
                    Federal Champion 9mm
                    *Capacity: 20 rounds (box)
                    *Caliber: .223 Remington (5.56mm equivalent)
                    *55 Grain
                    *Muzzle Velocity: 2900 fps
                    """);
        }else {
            System.out.println("There is no product description available");
        }
    }
}
