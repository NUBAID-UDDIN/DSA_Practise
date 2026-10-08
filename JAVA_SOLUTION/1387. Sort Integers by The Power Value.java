class Solution {
    public int getKth(int n, int m, int k) {
        List<int[]> elements = new ArrayList<>();

        for (int i = n; i <= m; i++) {
            elements.add(new int[]{getPower(i), i});
        }

        elements.sort((a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });

        return elements.get(k - 1)[1];
    }

    int getPower(int x) {
        int steps = 0;
        while (x != 1) {
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = 3 * x + 1;
            }
            steps++;
        }
        return steps;

    }
}
