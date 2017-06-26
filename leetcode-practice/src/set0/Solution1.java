package set0;
import java.util.HashMap;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];
        if (nums==null || nums.length==0) {
            return indexes;
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int diff = target-nums[i];
            if (map.containsKey(diff)) {
                indexes[0] = map.get(diff);
                indexes[1] = i;
                return indexes;
            }
            map.put(nums[i], i);
        }
        return indexes;
    }
}
