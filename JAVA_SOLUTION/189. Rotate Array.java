class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        
        int[] temp = new int[n];
        
        // Place each element in its rotated position in temp
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }
        
        // Copy elements array
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}
