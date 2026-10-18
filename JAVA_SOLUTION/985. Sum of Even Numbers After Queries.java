class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] ans = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0];
            int idx = queries[i][1];
            
            nums[idx] += val;
            
            int crrSum = 0;
            for (int num : nums) {
                if (num % 2 == 0) {
                    crrSum += num;
                }
            }
            ans[i] = crrSum;
        }
        
        return ans;
    }
}
