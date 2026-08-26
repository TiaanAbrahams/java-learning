public class Fish extends Animal{
    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void makeNoise() {
        if(type.equalsIgnoreCase(getExplicitType()  + " Goldfish")){
            System.out.print("swish ");
        }else{
            System.out.print(getExplicitType() + " Splash! ");
        }
    }

    @Override
    public void move(String speed) {
        if(speed.equalsIgnoreCase("Slow")){
            System.out.println(type + " lazily swimming");
        }else{
            System.out.println(type + "Darting frantically ");
        }
    }
}
