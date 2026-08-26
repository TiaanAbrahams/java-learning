
enum FlightStages implements Trackable{
    GROUNDED,
    LAUNCH,
    CRUISE,
    DATA_COLLECTION;

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
    FlightStages stage = FlightStages.GROUNDED;
    @Override
    public void takeOff(){
        transition("Taking off...");
    }
    @Override
    public void achieveOrbit(){
        transition("Orbit achieved");
    }

    @Override
    public void fly() {
        achieveOrbit();
        transition("Data collection while orbiting");
    }

    @Override
    public void land() {
        transition("Landing...");
    }
    public void transition(String description){
        System.out.println(description);
        transition(stage);
        stage.track();
    }
}
