public class Laptop extends Computer{

    public Laptop(String operatingSystem) {
        super(operatingSystem);
    }

    @Override
    public void startup(){
        System.out.println("The " + getClass().getSimpleName() + " computer is starting up");
        System.out.println("Hello from " + getOperatingSystem());
    }
}
