public class Rifle extends Firearm{
    String ammo;

    public Rifle(String brandName, String ammo, double price) {
        super(brandName, price);
        this.ammo = ammo;
    }

    @Override
    public void shoot(){
        System.out.println(brandName + " " + getClass().getSimpleName() + " shoots " + ammo );
    }

}
