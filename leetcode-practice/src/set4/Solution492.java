package set4;

public class Solution492 {
    public int[] constructRectangle(int area) {
        int w = (int) Math.sqrt(area);
        while (area % w != 0) {
            w--;
        }
        int[] res = new int[]{area / w, w};
        return res;
    }
}