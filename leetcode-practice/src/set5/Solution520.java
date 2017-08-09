package set5;

public class Solution520 {
    public boolean detectCapitalUse(String word) {
        if (word == null || word.length() <= 1) {
            return true;
        }
        
        int count = 0;
        for (int i=0; i<word.length(); i++) {
            // capital letter
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                count++;
            }
        }
        
        return (count == word.length()) || (count == 0) || (count == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z');
    }
}
