package onlinemediastore;

import java.util.ArrayList;

public class CompactDisc extends Media{
	private String artist;
    private ArrayList<Track> tracks;

    public CompactDisc(String title, String category, double cost, String artist) {
        super(title, category, cost);
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }

    // Getters
    public String getArtist() {
        return artist;
    }

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    // Setters
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void addTrack(Track track) {
        this.tracks.add(track);
    }

    @Override
    public String toString() {
        return "CompactDisc{" +
                "artist='" + artist + '\'' +
                ", tracks=" + tracks +
                "} " + super.toString();
    }
}
