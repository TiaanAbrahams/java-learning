package playlist;

public class Song {
    private String title;
    private double duration;
    public Song(String name, double duration) {
        this.title = name;
        this.duration = duration;
    }

    public String getTitle(){
        return title;
    }
}
