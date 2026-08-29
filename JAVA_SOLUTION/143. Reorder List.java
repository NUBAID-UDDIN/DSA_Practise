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
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        List<ListNode> nodes = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            nodes.add(curr);
            curr = curr.next;
        }

        int left = 0;
        int right = nodes.size() - 1;

        while (left < right) {
            nodes.get(left).next = nodes.get(right);
            left++;
            
            if (left == right) {
                break;
            }
            
            nodes.get(right).next = nodes.get(left);
            right--;
        }

        nodes.get(left).next = null;
        }
}
