public class Animal {
    protected String type;
    private double weight;
    private String Size;

    public Animal(){

    }

    public Animal(String type, double weight, String size) {
        this.type = type;
        this.weight = weight;
        Size = size;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", Size='" + Size + '\'' +
                '}';
    }

    public void move(String speed){
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise(){
        System.out.println(type + "makes some kind of noise");
    }
}
