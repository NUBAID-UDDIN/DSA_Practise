class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       Arrays.sort(nums1);
       Arrays.sort(nums2);
       
       int i = 0, j = 0;
       List<Integer> resultList = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                resultList.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] result = new int[resultList.size()];
        for (int k = 0; k < resultList.size(); k++) {
            result[k] = resultList.get(k);
        }

        return result;
    }
}
