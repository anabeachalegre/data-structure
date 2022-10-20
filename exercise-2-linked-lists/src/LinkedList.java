import java.util.Scanner;

public class LinkedList {

    /*
     * --> Method to check if the list is empty
     * --> Creates the parameter quantity (int qty) that refers to the amount of
     * items in the list
     */
    public static boolean emptyList(int qty) {
        /*
         * If the qty of items in the list is equal to zero, then the list is
         * empty.
         */
        if (qty == 0) {
            System.out.println("Empty list");
            return false; // ?
        } else {
            return true;
        }
    }

    /*
     * --> Method that checks if the list is full
     * --> Creates the parameters vet and qty, that referes to the qty of items in
     * the vector
     */
    public static boolean fullList(double vet[], int qty) {
        /*
         * If the qty of items in the list is equal to the vector length , then the list
         * is full
         */
        if (qty == vet.length) {
            System.out.println("The list is full!");
            return false;
        } else {
            return true; // ?
        }
    }

    public static int insert(double vet[], int qty) {
        // Create a new object in the Scanner class (instantiate)
        Scanner dataInput = new Scanner(System.in);

        /*
         * If the qty of items in the list is equal to the vector length , then the list
         * is full and it's not possible to add anymore item.
         */
        if (qty == vet.length) {
            System.out.println("The list is full and can't include new items");
        } else {
            // If the list is not full, then it's possible to add new items to it
            System.out.println("Insert a value: ");

            /*
             * Calls the method nextDouble throught the Scanner object dataInput that will
             * read the inputs and store them in the parameter vet, in the (... qty?)
             */
            vet[qty] = dataInput.nextDouble();

            // Adds +1 to the qty of items in the vector
            qty++;
        }

        // Closes the scanner
        dataInput.close();

        // Store the values at the qty parameter
        return qty;
    }

}