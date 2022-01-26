package addtwonumbers;

public class Solution {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode temp = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            ListNode listNode = new ListNode(sum % 10);
            carry = sum / 10;

            if (temp == null) {
                temp = listNode;
                head = temp;
            } else {
                temp.next = listNode;
                temp = temp.next;
            }

        }
        if (carry > 0) {
            temp.next = new ListNode(carry);
        }
        return head;
    }

}
