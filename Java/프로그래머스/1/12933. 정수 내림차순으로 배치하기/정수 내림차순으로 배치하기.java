import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = String.valueOf(n);
        
        char[] chars = str.toCharArray();
        
        Arrays.sort(chars);
       
        System.out.println(Arrays.toString(chars));
        
        return answer;
    }
}