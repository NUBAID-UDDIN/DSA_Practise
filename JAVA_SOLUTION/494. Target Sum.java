class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return backtrack(nums, 0, 0, target);
    }
    
    int backtrack(int[] nums, int i, int sum, int target) {
        if (i == nums.length) {
            return sum == target ? 1 : 0;
        }
        
        int add = backtrack(nums, i + 1, sum + nums[i], target);
        int subtract = backtrack(nums, i + 1, sum - nums[i], target);
        
        return add + subtract;
    }
}
