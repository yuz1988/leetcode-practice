package set4;

public class Solution477 {
    public int totalHammingDistance(int[] nums) {
        int sum = 0;
        for (int i=0; i<32; i++) {
            int bitCount = 0;
            for (int n : nums) {
                bitCount += (n >> i) & 1;
            }
            sum += bitCount * (nums.length - bitCount);
        }
        return sum;
    }
}
