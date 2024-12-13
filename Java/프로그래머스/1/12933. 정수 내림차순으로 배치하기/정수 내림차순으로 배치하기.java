import java.util.*;


class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = String.valueOf(n);
        
        char[] chars = str.toCharArray();
        
        Arrays.sort(chars);
        
        StringBuilder sorted = new StringBuilder(new String(chars));
        sorted.reverse();
        
        answer = Long.parseLong(sorted.toString());
        
        return answer;
    }
}