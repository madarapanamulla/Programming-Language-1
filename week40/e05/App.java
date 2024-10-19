package week40.e05;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Variable to store the concatenated names
        String concatenatedNames = "";

        // Loop to repeatedly ask for names
        while (true) {
            System.out.print("Enter a name: ");
            String name = scanner.nextLine();

            // Break the loop if the user enters "Quit"
            if (name.equalsIgnoreCase("Quit")) {
                break;
            }
            // Concatenate the entered name to the result
            concatenatedNames += name;

            // Display the concatenated names so far
            System.out.println(concatenatedNames);
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}