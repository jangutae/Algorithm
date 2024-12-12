import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = String.valueOf(n);
        
        char[] chars = str.toCharArray();
        
        Arrays.sort(chars);
       
        StringBuilder sortedStr = new StringBuilder(new String(chars));
        sortedStr.reverse();
        
        answer = Long.parseLong(sortedStr.toString());
        
        return answer;
    }
}