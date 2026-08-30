import java.util.Arrays;

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[mid]);

        int[] leftSubarray = Arrays.copyOfRange(nums, 0, mid);
        int[] rightSubarray = Arrays.copyOfRange(nums, mid + 1, nums.length);

        root.left = sortedArrayToBST(leftSubarray);
        root.right = sortedArrayToBST(rightSubarray);

        return root;
    }
}
