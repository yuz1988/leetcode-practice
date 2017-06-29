package set3;

public class Solution300 {
    public int lengthOfLIS(int[] nums) {
        if (nums==null || nums.length==0) {
            return 0;
        }
        
        int res = 1;
        int[] lens = new int[nums.length];
        for (int i=nums.length-1; i>=0; i--) {
            int j = i+1;
            int max = 1;
            while (j < nums.length) {
                if (nums[j] > nums[i]) {
                    int sum = lens[j] + 1;
                    if (sum > max) {
                        max = sum;
                    }
                }
                j++;
            }
            lens[i] = max;
            if (max > res) {
                res = max;
            }
        }
        
        return res;
    }
}