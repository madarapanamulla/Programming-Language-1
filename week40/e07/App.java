package week40.e07;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Keep asking for a password until it is valid
        while (true) {
            // Prompt the user to enter a password
            System.out.print("Please enter a password: ");
            String password = scanner.nextLine();

            // Validate the password
            String validationMessage = validatePassword(password);

            // If the password is valid, break the loop
            if (validationMessage.equals("Password is valid.")) {
                System.out.println(validationMessage);
                break;
            } else {
                // Display the validation error and prompt the user to enter again
                System.out.println("Password is invalid. " + validationMessage);
            }
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Method to validate the password and return a message
    public static String validatePassword(String password) {
        // Check if the password is at least 8 characters long
        if (password.length() < 8) {
            return "Needs to be at least 8 characters long.";
        }

        // Check if the password contains at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            return "Needs to include at least one uppercase letter.";
        }

        // Check if the password contains at least one lowercase letter
        if (!password.matches(".*[a-z].*")) {
            return "Needs to include at least one lowercase letter.";
        }

        // Check if the password contains at least one digit
        if (!password.matches(".*[0-9].*")) {
            return "Needs to include at least one digit.";
        }

        // If all checks pass, the password is valid
        return "Password is valid.";
    }
}
