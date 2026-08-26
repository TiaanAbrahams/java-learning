public class Gun extends ProductForSale{


    public Gun(String descripion, double price, String type) {
        super(descripion, price, type);
    }

    @Override
    public void showDetails() {
        System.out.println(" " + descripion);
    }
}
