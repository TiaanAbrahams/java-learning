public class Building implements Mappable{
    private Geomitry point;
    private String type;
    private String name;

    public Building(String name, String type) {
        this.name = name.toLowerCase();
        this.type = type;
        this.point = Geomitry.POINT;
    }

    @Override
    public String getLabel() {
        return name;
    }

    @Override
    public Geomitry getShape() {
        return Geomitry.POINT;
    }

    @Override
    public String getMarker() {
        return switch (type){
            case "gas station" -> "fuel pump";
            case "restaurant" -> "knife and fork";
            case "nature reserve" -> "animal shape";
            default -> "icon not found";
        };
    }
}
