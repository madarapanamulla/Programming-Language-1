package week40.e01;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // Check if the name is Louis
        if (name.equalsIgnoreCase("Louis")) {
            System.out.println("Are you French?");
        } else {
            System.out.println("You have a great name!");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}