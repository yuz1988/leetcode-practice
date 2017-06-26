package set0;
import java.util.ArrayList;
import java.util.List;

public class Solution68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        
        List<String> list = new ArrayList<String>();
        ArrayList<String> line = new ArrayList<String>();
        int length = 0;     // size of all chars
        int count = 0;
        while (count < words.length) {
            int numOfSpaces = line.size();
            if (length + numOfSpaces + words[count].length() > maxWidth) {
                String s = adjust(line, length, maxWidth);
                list.add(s);
                
                // renew line and length
                line = new ArrayList<String>();
                length = 0;
            }
            else {
                line.add(words[count]);
                length += words[count].length();
                count++;
            }
        }
        
        // left justify the last line
        if (line.size()!=0) {
            String s = "";
            for (int i=0; i<(line.size()-1); i++) {
                s = s + line.get(i) + " ";
            }
            String lastWord = line.get(line.size()-1);
            s = s + lastWord;
            int numOfSpaces = line.size()-1;
            int margin = maxWidth - numOfSpaces - length;
            for (int i=0; i<margin; i++) {
                s = s + " ";
            }
            
            list.add(s);
        }
        
        return list;
    }
    
    
    private static String adjust(ArrayList<String> line, int length, int maxWidth) {
        String s = "";
        int numOfGap = line.size() - 1;
        int margin = maxWidth - length;
        
        for (String word : line) {
            if (numOfGap==0) {
                s += word;
                for (int i=0; i<margin; i++) {
                    s += " ";
                }
            }
            else {
                int numOfSpace = (margin%numOfGap==0)?(margin/numOfGap):(margin/numOfGap+1);
                s += word;
                for (int i=0; i<numOfSpace; i++) {
                    s += " ";
                }
                numOfGap--;
                margin -= numOfSpace;
            }
        }
        
        return s;
    }
    
}