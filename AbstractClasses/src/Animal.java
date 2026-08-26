public abstract class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.size = size;
        this.type = type;
        this.weight = weight;
    }

    public abstract void move(String speed);
    public abstract void makeNoise();

    public final String getExplicitType(){
        return getClass().getSimpleName() + " (" + type + ")";
    }
}
