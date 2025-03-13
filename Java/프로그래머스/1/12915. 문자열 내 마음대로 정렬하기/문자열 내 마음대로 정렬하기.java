import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        int len = strings.length;
        String[] answer = strings.clone();
        
        
        for (int i = 0; i < len; i++) {
            StringBuilder sb = new StringBuilder(strings[i]);
            answer[i] = sb.insert(0, strings[i].charAt(n)).toString();
        }
        
        Arrays.sort(answer);
        
        for (int i = 0; i < len; i++) {
            StringBuilder sb = new StringBuilder(answer[i]);
            answer[i] = sb.delete(0, 1).toString();
        }
        
        return answer;
    }
}