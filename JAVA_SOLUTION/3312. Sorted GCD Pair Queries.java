import java.util.Arrays;

class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }

        int[] freq = new int[max + 1];
        for (int x : nums) {
            freq[x]++;
        }

        long[] mult = new long[max + 1];
        for (int i = 1; i <= max; i++) {
            for (int j = i; j <= max; j += i) {
                mult[i] += freq[j];
            }
        }

        long[] gcd = new long[max + 1];
        for (int i = max; i >= 1; i--) {
            long pairs = mult[i] * (mult[i] - 1) / 2;
            for (int j = 2 * i; j <= max; j += i) {
                pairs -= gcd[j];
            }
            gcd[i] = pairs;
        }

        long[] pref = new long[max + 1];
        for (int i = 1; i <= max; i++) {
            pref[i] = pref[i - 1] + gcd[i];
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ans[i] = search(pref, queries[i]);
        }

        return ans;
    }

    private int search(long[] pref, long target) {
        int L = 0, R = pref.length;
        while (L < R) {
            int mid = L + (R - L) / 2;
            if (pref[mid] <= target) {
                L = mid + 1;
            } else {
                R = mid;
            }
        }
        return L;
    }
}
