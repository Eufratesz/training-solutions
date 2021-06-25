package aaa.week05;

/*
Készítsünk egy Playlist osztályt, melynek van egy konstruktora,
amiben Song-ok listáját fogadja el! Írjunk egy metódust findByLengthGreaterThan néven, mely egy int-et vár paraméterként
 mins néven. Azoknak a Song-oknak a listáját adjuk vissza, melyek hosszabbak percben (!), mint a Song lengthInSeconds
 mezője.
 */

import java.util.ArrayList;
import java.util.List;

public class PlayList {

    List<Song>songs;

    public PlayList(List<Song> songs) {
        this.songs = songs;
    }

    public List<Song> findByLengthGreaterThan(int mins){
        List<Song> longerSongs = new ArrayList<>();

        for(Song song : songs){
            if(song.getLengthInSeconds() /60 < mins){
                songs.add(song);
            }
        }

        return longerSongs;
    }


    @Override
    public String toString() {
        return "PlayList{" +
                "songs=" + songs +
                '}';
    }
}
