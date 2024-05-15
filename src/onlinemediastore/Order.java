package onlinemediastore;

public class Order {
	private DigitalVideoDisc[] items;
    private int itemCount;
    
    // constructor
    public Order(int maxSize) {
        this.items = new DigitalVideoDisc[maxSize];
        this.itemCount = 0;
    }

    public void addItem(DigitalVideoDisc dvd) {
        if (itemCount < items.length) {
            items[itemCount] = dvd;
            itemCount++;
        } else {
            System.out.println("Comanda este plină. Nu se mai pot adăuga DVD-uri.");
        }
    }

    public double calculateTotal() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getPrice();
        }
        return total;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < itemCount; i++) {
            builder.append(items[i].getTitle()).append(": $").append(items[i].getPrice()).append("\n");
        }
        return builder.toString();
    }
}
