public class Solution35 {
	public int searchInsert(int[] nums, int target) {
        if (nums==null || nums.length==0) {
            return 0;
        }
        
        int left = 0;
        int right = nums.length-1;
        int index = -1;
        
        // find left most element larger than target
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else {
                index = mid;
                right = mid - 1;
            }
        }
        
        // all elements are smaller than target, insert at the end
        if (index == -1) {
            return nums.length;
        }
        return index;
    }
}
