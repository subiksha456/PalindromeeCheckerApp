/**
 * ============================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 9: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack.
 * Characters are pushed into the stack and then
 * popped to compare with the original string.
 *
 * @author Developer
 * @version 9.0
 */

import java.util.Stack;

public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "level";

        // Create stack
        Stack<Character> stack = new Stack<>();

        // Push characters to stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Build reversed string
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        boolean isPalindrome = input.equals(reversed);

        System.out.println("Input : " + input);
        System.out.println("Reversed : " + reversed);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}