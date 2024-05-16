package onlinemediastore;

import java.util.Properties;
import java.util.ArrayList;
import java.util.Arrays;

public class OnlineMedia {
	
    public static void main(String[] args) {
        
        Properties properties = DataFromProperties.readProperties();

        Order order = new Order(10); 

        DigitalVideoDisc dvd1 = new DigitalVideoDisc(
                properties.getProperty("dvd1.title"),
                properties.getProperty("dvd1.category"),
                Double.parseDouble(properties.getProperty("dvd1.price")),
                properties.getProperty("dvd1.director"),
                Integer.parseInt(properties.getProperty("dvd1.length"))
        );
        order.addItem(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc(
                properties.getProperty("dvd2.title"),
                properties.getProperty("dvd2.category"),
                Double.parseDouble(properties.getProperty("dvd2.price")),
                properties.getProperty("dvd2.director"),
                Integer.parseInt(properties.getProperty("dvd2.length"))
        );
        order.addItem(dvd2);

        ArrayList<String> authors = new ArrayList<>(Arrays.asList(properties.getProperty("book1.authors").split(",")));
        Book book1 = new Book(
                properties.getProperty("book1.title"),
                properties.getProperty("book1.category"),
                Double.parseDouble(properties.getProperty("book1.price")),
                authors
        );
        order.addItem(book1);
        
        System.out.println("Comanda finală:");
        System.out.println(order); 
        System.out.println("Total: $" + order.calculateTotal());
    }
    
}
