public class Fish extends Animal{
    private int fins;
    private int gills;

    public Fish(String type, double weight, int fins, int gills) {
        super(type, weight, "Small");
        this.fins = fins;
        this.gills = gills;
    }
    
    private void moveMuscles(){
        System.out.print(" muscles are moving ");
    }

    private void moveBackFin(){
        System.out.print(" back fin moving ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed.equalsIgnoreCase("Fast")){
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
