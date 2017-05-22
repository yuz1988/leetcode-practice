import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs==null || strs.length==0) {
            return res;
        }
        
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            if (map.containsKey(sortedStr)) {
                map.get(sortedStr).add(s);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(sortedStr, list);
            }
        }
        
        for (String key : map.keySet()) {
            res.add(map.get(key));
        }
        return res;
    }
}