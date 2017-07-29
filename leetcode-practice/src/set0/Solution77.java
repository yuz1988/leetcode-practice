package set0;

import java.util.ArrayList;
import java.util.List;

public class Solution77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (n <= 0 || k <= 0 || n < k) {
            return res;
        }
        
        // element n + (1 ~ n-1, k-1)
        List<List<Integer>> list1 = combine(n-1, k-1);
        if (list1.size() != 0) {
            for (List<Integer> l : list1) {
                l.add(n);
                res.add(l);
            }
        }
        else {
            List<Integer> l = new ArrayList<>();
            l.add(n);
            res.add(l);
        }
        
        // (1 ~ n-1, k)
        List<List<Integer>> list2 = combine(n-1, k);
        res.addAll(list2);
        
        return res;
    }
}
