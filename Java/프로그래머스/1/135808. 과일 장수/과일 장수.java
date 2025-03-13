import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int len = score.length;
        
        Arrays.sort(score);
        
        for (int i = len; i >= m; i -= m) {
            answer += score[i - m] * m;
        }
        
        return answer;
    }
}