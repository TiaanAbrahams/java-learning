package playlist;

import java.util.ArrayList;

public class Album {
    private Song song;
    private ArrayList<Song> album = new ArrayList<>();

    public Album(String title, double duration) {
        song = new Song(title, duration);
    }

    public boolean addSong(String title, double duration){
        for(Song song: album){
            if(song.getTitle().equalsIgnoreCase(title)){
                return false;
            }
        }
        album.add(new Song(title,duration));
        return true;
    }

    private class SongList{
        private ArrayList<Song> playlist = new ArrayList<>();
        public boolean addSong(Song song){
            if(!playlist.contains(song)){
                playlist.add(song);
                return true;
            }
            return false;
        }

        public Song findSong(String title){
            for(Song song: playlist){
                if(song.getTitle().equalsIgnoreCase(title));
                return song;
            }
            return null;
        }
        public Song findSong(int trackNumber){
            if(playlist.size() >= trackNumber){
                return playlist.get(trackNumber);
            }
            return null;
        }
    }
}
/*
There are only three methods in the album class.

1) addSong(String title, double duration)

2) addToPlayList(int trackNumber, LinkedList<Song> playList)

3) addToPlayList(String title, LinkedList<Song> playList)
*/