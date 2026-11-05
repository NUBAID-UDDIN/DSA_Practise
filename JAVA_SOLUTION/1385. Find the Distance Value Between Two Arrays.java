class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int count = 0;
        int j = 0;
        
        for (int x : arr1) {
            // increase j while arr2[j] is less than the lower bound (x - d)
            while (j < arr2.length && arr2[j] < x - d) {
                j++;
            }

            // If we didn't find any element <= x + d, then x is valid
            if (j == arr2.length || arr2[j] > x + d) {
                count++;
            }
    
        }
        
        return count;
    }
}
