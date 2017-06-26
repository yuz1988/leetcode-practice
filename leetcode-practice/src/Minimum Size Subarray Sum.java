public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length==0) {
            return 0;
        }
        
        int start = 0;
        int end = 0;
        int currSum = 0;
        int minLen = nums.length+1;
        while (end<nums.length) {
            // extends the "end" bound
            while (currSum<s && end<nums.length) {
                currSum += nums[end];
                end++;
            }
            
            
            // shrinks the "start" bound
            while (currSum>=s && start<end) {
                if (end-start<minLen) {
                    minLen = end-start;
                }
                currSum -= nums[start];
                start++;
            }
        }
        
        if (minLen<nums.length+1) {
            return minLen;
        }
        return 0;
    }
}