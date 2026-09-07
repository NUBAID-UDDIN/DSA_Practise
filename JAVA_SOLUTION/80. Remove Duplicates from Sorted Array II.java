class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        
        int n = 2;
        
        for (int m = 2; m < nums.length; m++) {
            if (nums[m] != nums[n - 2]) {
                nums[n] = nums[m];
                n++;
            }
        }
        
        return n;
    }
}
