class Solution {
    public int maxChunksToSorted(int[] arr) {
        int chunks = 0;
        int maxfar = 0;
        
        for (int i = 0; i < arr.length; i++) {
            maxfar = Math.max(maxfar, arr[i]);
            if (maxfar == i) {
                chunks++;
            }
        }
        
        return chunks;
    }
}
