// Service class (Encapsulation)
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String word) {

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

// Main class
class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        // Create object of service class
        PalindromeChecker checker = new PalindromeChecker();

        // Call method
        boolean result = checker.checkPalindrome(word);

        // Display result
        if (result) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}