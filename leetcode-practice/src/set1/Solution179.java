package set1;
import java.util.Arrays;
import java.util.Comparator;

public class Solution179 {
    public String largestNumber(int[] nums) {
        
        String[] strs = new String[nums.length];
        for (int i=0; i<nums.length; i++) {
            strs[i] = Integer.toString(nums[i]);
        }
        
        Arrays.sort(strs, new NumComparator());
        
        StringBuilder sb = new StringBuilder();
        for (String str:strs) {
            sb.append(str);
        }
        String numberStr = sb.toString();
        
        // remove leading zeroes
        int nonZeroIndex = 0;
        for (String str:strs) {
            if (str.equals("0")) {
                nonZeroIndex++;
            }
            else {
                break;
            }
        }
        
        if (nonZeroIndex == nums.length) {
            return "0";
        }
        else {
            return numberStr.substring(nonZeroIndex);
        }
        
    }
  
}

class NumComparator implements Comparator<String> {
    public int compare(String a, String b) {
        String str = b+a;
        return str.compareTo(a+b);
    }
}
