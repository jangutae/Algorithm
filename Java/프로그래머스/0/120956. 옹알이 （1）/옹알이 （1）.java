class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] canDo = {"aya", "ye" , "woo", "ma"};
        
        for (String bab : babbling) {
            for (String say : canDo) {
                if (bab.contains(say)) {
                    bab = bab.replaceAll(say, ",");
                    if (bab.replaceAll(",", "").isEmpty()) {
                        answer++;
                    }
                }
            }
        }
        
       
        return answer;
    }
}