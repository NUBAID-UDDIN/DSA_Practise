class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int statesPerPig = minutesToTest / minutesToDie + 1;
        int pigs = 0;
        int totalStates = 1;

        while (totalStates < buckets) {
            pigs++;
            totalStates *= statesPerPig;
        }

        return pigs;
    }
}
