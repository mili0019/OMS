package onlinemediastore;

import java.util.Properties;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OnlineMedia {
	
    public static void main(String[] args) {
        
        Properties properties = DataFromProperties.readProperties();

        Order order = new Order(10); 

        DigitalVideoDisc dvd1 = DataFromProperties.createDigitalVideoDisc(properties, "dvd1");
        dvd1.play();
        order.addItem(dvd1);

        DigitalVideoDisc dvd2 = DataFromProperties.createDigitalVideoDisc(properties, "dvd2");
        dvd2.play();
        order.addItem(dvd2);

        Book book1 = DataFromProperties.createBook(properties, "book1");
        order.addItem(book1);
        
        CompactDisc cd1 = DataFromProperties.createCompactDisc(properties, "cd1");
        cd1.play();
        order.addItem(cd1);
        
        ArrayList<Track> tracks = cd1.getTracks();
        Collections.sort(tracks);
        
        System.out.println();
        System.out.println("Order:");
        System.out.println(order); 
        System.out.println("TOTAL: $" + order.calculateTotal());
    }
    
}
