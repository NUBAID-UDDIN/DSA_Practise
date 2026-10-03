class Solution {
    public List<List<Integer>> findSolution(CustomFunction customFunction, int z) {
        List<List<Integer>> result = new ArrayList<>();
        
        int x = 1;
        int y = 1000;

        while (x <= 1000 && y >= 1) {
            int val = customFunction.f(x, y);

            if (val == z) {
                result.add(Arrays.asList(x, y));
                x++;
                y--;
            } else if (val > z) {
                y--;
            } else {
                x++;
            }
        }

        return result;
    }
}
