package set1;

public class Solution152 {
	public int maxProduct(int[] nums) {
        int res = nums[0];
        int max = nums[0];
        int min = nums[0];
        
        for (int i=1; i<nums.length; i++) {
            int tempMax = max * nums[i];
            int tempMin = min * nums[i];
            max = Math.max(Math.max(nums[i], tempMax), tempMin);
            min = Math.min(Math.min(nums[i], tempMin), tempMax);
            res = Math.max(res, max);
        }
        return res;
    }
}
