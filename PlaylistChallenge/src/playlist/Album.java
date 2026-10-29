package playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String album;
    private String artist;
    private SongList songList;

    public Album(String album, String artist) {
        this.album = album;
        this.artist = artist;
        this.songList = new SongList();

    }

    public boolean addSong(String title, double duration){

        if(songList.findSong(title) != null){
            return false;
        }
        songList.add(new Song(title, duration));
        return true;
    }
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        if(songList.findSong(trackNumber) != null){
            playList.add(songList.findSong(trackNumber));
            return true;
        }
        System.out.printf("This album does not have a track %d\n", trackNumber);
        return false;
        }


    public boolean addToPlayList(String title, LinkedList<Song> playList){
        //Check if song is in the playlist
        for(Song song: playList){
            if(song.getTitle().equalsIgnoreCase(title)){
                return false;
            }
        }
        //Check if song is on the album if condition is true add to the playlist
        if(songList.findSong(title) != null){
            playList.add(songList.findSong(title));
            return true;
        }
        System.out.printf("The song %s is not in this album\n", title);
        return false;
    }
    public static class SongList {
        private ArrayList<Song> songs = new ArrayList<>();

        private boolean add(Song song){
            if(findSong(song.getTitle()) == null){
                songs.add(song);
                return true;
            }
            return false;
        }

        private Song findSong(String title){
            if(songs.isEmpty()){
                return null;
            }
            for(Song song: songs){
                if(song.getTitle().equalsIgnoreCase(title)){
                    return song;
                }
            }
            return null;
        }
        private Song findSong(int trackNumber){
            if(songs.size() >= trackNumber){
                return songs.get(trackNumber -1);
            }
            return null;
        }
    }
}