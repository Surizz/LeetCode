/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getListLength(headA);
        int lenB = getListLength(headB);
        int indexA = lenA < lenB ? 0 : lenA - lenB;
        int indexB = lenA < lenB ? lenB - lenA : 0;

        ListNode headAStart = getNodeAt(headA, indexA);
        ListNode headBStart = getNodeAt(headB, indexB);

        while (headAStart != null && headBStart != null) {
            if (headAStart == headBStart) {
                return headAStart;
            }

            headAStart = headAStart.next;
            headBStart = headBStart.next;
        }

        return null;
    }


    public int getListLength(ListNode node) {
        int length;
        for (length = 0; node != null; node = node.next) {
            length++;
        }

        return length;
    }

    public ListNode getNodeAt(ListNode node, int index) {
        ListNode at = node;
        for (int i = 0; i <= index; ++i, node = node.next) {
            at = node;
        }

        return at;
    }

}