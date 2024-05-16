package onlinemediastore;

public class DigitalVideoDisc extends Media implements Playable {
    private String director;
    private int length;
    
    // constructor
    public DigitalVideoDisc(String title, String category, double cost, String director, int length) {
    	super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    // getters
    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    // setters
    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    @Override
    public String toString() {
        return "DigitalVideoDisc{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                ", director='" + director + '\'' +
                ", length=" + length +
                '}';
    }
    
    @Override
    public void play() {
        System.out.println("Playing DVD: " + getTitle());
        System.out.println("Director: " + director);
        System.out.println("Length: " + length + " minutes");
    }
}
