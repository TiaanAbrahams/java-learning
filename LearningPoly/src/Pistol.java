public class Pistol extends Firearm {
    String ammo;
    Firearm firearm;

    public Pistol(String brandName, String ammo, double price) {
        super(brandName, price);
        this.ammo = ammo;
    }
    @Override
    public void shoot(){
        System.out.println(brandName + " "+ getClass().getSimpleName() + " shoots " + ammo );
    }


}
