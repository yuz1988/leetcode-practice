package set1;
import java.util.List;

public class Solution120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 0) {
            return 0;
        }
        
        int length = triangle.size();
        int[] res = new int[length];
        
        for(int i=0; i<length; i++) {
            res[i] = triangle.get(length-1).get(i);
        }
        
        for(int i=triangle.size()-2; i>=0; i--) {
            for(int j=0; j<=i; j++) {
                res[j] = Math.min(res[j],res[j+1]) + triangle.get(i).get(j); 
            }
        }
        return res[0];
    }
}