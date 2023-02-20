package myLearning;

public class RemoveMiddleNode {
    public boolean removeNode(ListNode middle) {
        ListNode current = middle;
        ListNode previous = null;
        if (middle == null || middle.next == null) {
            return false;
        }
        while (current.next != null) {
            current.data = current.next.data;
            current.next = current.next.next;
            return true;
        }
    }
}
