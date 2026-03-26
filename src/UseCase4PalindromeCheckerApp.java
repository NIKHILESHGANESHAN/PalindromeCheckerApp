class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "radar";

        // Convert to character array
        char[] arr = word.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = arr.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}