import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sorted = emergency.clone();
        Arrays.sort(sorted);
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            map.put(sorted[i], sorted.length - i);
        }
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = map.get(emergency[i]);
        }
        return answer;
    }
}