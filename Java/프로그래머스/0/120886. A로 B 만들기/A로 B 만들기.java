import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] strBe = before.split("");
        String[] strAf = after.split("");
        Arrays.sort(strBe);
        Arrays.sort(strAf);
        
        
        for (int i = 0; i < strBe.length; i++) {
        answer = Arrays.equals(strBe, strAf) ? 1 : 0;
        }
        
        return answer;
    }
}