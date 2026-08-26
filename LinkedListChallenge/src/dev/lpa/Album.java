package dev.lpa;
import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name, artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration){
        Song s = new Song(title, duration);

        if(findSong(title) == null){
            songs.add(s);
            return true;
        }
            return false;

    }

    public Song findSong(String title){
        Song name = null;
        for(Song i: songs){
            if(i.getTitle().equalsIgnoreCase(title)){
                name = i;
            }
        }
        return name;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        System.out.println(songs.size());
        if(songs.size() > trackNumber-1){
            playList.add(songs.get(trackNumber-1));
            return true;
        }
            return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        for(Song ss: songs){
            if(ss.getTitle().equalsIgnoreCase(title)){
                playlist.add(ss);
                return true;
            }
        }
        return false;
    }
}
