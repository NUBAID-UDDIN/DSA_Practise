class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int activeSections = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                activeSections++;
            }
        }

        String modified = "1" + s + "1";

        List<Integer> zeroGroups = new ArrayList<>();
        int index = 0;


        while (index < modified.length()) {
            if (modified.charAt(index) == '1') {
                index++;
                continue;
            }

            int count = 0;
            while (index < modified.length() && modified.charAt(index) == '0') {
                count++;
                index++;
            }
            zeroGroups.add(count);
        }

        if (zeroGroups.size() < 2) {
            return activeSections;
        }

        int bestExtra = 0;

        for (int i = 0; i < zeroGroups.size() - 1; i++) {
            int combined = zeroGroups.get(i) + zeroGroups.get(i + 1);
            bestExtra = Math.max(bestExtra, combined);
        }

        return activeSections + bestExtra;
    }
}
