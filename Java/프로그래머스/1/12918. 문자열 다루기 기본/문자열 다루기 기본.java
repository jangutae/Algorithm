import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if (s.length() != 4 && s.length() != 6) {
            answer = false;
        }
        
        char[] ch = s.toCharArray();
        
        Arrays.sort(ch);
        
        if (!Character.isDigit(ch[ch.length - 1])) {
            answer = false;
        }
                    
        return answer;
    }
}