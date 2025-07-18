package concepts.classes_and_objects;

import java.util.Scanner;

class Song{
    String title;
    String artist;
    int durationInSeconds;

    public Song(String title, String artist, int durationInSeconds) {
        this.title = title;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
    }
    public void play(){
        System.out.println("Now Playing: " + this.title + " by " + this.artist);
    }
}
class Jukebox {
    Song[] songs = new Song[3];

    public Jukebox(Song song1, Song song2, Song song3) {
        songs[0] = song1;
        songs[1] = song2;
        songs[2] = song3;
    }

    public void playAll() {
        System.out.println("------Playing All Songs------");
        for (int i = 0; i < songs.length; i++) {
            if (songs[i] != null) {
                songs[i].play();
            } else {
                System.out.println("Error: Slot " + i + " is empty");
            }
        }
    }
    public void filterByArtist(String artist) {
        System.out.println("------Songs by Artist " + artist + "------");
        boolean found = false;
        for (int i = 0; i < songs.length; i++) {
            if (songs[i] != null && artist.equalsIgnoreCase(songs[i].artist)) {
                songs[i].play();
                found = true;
            }
            if (!found) {
                System.out.println("Songs of " + artist + " not found");
            }
        }
    }
}
public class JukeboxSongPlayer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Song song1 = new Song("Bohemian Rhapsody", "Queen", 354);
        Song song2 = new Song("Hotel California", "Eagles", 390);
        Song song3 = new Song("Harry Potter", "Juice", 390);
        Jukebox jukebox = new Jukebox(song1, song2, song3);
        System.out.println("-----Jukebox Song Player-----");
        jukebox.playAll();
        System.out.println("Search for songs by (artist name): ");
        String search = input.nextLine();
        jukebox.filterByArtist(search);
        input.close();
    }
}
