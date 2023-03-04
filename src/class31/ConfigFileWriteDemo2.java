package class31;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo2 {
    public static void main(String[] args) throws IOException {
        /*
        Path where we want to create a file and the name of the file with its extension
         */
        String path = "Files/test1.properties";
        // we use FileOutputStream when we have to write the data to a file
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        Properties properties = new Properties();
        // we use the setProperty method to store data inside a properties files
        properties.put("Name", "Safi");
        // a method to write the data to the disk
        properties.store(fileOutputStream, "A new name has been added");

    }
}
