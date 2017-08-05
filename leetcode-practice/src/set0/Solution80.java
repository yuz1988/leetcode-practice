package set0;

public class Solution80 {
    public int removeDuplicates(int[] nums) {
        if (nums==null || nums.length==0) {
            return 0;
        }
        
        // i: fast pointer, j: slow pointer
        int j = 0;
        for (int i=0; i<nums.length; i++) {
            if (j < 2 || nums[i] > nums[j-2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
