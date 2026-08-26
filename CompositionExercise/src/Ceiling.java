public class Ceiling {
    private int height;
    private int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    private int getHeight(){
        return height;
    }

    private int getPaintedColor(){
        return paintedColor;
    }
}
