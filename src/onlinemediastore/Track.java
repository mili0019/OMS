package onlinemediastore;

public class Track {
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
}
