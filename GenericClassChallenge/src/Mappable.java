public interface Mappable {

    void render();
    static double[] stringToLocation(String location){
        int cnt = 0;
        String[] parts = location.split(" ");
        double[] locationArray = new double[parts.length];
        for(String i: parts){
            locationArray[cnt] = Double.parseDouble(parts[cnt]);
            cnt++;
        }

        return locationArray;
    }
}
