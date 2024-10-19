package week40.e06;
import java.util.Scanner;

public class Appb  {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter some text
        System.out.print("Palindrome test, please enter some text: ");
        String input = scanner.nextLine();

        // Normalize the input by removing spaces, punctuation, and making it lowercase
        String normalizedInput = normalizeInput(input);

        // Check if the normalized input is a palindrome
        if (isPalindrome(normalizedInput)) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Helper method to normalize input by removing spaces and punctuation, and converting to lowercase
    public static String normalizeInput(String text) {
        // Use regex to remove non-alphabetic characters (punctuation, spaces, etc.)
        // and convert to lowercase
        return text.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }

    // Helper method to check if a string is a palindrome
    public static boolean isPalindrome(String text) {
        int length = text.length();

        // Loop through the string and compare characters from start and end
        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - i - 1)) {
                return false; // Not a palindrome if characters don't match
            }
        }

        return true; // It is a palindrome
    }
}
