import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = String.valueOf(n);
        
        char[] chars = str.toCharArray();
        
        Arrays.sort(chars);
        
        StringBuilder sortedChars = new StringBuilder(new String(chars));
        
        sortedChars.reverse();
        
        answer = Long.parseLong(sortedChars.toString());
        
        System.out.println(answer);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // Arrays.sort(list);

//         StringBuilder sb = new StringBuilder();
//         for (String aList : list) sb.append(aList);

//         return Long.parseLong(sb.reverse().toString());
        
        // char[] chars = str.toCharArray();
        
        // Arrays.sort(chars);
       
        // StringBuilder sortedStr = new StringBuilder(new String(chars));
        // sortedStr.reverse();
        
        // answer = Long.parseLong(sortedStr.toString());
        
        return answer;
    }
}