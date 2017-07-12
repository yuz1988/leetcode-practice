package set5;

import java.util.HashMap;
import java.util.List;

public class Solution554 {
	public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (List<Integer> list : wall) {
            int sum = 0;
            for (int i=0; i<list.size()-1; i++) {
                sum += list.get(i);
                if (map.containsKey(sum)) {
                    int value = map.get(sum);
                    value++;
                    map.put(sum, value);
                }
                else {
                    map.put(sum, 1);
                }
            }
        }
        
        int res = 0;
        for (Integer v : map.values()) {
            res = Math.max(res, v);
        }
        return wall.size()-res;
    }
}
