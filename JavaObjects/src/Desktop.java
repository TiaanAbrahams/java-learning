public class Desktop extends Computer {

    public Desktop(String operatingSystem) {

        super(operatingSystem);
    }

    public void startup(){
        System.out.println("The computer is starting up");
        System.out.println("Hello from" + getOperatingSystem());
    }

}
