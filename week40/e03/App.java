package week40.e03;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        // Display the full name
        System.out.println("You entered: " + name);

        // Display the name in reverse order
        System.out.println("Reversed name:");
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.println(name.charAt(i));
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}