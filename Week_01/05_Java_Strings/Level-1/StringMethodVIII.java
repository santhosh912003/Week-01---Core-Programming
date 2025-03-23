import java.util.*;

public class StringMethodVIII {

    public static void generateException(String[] names, int index) {

        System.out.println("Selected name: " + names[index]);
    }

    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Selected name: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Invalid index - " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        String[] names = {"Alice", "Bob", "Charlie", "David"};

        System.out.print("Enter an index to access (0-" + (names.length - 1) + "): ");
        int userIndex = scanner.nextInt();
        // generateException(names,userIndex);
        handleException(names, userIndex);

        scanner.close();
    }
}
