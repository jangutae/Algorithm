import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split(" ");
        int cnt = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) cnt++;
        }
        
        String[] answer = new String[cnt];
        int index = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].isEmpty()) {
                answer[index++] = arr[i];
            }
        }

        
        // System.out.println(s);
        
        return answer;
    }
}