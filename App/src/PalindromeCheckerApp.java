import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method to check palindrome after normalization
    public static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Normalize string:
        // 1. Convert to lowercase
        // 2. Remove spaces and non-alphanumeric characters
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Check palindrome
        if (isPalindrome(normalized)) {
            System.out.println("The given string is a Palindrome (ignoring case and spaces).");
        } else {
            System.out.println("The given string is not a Palindrome.");
        }

        sc.close();
    }
}