package task5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TalFraFil {
    public static void main(String[] args) {
        int[] talArray = new int[5];

        // Læs tal fra fil "tal.txt" med Scanner
        String filePath = "tal.txt";
        Scanner scanner;
        try {
            File file = new File(filePath);
            scanner = new Scanner(file);

            // Gem tallene i talArray
            int i = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                talArray[i] = Integer.parseInt(line);
                i++;
            }

            // Håndter følgende exceptions med separate catch-blokke:
            // - FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            // - ArrayIndexOutOfBoundsException (hvis filen har for mange tal)

        } catch (ArrayIndexOutOfBoundsException aiobe){
            System.out.println("File has too many numbers!");
        } catch (NumberFormatException nfe){
            // - NumberFormatException (hvis filen indeholder ikke-tal)
            System.out.println("The file does not have numbers!");
        }



    }
}