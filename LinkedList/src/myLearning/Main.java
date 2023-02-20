package myLearning;

public class Main {
    public static ListNode findKthToLast(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;


        for (int i = 0; i < k; i++) {
            fast = fast.next;

            if (fast == null) {
                return null;
            }
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println(findKthToLast(head, 1).val);
    }
}
