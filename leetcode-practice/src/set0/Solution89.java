package set0;

import java.util.ArrayList;
import java.util.List;

public class Solution89 {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(0);
        for (int i=1; i<=n; i++) {
            int size = res.size();
            for (int j=size-1; j>=0; j--) {
                res.add(res.get(j) | 1<<(i-1));  // add 2^(i-1)
            }
        }
        return res;
    }
}
