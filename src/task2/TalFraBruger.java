package task2;

import java.util.Scanner;

public class TalFraBruger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast dit fødselsår: ");
        String input = scanner.nextLine();

        // Brug Integer.parseInt til at konvertere input til int

        try {
            int userAge = Integer.parseInt(input);

            while (userAge < 1970 || userAge > 2025){
                System.out.println("You can only be born between 1970-2025!");
                System.out.print("Enter age year again: ");
                //Input again so it can take a new input, instead of recycling the old one, which will cause an infinite while loop
                input = scanner.nextLine();
                userAge = Integer.parseInt(input);
            }
        } catch (NumberFormatException e) {
            System.out.println("YOU MUST ENTER VALID NUMBER!");
        }

        // Beregn brugerens alder (antag at nuværende år er 2025)
        //Variable of data type int, to initialize the current year
        int currentYear = 2025;
        //Variable of data type int, to take the users age input, and initialize it into age variable
        int age = Integer.parseInt(input);
        //Variable of data type int, to minus the current year, with the user age
        int currentAgeOfUser = currentYear - age;


        // Print alderen

        //Prints and tells the user how old he or she is
        System.out.println("The Current Age Of The User is: " + currentAgeOfUser);
    }
}