import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players.clone();
        
        Map<String, Integer> rankMap = new HashMap<>();
        
        for (int i = 0; i < answer.length; i++) {
            rankMap.put(answer[i], i);
        }
        
        
        for (String s : callings) {
            int rank = rankMap.get(s);
            
            if (rank > 0) {
                String frontRank = answer[rank - 1];
                
                
                answer[rank - 1] = s;
                answer[rank] = frontRank;
                
                
                rankMap.put(s, rank - 1);
                rankMap.put(frontRank, rank);
            }
        }
        
        return answer;
    }
}