class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "level";

        // Reverse string using loop
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Compare original and reversed
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}