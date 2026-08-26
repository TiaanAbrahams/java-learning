public class ElectricCar extends Car{
    private double avgKmPerCharge;
    private int batterySize;
    public ElectricCar(String description) {
        super(description);
    }

    @Override
    public void drive() {
        runEngine();
        System.out.println("The electric car is now driving");
    }

    @Override
    protected void runEngine() {
        System.out.println("The electric engine is no activated");
    }

    @Override
    public void startEngine() {
        System.out.println("Electric engine is now powered on");
    }
}
