import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        
        // 읽어버린 체육복 수량 set
        Set<Integer> lostSet = new HashSet<>();
        
        
        // 여분을 가지고 있는 수량 set
        Set<Integer> reserveSet = new HashSet<>();
        
        for (int i : lost) {
            lostSet.add(i);
        }
        
        for (int r : reserve) {
            if (lostSet.contains(r)) {
                lostSet.remove(r);
            } else {
                reserveSet.add(r);
            }
                
        }
        
        for (int set : reserveSet) {
            if (lostSet.contains(set - 1)) {
                lostSet.remove(set - 1);
            } else if (lostSet.contains(set + 1)) {
                lostSet.remove(set + 1);
            }
        }
        
        return answer - lostSet.size();
    }
}