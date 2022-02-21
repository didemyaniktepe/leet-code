package mergetwosortedlist;

public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }


        ListNode merged = new ListNode();
        ListNode head = merged;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                merged.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                merged.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            merged = merged.next;
        }

        while (list1 != null) {
            merged.next = new ListNode(list1.val);
            list1 = list1.next;
            merged = merged.next;
        }

        while (list2 != null) {
            merged.next = new ListNode(list2.val);
            list2 = list2.next;
            merged = merged.next;
        }
        return head.next;
    }
}
