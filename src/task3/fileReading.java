package task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileReading {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isFileFound = false;

        while (!isFileFound){
            System.out.print("Enter the file name: ");
            String filePath = scanner.nextLine();

            try {
                File file = new File(filePath);
                Scanner scan = new Scanner(file);
                while (scan.hasNextLine()) {
                    System.out.println(scan.nextLine());
                }
                isFileFound = true;

            } catch (FileNotFoundException fnfe) {
                System.out.println("FILE NOT FOUND!");
            }

        }



    }


}
