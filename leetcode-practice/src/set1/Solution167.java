package set1;
public class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        if (numbers==null || numbers.length==0) {
            return res;
        } 
        
        int i=0; 
        int j=numbers.length-1;
        while (i<j) {
            if (numbers[i] + numbers[j] == target) {
                res[0] = i+1;
                res[1] = j+1;
                return res;
            }
            else if (numbers[i] + numbers[j] < target) {
                i++;
            }
            else {
                j--;
            }
        }
        return res;
    }
}
