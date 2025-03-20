import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();
        
        for (int i : lost) {
            lostSet.add(i);
        }   
        
        for (int i : reserve) {
            if (lostSet.contains(i)) {
                lostSet.remove(i);
            } else {
                reserveSet.add(i);
            }
        }
        
        
        for (int r : reserveSet) {
            if (lostSet.contains(r - 1)) {
                lostSet.remove(r - 1);
            } else if (lostSet.contains(r + 1)) {
                lostSet.remove(r + 1);
            }
        }
        
        
        return answer - lostSet.size();
    }
}