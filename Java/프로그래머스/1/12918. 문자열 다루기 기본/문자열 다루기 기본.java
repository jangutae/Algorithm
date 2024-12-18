import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        
        if (!Character.isDigit(ch[ch.length - 1])) {
            answer = false;  // 숫자가 아니면 false
        } 
        
        System.out.println(Arrays.toString(ch));
        
        return answer;
    }
}