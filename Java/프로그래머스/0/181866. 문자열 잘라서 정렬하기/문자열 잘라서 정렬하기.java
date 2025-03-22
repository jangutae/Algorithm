import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String result = myString.replaceAll("[x]+", " ").trim();
        String[] answer = result.split(" ");
        

        Arrays.sort(answer);
        
        return answer;
    }
}