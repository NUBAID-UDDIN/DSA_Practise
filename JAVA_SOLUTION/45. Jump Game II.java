class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int str_pt = 0;
        int end_pt = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            end_pt = Math.max(end_pt, i + nums[i]);
            
            if (i == str_pt) {
                jumps++;
                str_pt = end_pt;
                
                if (str_pt >= nums.length - 1) {
                    break;
                }
            }
        }
        
        return jumps;
    }
}
