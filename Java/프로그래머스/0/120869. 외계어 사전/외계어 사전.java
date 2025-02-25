import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        // 두 배열 정렬
        Arrays.sort(spell);
        Arrays.sort(dic);
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < spell.length; i++) {
            sb.append(spell[i]);
        }
        
        String sumSpell = sb.toString();
        System.out.println(sumSpell);
        System.out.println(Arrays.toString(dic));
        
        for (String s : dic) {
            char[] sArr = s.toCharArray();
            Arrays.sort(sArr);
            String sorted = new String(sArr);
            
             if (sorted.equals(sumSpell)) {
                answer = 1;
            } 
        }
       
        return answer;
    }
}