public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote==null || ransomNote.length()==0) {
            return true;
        }
        
        int[] table = new int[26];
        for (int i=0; i<magazine.length(); i++) {
            table[magazine.charAt(i)-'a']++;
        }
        
        for (int i=0; i<ransomNote.length(); i++) {
            int num = ransomNote.charAt(i)-'a';
            if (table[num]>0) {
                table[num]--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}