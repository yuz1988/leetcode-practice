package set0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums==null || nums.length<3) {
            return res;
        }
        
        Arrays.sort(nums);
        for (int i=0; i<nums.length-2; i++) {
            if (i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            
            int target = -nums[i];
            int j = i+1;
            int k = nums.length-1;
            while (j<k) {
                int sum = nums[j] + nums[k];
                if (sum==target) {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++; k--;
                    while (j<k && nums[j]==nums[j-1]) {
                        j++;
                    }
                    while (j<k && nums[k]==nums[k+1]) {
                        k--;
                    }
                }
                else if (sum < target) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }
        return res;
    }
}