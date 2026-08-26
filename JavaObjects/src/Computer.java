public class Computer {
    private String operatingSystem;

    public Computer(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void startup(){
        System.out.println("The computer is starting up");
        System.out.println("Hello from" + operatingSystem);
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
}
