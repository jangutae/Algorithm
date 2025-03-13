import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int len = score.length;
        int[] arr = new int[len];
        int index = len - 1;
        
        Arrays.sort(score);
        
        for (int i = 0; i < len; i++) {
            arr[index--] = score[i];
        }
        
        int value = 0;
        for (int i = 0; i < len; i ++) {
            
            if (i == (m - 1) + (value * m)) {
                answer += arr[i] * m;
                value++;
            }
            
           
        }
        
        return answer;
    }
}