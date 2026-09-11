public class Animal{
    private String type;
    private String size;
    private double weight;

    public Animal(){}
    public Animal( String type, String size, double weight) {
        this.size = size;
        this.type = type;
        this.weight = weight;
    }

    public void move(String speed){
        System.out.println(type + " is " + speed );
    }

    public void makeNoise(){
        System.out.println(type + " makes noise");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
}
