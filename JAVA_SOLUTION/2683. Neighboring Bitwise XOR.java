class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int Sum = 0;
        for (int n : derived) {
            Sum ^= n;
        }
        return Sum == 0;
    }
}
