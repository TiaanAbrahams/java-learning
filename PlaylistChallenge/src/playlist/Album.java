package playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String album;
    private String artist;
    ArrayList<Song> albumSongs = new ArrayList<>();
    public Album(String album, String artist) {
        this.album = album;
        this.artist = artist;
    }
    public boolean addSong(String title, double duration){
        boolean testCase = true;
        for(Song s: albumSongs){
            if(s.getTitle().equalsIgnoreCase(title)){
                testCase = false;
            }
        }
        if(testCase){
            albumSongs.add(new Song(title, duration));
        }
        return testCase;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        if(trackNumber <= albumSongs.size() && !playList.contains(albumSongs.get(trackNumber-1))){
            playList.add(albumSongs.get(trackNumber-1));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        //Check if song is in the playlist
        for(Song song: playList){
            if(song.getTitle().equalsIgnoreCase(title)){
                return  false;
            }
        }
        //Check if song is on the album if condition is true add to the playlist
        for(Song song: albumSongs){
            if(song.getTitle().equalsIgnoreCase(title)){
                playList.add(song);
                return true;
            }
        }
        return false;
    }

}