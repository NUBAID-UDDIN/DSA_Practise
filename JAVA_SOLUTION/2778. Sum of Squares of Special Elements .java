class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        
        for (int i = 0; i < n; i++) {
            int position = i + 1;
            if (n % position == 0) {
                totalSum += nums[i] * nums[i];
            }
        }     
        return totalSum;
    }
}
