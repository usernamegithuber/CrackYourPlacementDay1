package CrackYourPlacementDay1;

// Define the ListNode class
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

// Define the MiddleOfTheLinkedList class
public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        // Sample test to demonstrate the usage
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        MiddleOfTheLinkedList solution = new MiddleOfTheLinkedList();
        ListNode middle = solution.middleNode(head);
        System.out.println("The middle node value is: " + middle.val);  // Output should be 3
    }
}
