import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SystemLogger {

    public static void main(String[] args) {

        try {

            File file = new File("daily_log.txt");

            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File Created");
            }

            FileWriter writer = new FileWriter(file, true);

            writer.write("System Started\n");

            writer.close();

            System.out.println("Log Written Successfully");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}