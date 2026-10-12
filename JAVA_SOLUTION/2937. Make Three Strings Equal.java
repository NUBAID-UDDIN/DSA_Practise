class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int minLen = Math.min(s1.length(), Math.min(s2.length(), s3.length()));
        
        for (int len = minLen; len > 0; len--) {
            String sub1 = s1.substring(0, len);
            String sub2 = s2.substring(0, len);
            String sub3 = s3.substring(0, len);
            
            if (sub1.equals(sub2) && sub2.equals(sub3)) {
                return (s1.length() - len) + (s2.length() - len) + (s3.length() - len);
            }
        }
        
        return -1;
    }
}
