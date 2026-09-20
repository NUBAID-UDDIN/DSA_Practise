class Solution {
    public int reverseDegree(String s) {
        long totalDegree = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            int reverseRank = 26 - (s.charAt(i) - 'a');
  
            totalDegree += (long) reverseRank * (i + 1);
        }
        
        return (int) totalDegree;
        
    }
}
