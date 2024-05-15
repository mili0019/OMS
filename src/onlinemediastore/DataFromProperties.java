package onlinemediastore;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class DataFromProperties {
    private static final String FILE_NAME = "media.properties";

    // citire din fisier
    public static Properties readProperties() {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream(FILE_NAME)) {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    // scriere in fisier
    public static void writeProperties(String key, String value) {
        try (FileOutputStream fos = new FileOutputStream(FILE_NAME)) {
            Properties properties = new Properties();
            properties.setProperty(key, value);
            properties.store(fos, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
