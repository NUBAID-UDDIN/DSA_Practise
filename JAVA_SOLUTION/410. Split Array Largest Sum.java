class Solution {
    public int splitArray(int[] nums, int k) {
        int maxVal = 0;
        int sumVal = 0;

        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
            sumVal += num;
        }

        int low = maxVal;
        int high = sumVal;
        int answer = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canSplit(nums, k, mid)) {
                answer = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return answer;
    }

    private boolean canSplit(int[] nums, int k, int targetSum) {
        int count = 1;
        int currentSum = 0;

        for (int num : nums) {
            if (currentSum + num > targetSum) {
                count++;
                currentSum = num;
            } else {
                currentSum += num;
            }
        }

        return count <= k;
    }
}
