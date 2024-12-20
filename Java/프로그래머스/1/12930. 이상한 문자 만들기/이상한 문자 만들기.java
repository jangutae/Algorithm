import java.util.*;

class Solution {
    public String solution(String s) {
        String[] strs = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();
       
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                if (j % 2 == 0) {
                    sb.append(Character.toUpperCase(strs[i].charAt(j)));    
                } else {
                    sb.append(Character.toLowerCase(strs[i].charAt(j)));
                }
            }
            if (i == strs.length - 1) break;
            sb.append(" ");
        }
         System.out.println(sb.toString());
        
        
       
        
        return sb.toString();
    }
}