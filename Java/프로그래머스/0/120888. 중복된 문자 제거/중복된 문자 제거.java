import java.util.*;

class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
    
        
        String[] strArr = myString.split("");
        Set<String> strSet = new LinkedHashSet<>(Arrays.asList(strArr));

        for (String s : strSet) {
            sb.append(s);                
        }
        answer = sb.toString();
        
        return answer;
    }
}