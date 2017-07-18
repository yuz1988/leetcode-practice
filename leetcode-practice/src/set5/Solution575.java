package set5;

import java.util.HashSet;

public class Solution575 {
    public int distributeCandies(int[] candies) {
        if (candies==null || candies.length==0) {
            return 0;
        }
        
        HashSet<Integer> set = new HashSet<>();
        for (int c : candies) {
            set.add(c);
        }
        return Math.min(candies.length/2, set.size());
    }
}