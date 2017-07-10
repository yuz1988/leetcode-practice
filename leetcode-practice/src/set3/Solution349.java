package set3;

import java.util.HashSet;

public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1==null || nums2==null) {
            return null;
        }
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            if (set1.contains(num)) {
                set.add(num);
            }
        }
        
        // convert set to array
        int[] res = new int[set.size()];
        int i = 0;
        for (int num : set) {
            res[i] = num;
            i++;
        }
        return res;
    }
}
