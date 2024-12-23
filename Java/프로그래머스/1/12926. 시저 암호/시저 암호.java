import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] chars = s.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                chars[i] = ' ';
            } else if (Character.isUpperCase(chars[i])) {
                chars[i] = (char) (((int) chars[i] + n - 'A') % 26 + 'A');
            } else if (Character.isLowerCase(chars[i])) {
                chars[i] = (char) (((int) chars[i] + n - 'a') % 26 + 'a');
            }
            
        }
        answer = String.valueOf(chars);
        
        return answer;
    }
}