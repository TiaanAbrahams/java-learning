import java.util.Date;

interface OrbitEarth extends FlightEnabled{
    void achieveOrbit();

    static void log(String description){
        Date today = new java.util.Date();
        System.out.println(today + ": " + description);
    }

    private void logStage(FlightStages stage, String description){
        description = stage + ": " + description;
        log(description);
    }

    @Override
    default FlightStages transition(FlightStages stage) {

        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage, "Beginning to transition to " + nextStage);
        return nextStage;
    }
}

interface FlightEnabled{
   double KM_TO_MILES = 1.60934;
   double MILES_TO_KM = 0.621371;
 void takeOff();
 void land();
 void fly();

    default FlightStages transition(FlightStages stage){
        FlightStages nextStage = stage.getNextStage();
        System.out.println("Transitioning from " + stage + " to " + nextStage);
        return nextStage;
    }
}

interface Trackable{
void track();
}
public abstract class Animal {
    public abstract void move();
}
