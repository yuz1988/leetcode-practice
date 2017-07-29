package set0;

import java.util.ArrayList;
import java.util.List;

public class Solution39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates==null || candidates.length==0 || target <= 0) {
            return res;
        }
        return backtrack(candidates, target, 0);
    }
    
    private List<List<Integer>> backtrack(int[] cand, int target, int startIdx) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i=startIdx; i<cand.length; i++) {
            int remain = target - cand[i];
            if (remain == 0) {
                List<Integer> list = new ArrayList<>();
                list.add(cand[i]);
                res.add(list);
            }
            else if (remain > 0) {
                List<List<Integer>> temp = backtrack(cand, remain, i);
                if (temp.size() != 0) {
                    for (List<Integer> list : temp) {
                        list.add(cand[i]);
                        res.add(list);
                    }
                }
            }
        }
        return res;
    }
}
