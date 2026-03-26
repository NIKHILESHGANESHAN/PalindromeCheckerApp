import java.util.*;

class UseCase13PalindromeCheckerApp {

    // Method 1: String Reverse
    static boolean reverseMethod(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return word.equals(reversed);
    }

    // Method 2: Two-pointer
    static boolean twoPointerMethod(String word) {
        int start = 0, end = word.length() - 1;
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    // Method 3: Stack
    static boolean stackMethod(String word) {
        Stack<Character> stack = new Stack<>();
        for (char c : word.toCharArray()) stack.push(c);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String word = "racecar";

        // Reverse Method
        long start1 = System.nanoTime();
        boolean r1 = reverseMethod(word);
        long end1 = System.nanoTime();

        // Two-pointer Method
        long start2 = System.nanoTime();
        boolean r2 = twoPointerMethod(word);
        long end2 = System.nanoTime();

        // Stack Method
        long start3 = System.nanoTime();
        boolean r3 = stackMethod(word);
        long end3 = System.nanoTime();

        // Display results
        System.out.println("Reverse Method: " + r1 + " | Time: " + (end1 - start1) + " ns");
        System.out.println("Two Pointer Method: " + r2 + " | Time: " + (end2 - start2) + " ns");
        System.out.println("Stack Method: " + r3 + " | Time: " + (end3 - start3) + " ns");
    }
}