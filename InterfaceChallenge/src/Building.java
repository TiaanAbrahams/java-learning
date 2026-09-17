public class Building implements Mappable{
    private final String GEOMERTRY = "POINT";

    private String usage;
    private String iconType;
    private String label;

    public Building(String label, String usage) {
        this.label = label.toLowerCase();
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getShape() {
        return switch (label){
            case "gas station" -> "triangle";
            case "restaurant" -> "pentagon";
            case "nature reserve" -> "sqaure";
            default -> "no shape available";
        };
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
