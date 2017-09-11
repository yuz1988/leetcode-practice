
package set1;

class Solution153 {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left<right && nums[left]>nums[right]) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[left]) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}