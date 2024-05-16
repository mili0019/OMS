package onlinemediastore;

import java.util.ArrayList;
import java.util.List;

public class Library<T> {
	private List<T> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        this.items.add(item);
    }

    public void removeItem(T item) {
        this.items.remove(item);
    }

    public List<T> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Library{" +
                "items=" + items +
                '}';
    }
}
