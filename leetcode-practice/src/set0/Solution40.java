package set0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates==null || candidates.length==0 || target <= 0) {
            return res;
        }
        Arrays.sort(candidates);
        return backtrack(candidates, target, 0);
    }
    
    private List<List<Integer>> backtrack(int[] cand, int target, int startIdx) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i=startIdx; i<cand.length; i++) {
            // check duplicate
            if (i > startIdx && cand[i] == cand[i-1]) {
                continue;
            }
            int remain = target - cand[i];
            if (remain == 0) {
                List<Integer> list = new ArrayList<>();
                list.add(cand[i]);
                res.add(list);
            }
            else if (remain > 0) {
                List<List<Integer>> temp = backtrack(cand, remain, i+1);
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
