public class Main {
    public static void main(String[] args) {
        var nationalUSParks = new Park[]{
                new Park("Yellowstone", "44.4882, -110.5916"),
                new Park("Grand Canyon", "36.1085, -112.0965"),
                new Park("Yosemite", "37.8855, -119.5360")
        };

        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();

        var majorUSRivers = new River[]{
                new River("Mississippi", "47.2160, -95.2348", "-89.2495, 35.1556"),
                new River("Missouri", "37.2160, -85.2348", "-49.2495, 35.1556"),
        };

        Layer<River> riverLayer = new Layer<>(majorUSRivers);
        riverLayer.renderLayer();
    }
}