public class Solution {
    public int uniquePaths(int m, int n) {
        if (m==0 || n==0) {
            return 0;
        }
        if (m==1 || n==1) {
            return 1;
        }
        
        int[] state = new int[n];
        for (int i=0; i<n; i++) {
            state[i] = 1;
        }
        
        for (int i=m-2; i>=0; i--) {
            state[n-1] = 1;
            for (int j=n-2; j>=0; j--) {
                state[j] = state[j] + state[j+1];
            }
        }
        
        return state[0];
    }
}