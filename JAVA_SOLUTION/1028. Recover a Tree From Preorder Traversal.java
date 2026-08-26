import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public TreeNode recoverFromPreorder(String traversal) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        int i = 0;
        int n = traversal.length();

        while (i < n) {
            int depth = 0;
            // 1. Count dashes to determine node depth
            while (i < n && traversal.charAt(i) == '-') {
                depth++;
                i++;
            }

            int val = 0;
            // 2. Parse multi-digit node values
            while (i < n && Character.isDigit(traversal.charAt(i))) {
                val = val * 10 + (traversal.charAt(i) - '0');
                i++;
            }

            TreeNode node = new TreeNode(val);

            // 3. Backtrack up the tree until top of stack is the parent node
            while (stack.size() > depth) {
                stack.pop();
            }

            // 4. Attach new node to parent (left first, then right)
            if (!stack.isEmpty()) {
                if (stack.peek().left == null) {
                    stack.peek().left = node;
                } else {
                    stack.peek().right = node;
                }
            }

            // 5. Push node to stack
            stack.push(node);
        }

        // The root node is the first element pushed (bottom of stack)
        return stack.peekLast();
    }
}
