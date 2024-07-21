package CrackYourPlacementDay1;

class Node {
    int val;
    Node next;
    Node(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {
    public boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Sample test to demonstrate the usage
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head; // Creates a cycle for testing

        LinkedListCycle solution = new LinkedListCycle();
        boolean hasCycle = solution.hasCycle(head);
        System.out.println("The linked list has a cycle: " + hasCycle);  // Output should be true
    }
}
