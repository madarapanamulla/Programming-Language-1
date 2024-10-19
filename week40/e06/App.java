package week40.e06;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter some text
        System.out.print("Palindrome test, please enter some text: ");
        String input = scanner.nextLine();

        // Remove case sensitivity by converting the string to lowercase
        String normalizedInput = input.toLowerCase();

        // Check if the input is a palindrome
        if (isPalindrome(normalizedInput)) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
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