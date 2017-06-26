package set5;
import java.util.ArrayList;
import java.util.List;

public class Solution526 {

    private List<List<Integer>> list = new ArrayList<>();
    
    public int countArrangement(int N) {
        if (N==1) {
            return 1;
        }
        List<Integer> first = new ArrayList<>();
        first.add(1);
        list.add(first);
        
        for (int i=2; i<=N; i++) {
            List<List<Integer>> temp = new ArrayList<>();
            for (int j=0; j<list.size(); j++) {
                List<Integer> a = list.get(j);
                for (int k=0; k<=a.size(); k++) {
                    a.add(k, i);
                    
                    if (check(a)) {
                        temp.add(helper(a));
                    }
                    a.remove(k);
                }
            }
            list = temp;
        }
        
        return list.size();
    }
    
    private List<Integer> helper(List<Integer> a) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i=0; i<a.size(); i++) {
            res.add(a.get(i));
        }
        return res;
    }
    
    private boolean check(List<Integer> li) {
        for (int i=0; i<li.size(); i++) {
            int e = li.get(i);
            if ((e>=(i+1) && e%(i+1)==0) || (e<(i+1) && (i+1)%e==0)) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		Solution526 s = new Solution526();
		System.out.println(s.countArrangement(4));
	}

}
