package set4;

import java.util.ArrayList;
import java.util.List;

public class Solution442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0) {
                list.add(Math.abs(nums[i]));
            }
            nums[index] = -nums[index];
        }
        return list;
    }
}