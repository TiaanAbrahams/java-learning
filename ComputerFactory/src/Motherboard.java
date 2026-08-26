public class Motherboard extends Product {
    private int ramSlots;
    private int cardSlots;
    private String bois;
    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, String bois, int cardSlots, int ramSlots) {
        super(model, manufacturer);
        this.bois = bois;
        this.cardSlots = cardSlots;
        this.ramSlots = ramSlots;
    }

    public void loadProgram(String programName){
        System.out.println("Pragram " + programName + " is now loading...");
    }
}
