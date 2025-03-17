import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        int len = strArr.length;
        int cnt = len;
        for (String s : strArr) {
            if (s.contains("ad")) cnt--;
        }
        
        String[] answer = new String[cnt];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (!strArr[i].contains("ad")) answer[index++] = strArr[i];
        }
        return answer;
    }
}