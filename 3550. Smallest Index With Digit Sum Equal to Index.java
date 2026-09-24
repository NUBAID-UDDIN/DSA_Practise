class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            String numStr = String.valueOf(nums[i]);
            int digitSum = 0;
            
            for (char ch : numStr.toCharArray()) {
                digitSum += ch - '0';
            }
            
            if (digitSum == i) {
                return i;
            }
        }
        
        return -1;
    }
}
