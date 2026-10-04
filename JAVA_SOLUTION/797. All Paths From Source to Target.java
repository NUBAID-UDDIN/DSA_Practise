class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();

        currentPath.add(0);
        
        dfs(graph, 0, graph.length - 1, currentPath, result);
        return result;
    }

    void dfs(int[][] graph, int node, int target, List<Integer> currentPath, List<List<Integer>> result) {
        // Base Case: Target node reached
        if (node == target) {
            result.add(new ArrayList<>(currentPath));
            return;
        }
        for (int n : graph[node]) {
            currentPath.add(n);                          // Choose
            dfs(graph, n, target, currentPath, result);  // Explore
            currentPath.remove(currentPath.size() - 1);  // Backtrack
        }
    }
}
