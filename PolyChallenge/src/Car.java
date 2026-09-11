public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.printf("The %s engine is starting%n", description);

    }

    public void drive(){
        runEngine();
        System.out.printf("The %s is driving%n", description);
    }

    protected void runEngine(){
        System.out.printf("The %s engine is running%n", description);
    }
}
