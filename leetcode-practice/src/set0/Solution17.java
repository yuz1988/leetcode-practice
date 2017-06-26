package set0;
import java.util.ArrayList;
import java.util.List;

/**
 * 17. Letter Combinations of a Phone Number
 */
public class Solution17 {
    
    private static final String[] TOKENS = {" ","_","abc",
                                    "def","ghi","jkl","mno",
                                    "pqrs","tuv","wxyz"};
                                    
    public List<String> letterCombinations(String digits) {
        List<String> combines = new ArrayList<String>();
        if ((digits==null) || (digits.length()==0)) {
            return combines;
        }
        
        for (int i=0; i<digits.length(); i++) {
            // get single digit
            int num = digits.charAt(i) - '0';
            String token = TOKENS[num];
            
            // new combines
            List<String> combines1 = new ArrayList<String>();
            
            // append each letter of token to the combines
            // and insert to the new combines
            for (int j=0; j<token.length(); j++) {
                char letter = token.charAt(j);
                
                if (combines.size()==0) {
                    combines1.add(letter + "");
                }
                else {
                    for (String c : combines) {
                        StringBuffer sb = new StringBuffer(c);
                        combines1.add(sb.append(letter).toString());
                    }
                }
            }
            combines = combines1;
        }
        return combines;
    }
}