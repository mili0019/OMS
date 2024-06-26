package onlinemediastore;

import java.io.Serializable;

public class Track implements Playable, Comparable<Track>, Serializable {
	private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Track{" +
                "title='" + title + '\'' +
                ", length=" + length +
                '}';
    }
    
    @Override
    public void play() throws PlayerException {
        if (length == 0) {
            throw new PlayerException("Cannot play the track: " + title + ". Length is 0.");
        } else {
            System.out.println("Playing Track: " + title);
            System.out.println("Length: " + length + " seconds");
        }
    }
    
    @Override
    public int compareTo(Track other) {
        return Integer.compare(this.length, other.length);
    }
}
