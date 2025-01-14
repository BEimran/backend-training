package Day12;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNameToFile {
    public static void main(String[] args) {
        String fileName = "name.txt";
        String name = "A Imran";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(name);
            System.out.println("Name successfully written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
