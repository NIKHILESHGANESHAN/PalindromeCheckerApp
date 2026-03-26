class UseCase8PalindromeCheckerApp {

    // Node class
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        String word = "madam";

        // Convert string to linked list
        Node head = null, tail = null;

        for (int i = 0; i < word.length(); i++) {
            Node newNode = new Node(word.charAt(i));
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Find middle using fast & slow pointer
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node prev = null;
        Node current = slow;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Compare first half and reversed second half
        Node first = head;
        Node second = prev;

        boolean isPalindrome = true;

        while (second != null) {
            if (first.data != second.data) {
                isPalindrome = false;
                break;
            }
            first = first.next;
            second = second.next;
        }

        // Output result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}