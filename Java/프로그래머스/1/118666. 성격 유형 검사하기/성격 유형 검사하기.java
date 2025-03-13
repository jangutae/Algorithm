import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        String mbti = "RTCFJMAN";
        char[] chars = mbti.toCharArray();
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (char c : chars) {
            map.put(c, 0);
        }
        
        for (int i = 0; i < survey.length; i++) {
            char ch1 = survey[i].charAt(0);
            char ch2 = survey[i].charAt(1);
            int value = choices[i];
            
            if (value < 4) {
                map.put(ch1 ,(map.get(ch1) + 4 - value));
            } else if (value > 4) {
                map.put(ch2 ,(map.get(ch2) + value - 4));
            }
        }
            
            answer.append(map.get('R') >= map.get('T') ? 'R' : 'T');
            answer.append(map.get('C') >= map.get('F') ? 'C' : 'F');
            answer.append(map.get('J') >= map.get('M') ? 'J' : 'M');
            answer.append(map.get('A') >= map.get('N') ? 'A' : 'N');
            
        
        
        return answer.toString();
    }
}