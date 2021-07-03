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
    public boolean isPalindrome(ListNode head) {
        ListNode reverse = null;
        ListNode forward = head;
        ListNode twice = head;

        while (twice != null && twice.next != null) {
            twice = twice.next.next;

            ListNode next = forward.next;
            forward.next = reverse;
            reverse = forward;
            forward = next;
        }

        if (twice != null) { // list length is odd
            forward = forward.next;
        }

        for (; forward != null; forward = forward.next, reverse = reverse.next) {
            if (forward.val != reverse.val) {
                return false;
            }
        }

        return true;
    }
}