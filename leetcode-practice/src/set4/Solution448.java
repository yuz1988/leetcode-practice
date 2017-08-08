package set4;

import java.util.ArrayList;
import java.util.List;

public class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums==null || nums.length==0) {
            return res;
        }
        for (int i=0; i<nums.length; i++) {
            int value = Math.abs(nums[i]) - 1;
            nums[value] = -1 * Math.abs(nums[value]);
        }
        
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;
    }
}
