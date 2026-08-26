package dev.challenge;

public class Locations {
    private String place;
    private int distance;

    public Locations(String place, int distance){
        this.place = place;
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public String getPlace() {
        return place;
    }
}
