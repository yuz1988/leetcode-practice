package set0;

/**
 * n^2 time complexity, should be lower
 *
 */
public class Solution31 {
    public void nextPermutation(int[] nums) {
        if (nums==null || nums.length==0 || nums.length==1) {
            return;
        }
        
        // find the inverse pair(nums[i] < nums[j]) with largest index i
        int i = nums.length-2;
        int j = nums.length-1;
        while (i >= 0) {
            while (j > i) {
                if (nums[i] < nums[j]) {
                    swap(nums, i, j);
                    // sort elements after index i
                    insertSort(nums, i+1);
                    return;
                }
                j--;
            }
            i--;
            // reset j to the last element of nums
            j = nums.length-1;
        }
        
        reverse(nums);
    }
    
    private void reverse(int[] nums) {
        int l = nums.length;
        for (int i=0; i<l/2; i++) {
            swap(nums, i, l-i-1);
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    
    private void insertSort(int[] nums, int start) {
        for (int i=start; i<nums.length-1; i++) {
            for (int j=i+1; j>start; j--) {
                if (nums[j-1] < nums[j]) {
                    break;
                }
                swap(nums, j-1, j);
            }
        }
    }
}