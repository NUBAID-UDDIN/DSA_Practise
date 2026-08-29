class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;

   
        for (int num : nums) {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else count2++;
        }

 
        int idx = 0;
        while (count0-- > 0) nums[idx++] = 0;
        while (count1-- > 0) nums[idx++] = 1;
        while (count2-- > 0) nums[idx++] = 2;
    }
}
