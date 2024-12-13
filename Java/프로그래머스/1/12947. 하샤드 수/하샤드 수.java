import java.util.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        
        String str = String.valueOf(x);
        char[] chars = str.toCharArray();
        
        for (char c : chars) {
            sum += Character.getNumericValue(c);
            answer = ( x % sum == 0) ? true : false;
        }
            
        System.out.println(answer);
        
        
        return answer;
    }
}