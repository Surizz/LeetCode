/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }


        ListNode result = new ListNode(Math.min(l1.val, l2.val), new ListNode());
        if(l1.val < l2.val) {
            l1 = l1.next;
        } else {
            l2 = l2.next;
        }
        ListNode next = result;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                next.next = new ListNode(l1.val, new ListNode());
                l1 = l1.next;
            } else {
                next.next = new ListNode(l2.val, new ListNode());
                l2 = l2.next;
            }
            next = next.next;
        }

        while (l1 != null) {
            next.next = new ListNode(l1.val, new ListNode());
            next = next.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            next.next = new ListNode(l2.val, new ListNode());
            next = next.next;
            l2 = l2.next;
        }

        next.next = null;
        return result;
    }
}