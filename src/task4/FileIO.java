package task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {

    public String laesFilIndhold(String filnavn) throws FileNotFoundException {
        // Opret Scanner med File
        File file = new File(filnavn);
        Scanner scanner = new Scanner(file);

        // Læs hele filens indhold (alle linjer samlet i en String)
        String indhold = "";
        while (scanner.hasNextLine()) {
            indhold += scanner.nextLine() + "\n";
        }

        // Luk Scanner
        scanner.close();
        // Returner indholdet
        return indhold;


    }
}