package set3;
import java.util.ArrayList;
import java.util.List;

class NumArray {

    private List<Integer> sumList = new ArrayList<Integer>();
    
    public NumArray(int[] nums) {
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
            sumList.add(sum);
        }
    }

    public int sumRange(int i, int j) {
        if (i==0) {
            return sumList.get(j);
        }
        return sumList.get(j)-sumList.get(i-1);
    }
}

public class Solution303 {
	
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);