/**
 * ============================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 5: StringBuilder Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using StringBuilder's reverse() method.
 *
 * @author Developer
 * @version 5.0
 */

public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "level";

        // Reverse using StringBuilder
        String reversed = new StringBuilder(input).reverse().toString();

        // Check palindrome
        boolean isPalindrome = input.equalsIgnoreCase(reversed);

        // Output result
        System.out.println("Input : " + input);
        System.out.println("Reversed : " + reversed);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}