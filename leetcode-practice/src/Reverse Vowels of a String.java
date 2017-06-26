public class Solution {
    public String reverseVowels(String s) {
        if (s.length()==0) {
            return s;
        }
        
        char[] cArray = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while (left<right) {
            if (helper(cArray[left]) && helper(cArray[right])) {
                char c = cArray[right];
                cArray[right] = cArray[left];
                cArray[left] = c;
                left++;
                right--;
            }
            else if (helper(cArray[left])) {
                right--;
            }
            else if (helper(cArray[right])) {
                left++;
            }
            else {
                left++;
                right--;
            }
        }
        
        return new String(cArray);
    }
    
    private boolean helper(char c) {
        if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
            return true;
        }
        return false;
    }
}