class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = 0;
        int m = people.length - 1;
        int boats = 0;
        
        while (n <= m) {
            if (people[n] + people[m] <= limit) {
                n++;
            }
            m--;
            boats++;
        }
        
        return boats;
    }
}
