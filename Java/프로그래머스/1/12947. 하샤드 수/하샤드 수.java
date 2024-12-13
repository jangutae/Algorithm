import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        
        char[] chars = String.valueOf(x).toCharArray();
        
        for (char c : chars) {
            sum += Character.getNumericValue(c);
            answer = ( x % sum == 0) ? true : false;
        }
            
        System.out.println(answer);
        
        
        return answer;
    }
}