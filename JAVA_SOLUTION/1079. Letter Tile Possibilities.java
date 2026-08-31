class Solution {
    public int numTilePossibilities(String tiles) {
        int[] counts = new int[26];
        for (char c : tiles.toCharArray()) {
            counts[c - 'A']++;
        }
        return backtrack(counts);
    }

    private int backtrack(int[] counts) {
        int totalSequences = 0;

        for (int i = 0; i < 26; i++) {
            if (counts[i] == 0) continue;

            totalSequences++;
            counts[i]--;

            totalSequences += backtrack(counts);

            counts[i]++;
        }

        return totalSequences;
    }
}
