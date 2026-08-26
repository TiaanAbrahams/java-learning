public class Dog extends Mammal{
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void makeNoise() {
        if(type.equalsIgnoreCase("Wolf")){
            System.out.print(getExplicitType() + " Howling! ");
        }else{
            System.out.print(getExplicitType() + " Whoof! ");
        }
    }

    @Override
    public void move(String speed) {
        if(speed.equalsIgnoreCase("Slow")){
            System.out.println(type + " walking");
        }else{
            System.out.println(type + "Running");
        }
    }

    @Override
    public void shedHair() {
        System.out.print(getExplicitType() + " Sheds hair all the time");
    }


}
