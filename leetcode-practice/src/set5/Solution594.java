package set5;

import java.util.HashMap;

public class Solution594 {
    public int findLHS(int[] nums) {
        if (nums==null || nums.length==0) {
            return 0;
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        for (int k : map.keySet()) {
            if (map.containsKey(k+1)) {
                res = Math.max(res, map.get(k+1) + map.get(k));
            }
        }
        return res;
    }
}
