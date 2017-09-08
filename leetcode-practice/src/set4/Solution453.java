package set4;

public class Solution453 {
    public int minMoves(int[] nums) {
        // incrementing n-1 by 1 equals reducing remaining element by 1
        // find smallest element
        int small = nums[0];
        for (int n : nums) {
            small = Math.min(small, n);
        }
        // sum all diffs of each element to the smallest
        int sum = 0;
        for (int n : nums) {
            sum += n - small;
        }
        return sum;
    }
}
