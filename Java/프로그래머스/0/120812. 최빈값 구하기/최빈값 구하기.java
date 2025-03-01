import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int len = array.length;
        Arrays.sort(array);
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int maxFreq = 0; // 최댓값 빈도수 저장 변수
        int mode = -1; // 최빈값 저장 변수
        boolean multipleModes = false; // 최빈값이 여러 개인지 여부
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            
            if (value > maxFreq) {
                maxFreq = value;
                mode = key;
                multipleModes = false;
            } else if (value == maxFreq) {
                multipleModes = true;
            }
        }
        
        answer = multipleModes ? -1 : mode;
        
        System.out.println(map);
        return answer;
    }
}