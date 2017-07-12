package set4;

public class Solution476 {
    public int findComplement(int num) {
        int comp = 0;
        int base = 1;
        while (num > 0) {
            int remain = num % 2;
            if (remain == 0) {
                comp += base;
            }
            base *= 2;
            num = num / 2;
        }
        return comp;
    }
}