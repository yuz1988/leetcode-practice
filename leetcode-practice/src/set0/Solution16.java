package set0;

import java.util.Arrays;

public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        if (nums==null || nums.length<3) {
            return 0;
        }
        Arrays.sort(nums);
        int res = nums[0]+nums[1]+nums[2];
        
        for (int i=0; i<nums.length-2; i++) {
            int left = i+1;
            int right = nums.length-1;
            while (left < right) {
                int temp = nums[left] + nums[right] + nums[i];
                if (temp == target) {
                    return temp;
                }
                else {
                    if (Math.abs(target-res) > Math.abs(target-temp)) {
                        res = temp;
                    }
                    
                    if (temp < target) {
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }
        }
        
        return res;
    }
}