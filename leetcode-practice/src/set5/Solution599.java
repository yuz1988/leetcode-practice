package set5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0; i<list1.length; i++) {
            map.put(list1[i], i);
        }
        
        int minIndexSum = Integer.MAX_VALUE;
        List<String> list = new ArrayList<>();
        for (int i=0; i<list2.length; i++) {
            if (map.containsKey(list2[i])) {
                int temp = i+map.get(list2[i]);
                if (temp < minIndexSum) {
                    minIndexSum = temp;
                    list = new ArrayList<>();
                    list.add(list2[i]);
                } 
                else if (temp == minIndexSum) {
                    list.add(list2[i]);
                }
            }
        }
        
        String[] res = new String[list.size()];
        return list.toArray(res);
    }
}
