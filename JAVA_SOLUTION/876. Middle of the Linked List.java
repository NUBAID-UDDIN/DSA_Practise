class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode n = head;
        ListNode m = head;

        // Traverse n moves 1 step, m moves 2 steps
        while (m != null && m.next != null) {
            n = n.next;
            m = m.next.next;
        }

        return n;
    }
}
