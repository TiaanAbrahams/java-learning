interface OrbitEarth extends FlightEnabled{
    void achieveOrbit();


}

interface FlightEnabled{
   double KM_TO_MILES = 1.60934;
   double MILES_TO_KM = 0.621371;
 void takeOff();
 void land();
 void fly();

    default FlightStages transition(FlightStages stage){
        System.out.println("Transition is not implemented on " +
                this.getClass().getSimpleName());
        return null;
    }
}

interface Trackable{
void track();
}
public abstract class Animal {
    public abstract void move();
}
