/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    final int IS_VISITED = -9999999;
    
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        if (head.val == IS_VISITED) {
            return true;
        }
        head.val = IS_VISITED;
        return hasCycle(head.next);
    }
}