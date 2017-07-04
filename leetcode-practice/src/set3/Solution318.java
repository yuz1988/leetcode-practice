package set3;

public class Solution318 {
    public int maxProduct(String[] words) {
        if (words==null || words.length==0) {
            return 0;
        }
        
        int len = words.length;
        int[] values = new int[len];
        for (int i=0; i<len; i++) {
            String w = words[i];
            if (w!=null && w.length()!=0) {
                for (int j=0; j<w.length(); j++) {
                    values[i] |= 1 << (w.charAt(j)-'a');
                }
            }
        }
        
        int res = Integer.MIN_VALUE;
        for (int i=0; i<len-1; i++) {
            for (int j=i+1; j<len; j++) {
                String w1 = words[i];
                String w2 = words[j];
                if (w1!=null && w2!=null) {
                   if ((values[i] & values[j]) == 0) {
                       res = Math.max(res, w1.length()*w2.length());
                   }
                }   
            }
        }
        
        return (res==Integer.MIN_VALUE)?0:res;
    }
}
