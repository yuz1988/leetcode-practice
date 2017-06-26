package set2;
public class Solution299 {
    public String getHint(String secret, String guess) {
        
        int bull = 0;
        int cow = 0;
        int[] secretrr = new int[10];
        int[] guessrr = new int[10];
        
        for (int i=0; i<secret.length(); i++) {
            if (guess.charAt(i)==secret.charAt(i)) {
                bull++;
            }
            else {
                int s = secret.charAt(i)-'0';
                int g = guess.charAt(i)-'0';
                secretrr[s]++;
                guessrr[g]++;
            }
        }
        for (int i=0; i<10; i++) {
            cow += Math.min(secretrr[i], guessrr[i]);
        }
        
        return bull+"A"+cow+"B";
    }
}