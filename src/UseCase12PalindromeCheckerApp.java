import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String word);
}

// Stack Strategy
class StackStrategy implements PalindromeStrategy {

    public boolean check(String word) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Deque Strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String word) {
        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

// Context Class
class PalindromeService {

    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String word) {
        return strategy.check(word);
    }
}

// Main Class
class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "level";

        PalindromeService service = new PalindromeService();

        // Choose strategy at runtime
        // Change this line to switch algorithm
        service.setStrategy(new StackStrategy());
        // service.setStrategy(new DequeStrategy());

        boolean result = service.checkPalindrome(word);

        if (result) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}