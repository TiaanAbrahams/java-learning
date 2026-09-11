public class GasCar extends Car{
    private double avgKmPerLiter;
    private int cylinders;
    public GasCar(String description) {
        super(description);
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println("The gas car is now driving");
    }

    @Override
    protected void runEngine() {
        System.out.println("The gas car engine is running");
    }

    @Override
    public void startEngine() {
        System.out.println("The gas car engine is sarting");
    }
}
