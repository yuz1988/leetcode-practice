package set3;

import java.util.Random;

public class Solution398 {
    private int[] nums;
    private Random r;
    public Solution398(int[] nums) {
        this.nums = nums;
        r = new Random();
    }
    
    public int pick(int target) {
        int count = 0;
        int index = -1;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == target) {
                count++;
                // with prob. 1.0/count exchange i to index
                if (r.nextDouble() < (1.0 / count)) {
                    index = i;
                }
            }
        }
        return index;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */