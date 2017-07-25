package set5;

import java.util.HashMap;

public class Solution560 {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int sum = 0;
        for (int n : nums) {
            sum += n;
            if (sum == k) {
                res++;
            }
            if (map.containsKey(sum-k)) {
                res += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return res;
    }
}