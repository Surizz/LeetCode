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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode current = ans;

        while (l1 != null || l2 != null) {
            if(current.next == null) {
                current.next = new ListNode();
            }
            current = current.next;


            int val = current.val;

            if(l1 != null) {
                val += l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                val += l2.val;
                l2 = l2.next;
            }

            current.val = val % 10;
            int nextVal = val / 10;

            if(nextVal >= 1) {
                current.next = new ListNode(nextVal);
            }


        }

        return ans.next;
    }

}