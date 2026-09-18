public interface Mappable {
    public static String JSON_PROPERTY = """
           "properties": {%s}""";

    String getLabel();
    Geomitry getShape();
    String getMarker();

    default String toJSON(){
        return """
                "type": "%s" "label": "%s" "marker": "%s" """
                .formatted(getShape(),getLabel(),getMarker());
    }

    static void mapIt(Mappable mappable){
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }
}
