package set0;

public class Solution28 {
	public int strStr(String haystack, String needle) {
        if (needle==null || needle.length()==0) {
            return 0;
        }
        if (haystack==null || haystack.length()==0) {
            return -1;
        }
        
        int lenNe = needle.length();
        int lenHa = haystack.length();
        for (int i=0; i<=(lenHa-lenNe); i++) {
            if (haystack.substring(i, i+lenNe).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

}
