package set4;

public class Solution463 {
    public int islandPerimeter(int[][] grid) {
        if (grid==null || grid.length==0 || grid[0].length==0) {
            return 0;
        }
        
        int m = grid.length;
        int n = grid[0].length;
        int island = 0;
        int neighbor = 0;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (grid[i][j]==1) {
                    island++;
                    // down neighbor
                    if (i!=m-1 && grid[i+1][j]==1) {
                        neighbor++;
                    }
                    // right neighbor
                    if (j!=n-1 && grid[i][j+1]==1) {
                        neighbor++;
                    }
                }
            }
        }
        return island*4 - neighbor*2;
    }
}