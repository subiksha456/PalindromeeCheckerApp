/**
 * ============================================================
 * CLASS - UseCase2PalindromeChecker
 * ============================================================
 *
 * Use Case 2: Palindrome Checking Logic
 *
 * Description:
 * This class contains the logic required to check whether
 * a given string is a palindrome.
 *
 * A palindrome is a word or phrase that reads the same
 * forwards and backwards.
 *
 * Example:
 * level → palindrome
 * hello → not palindrome
 *
 * @author Developer
 * @version 1.0
 */

public class UseCase2PalindromeChecker {

    /**
     * Method to check if a string is palindrome
     * @param text input string
     * @return true if palindrome, otherwise false
     */
    public static boolean isPalindrome(String text) {

        String reversed = "";

        for(int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        return text.equalsIgnoreCase(reversed);
    }

    /**
     * Main method to test palindrome logic
     */
    public static void main(String[] args) {

        String word = "level";

        if(isPalindrome(word)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}