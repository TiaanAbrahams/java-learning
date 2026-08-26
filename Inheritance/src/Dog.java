public class Dog extends Animal{
    private String earShape;
    private String tailShape;

    public Dog(){
        super("Mut", 50, "Small");
    }
    public Dog(String type, Double weight){
        this(type, weight, "Perky", "curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight, weight < 15 ? "Small":( weight < 35? "Medium": "Large"));
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){
        if(type.equalsIgnoreCase("wolf")){
            System.out.print("Howl Oh Whooo!");
        }

        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        //System.out.println("Dogs walk, run and wag their tail");
        if(speed.equalsIgnoreCase("slow")){
            walk();
            wagTail();
        }else{
            run();
            bark();
        }
        System.out.println();
    }

    private void bark(){
        System.out.print("Woof! ");
    }
    private void run(){
        System.out.print("Dog running ");
    }
    private void walk(){
        System.out.print("Dog walking ");
    }
    private void wagTail(){
        System.out.print(" tail wagging ");
    }
}
