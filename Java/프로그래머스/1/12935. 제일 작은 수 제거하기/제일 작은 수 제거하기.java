import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int minIndex = 0;
        int index = 0;
        
        if (arr.length == 1) {
            answer = new int[] {-1};
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (i != minIndex) {
                answer[index++] = arr[i];
            }
        }
        return answer;
    }
}