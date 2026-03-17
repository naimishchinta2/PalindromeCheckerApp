import java.util.Stack;
import java.util.Scanner;

// Service class that checks palindrome
class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        String processed = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        // Push characters to stack
        for (int i = 0; i < processed.length(); i++) {
            stack.push(processed.charAt(i));
        }

        String reversed = "";

        // Pop characters to create reversed string
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return processed.equals(reversed);
    }
}

// Main application class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        if (checker.checkPalindrome(input)) {
            System.out.println("The given string is a Palindrome");
        } else {
            System.out.println("The given string is not a Palindrome");
        }

        scanner.close();
    }
}