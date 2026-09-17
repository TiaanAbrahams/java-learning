public interface Mappable {
    public static String JSON_PROPERTY = "{%S}";

    String getLabel();
    String getShape();
    String getMarker();

    default String toJSON(){
        return JSON_PROPERTY;
    }
}
