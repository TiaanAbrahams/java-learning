public class Building implements Mappable{
    private Geomitry point = Geomitry.POINT;

    private String usage;
    private String iconType;
    private String name;

    public Building(String name, String usage) {
        this.name = name.toLowerCase();
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name;
    }

    @Override
    public String getShape() {
        return Geomitry.SHAPE.getShape();
    }

    @Override
    public String getMarker() {
        return switch (usage){
            case "gas station" -> "fuel pump";
            case "restaurant" -> "knife and fork";
            case "nature reserve" -> "animal shape";
            default -> "icon not found";
        };
    }
}
