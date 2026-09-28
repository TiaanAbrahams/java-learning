import java.util.Arrays;

public class Line implements Mappable{
    private double[][] locations;

    public Line(String... locations){
        this.locations = new double[locations.length][];
        int index = 0;

        for(var i: locations){
            this.locations[index++] = Mappable.stringToLocation(i);
        }
    }

    private String location(){
        return Arrays.deepToString(locations);
    }
    public void render() {
        System.out.println("Render" + this + " as Point (" + location() + ")");
    }
}
