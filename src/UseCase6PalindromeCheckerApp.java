import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "level";

        // Create Stack and Queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert characters
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO
        }

        // Compare Stack pop and Queue dequeue
        boolean isPalindrome = true;

        for (int i = 0; i < word.length(); i++) {
            if (stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}