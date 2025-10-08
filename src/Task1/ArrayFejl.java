package Task1;

public class ArrayFejl {

    public static void printTreForsteElementer(String[] array) {
        System.out.println("Første element: " + array[0]);
        System.out.println("Andet element: " + array[1]);
        System.out.println("Tredje element: " + array[2]);
    }

    public static void main(String[] args) {
        String[] navne1 = {"Anna", "Bob", "Clara", "David"};
        String[] navne2 = {"Eva", "Frank"};

        printTreForsteElementer(navne1);


        try {
            printTreForsteElementer(navne2);
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("Must at least have 3 elements!");
        }
    }
}

/*So the cause of the error, is that printTreForsteElementer() expects
at least 3 elements, but as we can see, "navne2" only has 2 elements, and that is why
 an ArrayIndexOutOfBoundsException happens here
 */

