package playlist;

public class Song {
    private String title;
    private double duration;

    public Song(String name, double songLength) {
        this.title = name;
        this.duration = songLength;
    }

    public String getTitle(){
        return title;
    }
}
