package onlinemediastore;

import java.util.Properties;
import java.util.ArrayList;
import java.util.Arrays;

public class OnlineMedia {
	
    public static void main(String[] args) {
        
        Properties properties = DataFromProperties.readProperties();

        Order order = new Order(10); 

        DigitalVideoDisc dvd1 = DataFromProperties.createDigitalVideoDisc(properties, "dvd1");
        order.addItem(dvd1);

        DigitalVideoDisc dvd2 = DataFromProperties.createDigitalVideoDisc(properties, "dvd2");
        order.addItem(dvd2);

        Book book1 = DataFromProperties.createBook(properties, "book1");
        order.addItem(book1);
        
        CompactDisc cd1 = DataFromProperties.createCompactDisc(properties, "cd1");
        order.addItem(cd1);
        
        System.out.println("Comanda finală:");
        System.out.println(order); 
        System.out.println("Total: $" + order.calculateTotal());
    }
    
}
