enum UsageType {
    ENTERTAIMENT,
    GOVERMENT,
    RESIDENTAIL,
    SPORTS
}
public class Building implements Mappable{
    private UsageType usage;
    private String name;

    public Building(String name, UsageType usage) {
        this.name = name.toLowerCase();
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + "(" + usage +")";
    }

    @Override
    public Geomitry getShape() {
        return Geomitry.POINT;
    }

    @Override
    public String getMarker() {
        return switch (usage){
            case ENTERTAIMENT -> Colour.YELLOW + " " + PointMarker.TRAINGLE;
            case GOVERMENT -> Colour.RED + " " + PointMarker.STAR;
            case RESIDENTAIL -> Colour.BLACK + " " + PointMarker.SQAURE;
            case SPORTS -> Colour.ORANGE + " " + PointMarker.PUSH_PIN;
            default -> Colour.BLACK + " " + PointMarker.CIRCLE;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                "name": "%s", "usage": "%s" """.formatted(name, usage);
    }
}
