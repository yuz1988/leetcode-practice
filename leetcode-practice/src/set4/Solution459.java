package set4;

public class Solution459 {
	public boolean repeatedSubstringPattern(String s) {
        if (s==null || s.length()<1) {
            return false;
        }
        int len = s.length();
        for (int l=1; l<=len/2; l++) {
            if (len % l == 0) {
                String str = s.substring(0, l);
                int num = len / l;
                StringBuilder sb = new StringBuilder();
                for (int i=0; i<num; i++) {
                    sb.append(str);
                }
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

}
