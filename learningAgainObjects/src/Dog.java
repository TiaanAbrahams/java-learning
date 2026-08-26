public class Dog extends Animal{
    private String earShape;
    private String tailShape;

    public Dog(){
        super("Mutt", "Small", 20 );
    }
    public Dog(String type, double weight){
        this(type, weight,"Perky", "Curled");
    }

    public Dog(String type,  double weight, String earShape, String tailShape) {
        super(type, weight < 15? "Small" : (35 < weight? "Medium" : "Large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
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
        System.out.print("Tail wagging ");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed){
        super.move(speed);
        //System.out.println("Dogs walk, run and wag their tail");
        if(speed == "slow") {
            walk();
            wagTail();
        }else{
            run();
            bark();
        }
        System.out.println();
    }

    @Override
    public void makeNoise(){
        bark();
        System.out.println();
    }
}
