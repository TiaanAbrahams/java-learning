public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.engine = true;
        this.wheels = 4;
        this.name = name;
        this.cylinders = cylinders;
    }

    public String startEngine(){
        String className = getClass().getSimpleName();
        return className +" -> startEngine()";
    }

    public String accelerate(){
        String className = getClass().getSimpleName();
        return className + " -> accelerate()";
    }
    public String brake(){
        String className = getClass().getSimpleName();
        return className + " -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}