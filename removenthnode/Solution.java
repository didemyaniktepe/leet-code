package removenthnode;

public class Solution {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        new Solution().removeNthFromEnd2(head, 2);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode nthNode = head;
        ListNode current = head;

        for (int i = 0; i < n; i++) {
            nthNode = nthNode.next;
        }

        if (nthNode == null) {
            return head.next;
        }

        while (nthNode.next != null) {
            current = current.next;
            nthNode = nthNode.next;
        }

        ListNode deletedNode = current.next;
        current.next = deletedNode.next;

        return head;
    }

    public ListNode removeNthFromEnd2(ListNode head, int n) {

        ListNode fast = head, slow = head;
        int count = 0;

        while (fast != null) {
            fast = fast.next;
            count++;
            if (count > n + 1) {
                slow = slow.next;
            }
        }

        if (n == count) {
            head = head.next;
        } else if (slow.next != null) {
            slow.next = slow.next.next;
        }

        return head;
    }
}
