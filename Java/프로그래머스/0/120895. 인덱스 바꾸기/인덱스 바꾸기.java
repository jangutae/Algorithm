import java.util.*;

class Solution {
    public String solution(String myString, int num1, int num2) {
        String answer = "";
        char[] chars = myString.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        chars[num1] = myString.charAt(num2);
        chars[num2] = myString.charAt(num1);
        
        for (char ch : chars) {
            sb.append(ch);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}