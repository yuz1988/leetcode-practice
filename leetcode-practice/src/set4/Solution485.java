package set4;

public class Solution485 {
	public int findMaxConsecutiveOnes(int[] nums) {
        if (nums==null || nums.length==0) {
            return 0;
        }
        
        int max = 0;
        int sum = 0;
        for (int i : nums) {
            if (i == 1) {
                sum++;
                max = Math.max(sum, max);
            }
            else {
                sum = 0;
            }
        }
        return max;
    }
}
