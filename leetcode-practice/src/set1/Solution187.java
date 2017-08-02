package set1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution187 {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        HashSet<Integer> oneSet = new HashSet<>();
        HashSet<Integer> twoSet = new HashSet<>();
        for (int i=0; i<s.length()-9; i++) {
            int hash = 0;
            for (int j=i; j<i+10; j++) {
                char c = s.charAt(j);
                if (c == 'A') {
                    hash = hash | 0;
                }
                else if (c == 'C') {
                    hash = hash | 1;
                }
                else if (c == 'G') {
                    hash = hash | 2;
                }
                else {
                    hash = hash | 3;
                }
                // rolling hash: 0 ~ 3, so hash * 4
                hash = hash << 2;
            }
            if (!oneSet.contains(hash)) {
                oneSet.add(hash);
            }
            else if (!twoSet.contains(hash)) {
                twoSet.add(hash);
                res.add(s.substring(i, i+10));
            }
        }
        return res;
    }
}
