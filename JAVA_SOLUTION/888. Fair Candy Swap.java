import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        for (int x : aliceSizes) {
            sumA += x;
        }

        int sumB = 0;
        Set<Integer> bobSet = new HashSet<>();
        for (int y : bobSizes) {
            sumB += y;
            bobSet.add(y);
        }

        int C = (sumA - sumB) / 2;

        for (int x : aliceSizes) {
            int targetY = x - C;
            if (bobSet.contains(targetY)) {
                return new int[]{x, targetY};
            }
        }

        return new int[0];
    }
}
