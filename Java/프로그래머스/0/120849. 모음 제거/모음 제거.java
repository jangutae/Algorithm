import java.util.*;

class Solution {
    public String solution(String myString) {
        String answer = "";
        
        answer = myString.replaceAll("[aeiou]", "");
            
        
        
        
        
//         String[] strArr = {"a", "e", "i", "o", "u"};
//         String[] ms = myString.split("");
//         StringBuilder sb = new StringBuilder();
        
//         for (String s1 : ms) {
//             if (Arrays.asList(strArr).contains(s1)) {
//                 continue;
//             }
//             answer = sb.append(s1).toString();
//         }
        
        return answer;
    }
}
