import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        // 두 배열 정렬
        Arrays.sort(spell);
        Arrays.sort(dic);
        
       String result = String.join("", spell);
        
        System.out.println(result);
        System.out.println(Arrays.toString(dic));
        
        for (String s : dic) {
            char[] sArr = s.toCharArray();
            Arrays.sort(sArr);
            String sorted = new String(sArr);
            
             if (sorted.equals(result)) {
                answer = 1;
            } 
        }
       
        return answer;
    }
}