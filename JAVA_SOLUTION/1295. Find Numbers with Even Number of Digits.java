class Solution {
    public int findNumbers(int[] nums) {
        int evenDigitCount = 0;

        for (int num : nums) {
            String numStr = String.valueOf(num);
            if (numStr.length() % 2 == 0) {
                evenDigitCount++;
            }
        }

        return evenDigitCount;
    }
}
