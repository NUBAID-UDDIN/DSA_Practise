class Solution {
    public int countCommas(int n) {
        long totalCommas = 0;
        long threshold = 1000;
        long num = n;
        
        while (num >= threshold) {
            totalCommas += (num - threshold + 1);
            threshold *= 1000;
        }
        
        return (int) totalCommas;
    }
}
