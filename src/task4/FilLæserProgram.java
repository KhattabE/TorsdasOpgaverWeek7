package task4;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilLæserProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileIO fileIO = new FileIO();

        boolean fileFound = false;

        while (!fileFound) {
            System.out.print("Enter file name: ");
            String fileName = scanner.nextLine();

            try {
                String content = fileIO.laesFilIndhold(fileName);
                System.out.println("File content:\n " + content);
                fileFound = true;
            } catch (FileNotFoundException e) {
                System.out.println("FILE NOT FOUND TRY AGAIN!: " );
            }
        }

        scanner.close();
    }
}
