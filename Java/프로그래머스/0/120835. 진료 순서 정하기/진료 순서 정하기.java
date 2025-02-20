import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int length = emergency.length;
        int[] answer = new int[length];
        int[] sorted = emergency.clone();
        Arrays.sort(sorted);
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            map.put(sorted[i], length - i);
        }
        
        for (int i = 0; i < length; i++) {
            answer[i] = map.get(emergency[i]);
        }
        return answer;
    }
}