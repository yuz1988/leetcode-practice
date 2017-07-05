package set4;

public class Solution461 {
    public int hammingDistance(int x, int y) {
        int xor = x^y;
        int res = 0;
        for (int i=0; i<32; i++) {
            res += (xor >> i) & 1;
        }
        return res;
    }
}
