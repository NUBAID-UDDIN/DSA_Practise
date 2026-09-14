public class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        boolean isLeft  = rec1[2] <= rec2[0];
        boolean isRight = rec1[0] >= rec2[2];
        boolean isBelow = rec1[3] <= rec2[1];
        boolean isAbove = rec1[1] >= rec2[3];
        // Overlap exists only if NONE of the separation conditions are met
        return !(isLeft || isRight || isBelow || isAbove);
    }
}
