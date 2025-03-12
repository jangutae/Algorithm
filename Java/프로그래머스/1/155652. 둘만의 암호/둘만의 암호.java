import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        
        Set<Character> set = new HashSet<>();
        
        for (char c : skip.toCharArray()) {
            set.add(c);
        }        
        
         StringBuilder sb = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            int cnt = index;
            
            while (cnt > 0) {
                ch++;
                
                if (ch > 'z') ch = 'a';
                
                if (!set.contains(ch)) {
                    cnt--;
                }
            }
            
            sb.append(ch);
        }
        
       
        
    
        
        return sb.toString();
    }
}