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
        ListNode origin = new ListNode(head.val);
        ListNode p = origin;

        while(head != null) {
            ListNode next = head.next;
            if(next != null) {
                p.next = new ListNode(next.val);
                p = p.next;
            }

            head.next = reverse;
            reverse = head;

            head = next;
        }

        for(; reverse != null; reverse = reverse.next, origin = origin.next) {
            if(reverse.val != origin.val) {
                return false;
            }
        }

        return true;
    }
}