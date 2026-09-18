public enum Geomitry {
    POINT("point"),
    LINE("line"),
    SHAPE("shape");

    private final String shape;

    private Geomitry(String shape){
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }
}
