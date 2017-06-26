package set0;
public class Solution7 {
    public int reverse(int x) {
        int result = 0;
        
        while (x != 0) {
            int tail = x % 10;
            int tmp = result * 10 + tail;
            
            // check overflow
            if ((tmp - tail) / 10 != result) {
                return 0;
            }
            result = tmp;
            x = x / 10;
        }
        return result;
    }
}