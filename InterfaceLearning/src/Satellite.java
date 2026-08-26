import java.sql.SQLOutput;

enum FlightStages implements Trackable{GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        switch (this){
            case GROUNDED -> System.out.println("Monotoring " + this);
        }
    }
    public FlightStages getNextStage(){
        FlightStages[] allStages = values();
        return allStages[(ordinal()+1) % allStages.length];
    }
}
record dragonFly(String name, String type) implements FlightEnabled{
    @Override
    public void fly() {

    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }
}
public class Satellite implements OrbitEarth {
    @Override
    public void takeOff(){
        System.out.println(getClass().getSimpleName() + " is taking off");
    }
    @Override
    public void achieveOrbit(){
        System.out.println(getClass().getSimpleName() + " is in orbit");
    }

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }
}
