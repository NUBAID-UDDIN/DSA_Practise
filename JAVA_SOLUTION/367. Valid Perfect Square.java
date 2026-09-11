class Solution {
    public boolean isPerfectSquare(int num) {
        long i = 1;
        while (i * i <= num) {
            if (i * i == num) {
                return true;
            }
            i++;
        }
        return false;
    }
}
