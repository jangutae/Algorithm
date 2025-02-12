class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] canDo = {"aya", "ye" , "woo", "ma"};
        for (String bab : babbling) {
            for (String can : canDo) {
                 if (bab.contains(can)) {
                     bab = bab.replaceAll(can, ",");
                      if (bab.replaceAll(",", "").isEmpty()) answer++;
                     }
                 }
            }
        return answer;
        }
    }
