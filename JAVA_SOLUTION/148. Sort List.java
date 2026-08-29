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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode middle = findMiddle(head);
        ListNode secondHalf = middle.next;
        middle.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(secondHalf);

        return mergeLists(left, right);
    }

    private ListNode findMiddle(ListNode head) {
        ListNode first = head;
        ListNode second = head.next;

        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
        }

        return first;
    }

    private ListNode mergeLists(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (left != null && right != null) {
            if (left.val <= right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        current.next = (left != null) ? left : right;

        return dummy.next;
    }
}
