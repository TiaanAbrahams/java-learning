public class Cylinder extends Circle{
    private double height;

    public Cylinder(double raduis, double height){
        super(raduis);
        this.height = height >= 0? height: 0;
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return height * super.getArea();
    }
}
