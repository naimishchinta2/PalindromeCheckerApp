import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    // Algorithm 1: Using String Reverse
    public static boolean reverseMethod(String input) {
        String processed = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(processed).reverse().toString();
        return processed.equals(reversed);
    }

    // Algorithm 2: Using Stack
    public static boolean stackMethod(String input) {
        String processed = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : processed.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return processed.equals(reversed);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Measure Reverse Method
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // Measure Stack Method
        long start2 = System.nanoTime();
        boolean result2 = stackMethod(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // Display Results
        System.out.println("\nPalindrome Result: " + result1);

        System.out.println("\nPerformance Comparison:");
        System.out.println("Reverse Method Time: " + time1 + " ns");
        System.out.println("Stack Method Time: " + time2 + " ns");

        scanner.close();
    }
}