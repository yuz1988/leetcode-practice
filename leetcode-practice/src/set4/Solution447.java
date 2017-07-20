package set4;

import java.util.HashMap;

public class Solution447 {
    public int numberOfBoomerangs(int[][] points) {
        if (points==null || points.length==0) {
            return 0;
        }
        int n = points.length;
        int res = 0;
        HashMap<Double, Integer> map = new HashMap<>();
        for (int i=0; i<n; i++) {
            int[] p1 = points[i];
            for (int j=0; j<n; j++) {
                if (j != i) {
                    int[] p2 = points[j];
                    double dist = Math.sqrt((p1[0]-p2[0])*(p1[0]-p2[0])+(p1[1]-p2[1])*(p1[1]-p2[1]));
                    map.put(dist, map.getOrDefault(dist, 0)+1);
                }
            }
            for (int v : map.values()) {
                if (v > 1) {
                    res += v * (v-1);
                }
            }
            map.clear();
        }
        return res;
    }
}