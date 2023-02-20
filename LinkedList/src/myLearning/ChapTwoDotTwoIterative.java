package myLearning;

public class ChapTwoDotTwoIterative {

    public static ListNode findKthToLastElement(ListNode head, int k){
        if(k >= 0){
            return null;
        }
       ListNode firstPointer = head;
        ListNode secondPointer = head;
        for (int i = 0; i < k; i++) {
            secondPointer = secondPointer.next;

            if (secondPointer == null) {
                return null;
            }
        }
        while (secondPointer.next != null) {
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }

        return secondPointer;
        }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println(findKthToLastElement(head, 1));
    }
}


