public class HybridCar extends Car{
    private int batterySize;
    private double avgKmPerLiter;
    private int cylinders;
    public HybridCar(String description) {
        super(description);
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println("The hybrid car is driving");
    }

    @Override
    protected void runEngine() {
        System.out.println("The hybrid car engine is running");
    }

    @Override
    public void startEngine() {
        System.out.println("The hybrid car engine is starting");
    }
}
