class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string with spaces and mixed case
        String input = "A man a plan a canal Panama";

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Check palindrome using two-pointer
        int start = 0;
        int end = normalized.length() - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a Palindrome");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome");
        }
    }
}