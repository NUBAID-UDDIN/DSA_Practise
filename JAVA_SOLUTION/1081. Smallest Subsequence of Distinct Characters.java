import java.util.TreeSet;

class Solution {
    public String smallestSubsequence(String s) {
        TreeSet<Character> uniqueChars = new TreeSet<>();
        for (char c : s.toCharArray()) {
            uniqueChars.add(c);
        }
        
        StringBuilder result = new StringBuilder();
        int lastPickedIndex = 0; 
        

        while (!uniqueChars.isEmpty()) {

            for (char c : uniqueChars) {
                int firstPos = s.indexOf(c, lastPickedIndex);
  
                if (canFormValidSequence(s, uniqueChars, firstPos)) {
                    result.append(c);
                    uniqueChars.remove(c); 
                    lastPickedIndex = firstPos + 1; 
                    break; 
                }
            }
        }
        
        return result.toString();
    }
    

    private boolean canFormValidSequence(String s, TreeSet<Character> uniqueChars, int index) {
        for (char c : uniqueChars) {
            if (s.indexOf(c, index) == -1) {
                return false; 
            }
        }
        return true;
    }
}
