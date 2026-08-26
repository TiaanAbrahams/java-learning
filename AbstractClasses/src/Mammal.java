public abstract class Mammal extends Animal{

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.print(getExplicitType() + " ");
        System.out.print(speed.equalsIgnoreCase("slow")? "Walks" : "Running");
    }

    public abstract void shedHair();
}