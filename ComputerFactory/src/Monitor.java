public class Monitor extends Product{
    private int size;
    private String resolution;
    public Monitor(String manufacturer, String model){
        super(manufacturer,model);
    }

    public Monitor(String model, String manufacturer, String resolution, int size) {
        super(model, manufacturer);
        this.resolution = resolution;
        this.size = size;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.print(String.format(
                "Drawing pixel at %d,%d in color %s%n",x,y,color
        ));
    }

    public void start(){
        System.out.println("Monitor is starting ");
    }
}
