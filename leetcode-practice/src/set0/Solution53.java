package set0;

public class Solution53 {
	// dp solution, needs divide and conquer
	public int maxSubArray(int[] nums) {
        int res = nums[0];
        // dp[i] stores the max subarray sum upto (including) ith element
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i=1; i<nums.length; i++) {
            dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
