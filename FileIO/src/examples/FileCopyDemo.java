package examples;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyDemo {

    public static void main(String[] args) {

        String source = "src/hello.txt";
        String destination = "src/copy.txt";

        try {
            FileReader reader = new FileReader(source);
            FileWriter writer = new FileWriter(destination);

            int ch;

            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }

            reader.close();
            writer.close();

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 