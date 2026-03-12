/**
 * ============================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * The application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates execution duration
 * - Displays benchmarking results
 *
 * @author Developer
 * @version 13.0
 */

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Choose algorithm strategy
        PalindromeStrategy strategy = new StackStrategy();

        long startTime = System.nanoTime();

        boolean result = strategy.check(input);

        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time (nanoseconds) : " + duration);
    }
}

/**
 * Strategy Interface
 */
interface PalindromeStrategy {

    boolean check(String input);
}

/**
 * Stack-based strategy implementation
 */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = "";

        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed += normalized.charAt(i);
        }

        return normalized.equals(reversed);
    }
}