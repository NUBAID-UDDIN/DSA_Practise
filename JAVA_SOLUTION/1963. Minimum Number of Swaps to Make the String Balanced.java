class Solution {
    public int minSwaps(String s) {
        int n = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[') {
                n++;
            } else if (n > 0) {
                n--;
            }
        }

        return (n + 1) / 2;
    } 
    
}
