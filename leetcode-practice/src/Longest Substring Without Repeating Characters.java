public class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if (s==null || s.length()==0) {
            return 0;
        }
        
        int start = 0;
        int end = 0;
        int longest = 0;
        int seqLength = 0;
        HashSet<Character> charSet = new HashSet<Character>();
        
        while (end<s.length()) {
            char c = s.charAt(end);
            while (charSet.contains(c)) {
                charSet.remove(s.charAt(start));
                start++;
                seqLength--;
            }
            
            charSet.add(c);
            seqLength++;
            if (seqLength>longest) {
                longest = seqLength;
            }
            end++;
        }
        
        return longest;
    }
}