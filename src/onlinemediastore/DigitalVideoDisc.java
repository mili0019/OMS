package onlinemediastore;

public class DigitalVideoDisc {
	private String title;
    private String category;
    private double price;
    private String director;
    private int length;
    
    // constructor
    public DigitalVideoDisc(String title, String category, double price, String director, int length) {
        this.title = title;
        this.category = category;
        this.price = price;
        this.director = director;
        this.length = length;
    }

    // getters
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    // setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
}
