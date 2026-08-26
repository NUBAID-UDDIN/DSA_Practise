import java.util.ArrayList;
import java.util.List;

class Solution {
    private int index = 0;

    public TreeNode recoverFromPreorder(String traversal) {
        List<int[]> nodes = new ArrayList<>();
        int i = 0;
        int n = traversal.length();

        while (i < n) {
            int depth = 0;
            while (i < n && traversal.charAt(i) == '-') {
                depth++;
                i++;
            }

            int val = 0;
            while (i < n && Character.isDigit(traversal.charAt(i))) {
                val = val * 10 + (traversal.charAt(i) - '0');
                i++;
            }

            nodes.add(new int[]{depth, val});
        }

        index = 0;
        return buildTree(nodes, 0);
    }

    private TreeNode buildTree(List<int[]> nodes, int expectedDepth) {
        if (index >= nodes.size() || nodes.get(index)[0] != expectedDepth) {
            return null;
        }

        int[] currentToken = nodes.get(index++);
        TreeNode root = new TreeNode(currentToken[1]);

        root.left = buildTree(nodes, expectedDepth + 1);
        root.right = buildTree(nodes, expectedDepth + 1);

        return root;
    }
}
