package set4;

public class Solution495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries==null || timeSeries.length==0) {
            return 0;
        }
        int t = 0;
        for (int i=1; i<timeSeries.length; i++) {
            int temp = timeSeries[i] - timeSeries[i-1];
            if (temp >= duration) {
                t += duration;
            }
            else {
                t += temp;
            }
        }
        t += duration;
        return t;
    }
}
