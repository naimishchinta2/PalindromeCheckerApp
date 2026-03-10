public class PalindromeApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Palindrome Checker App");

        // Hardcoded string
        String word = "madam";

        // Reverse the string
        String reversed = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check palindrome
        if(word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        }
        else {
            System.out.println(word + " is Not a Palindrome");
        }

    }
}