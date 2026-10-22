class Solution {
    public boolean xorGame(int[] nums) {
        int xorSum = 0;
        
        // Find the total XOR sum of all numbers on the board
        for (int num : nums) {
            xorSum ^= num;
        }
        
        // Alice wins if the XOR is already 0, or if she has an even number of turns available
        return xorSum == 0 || nums.length % 2 == 0;
    }
}
