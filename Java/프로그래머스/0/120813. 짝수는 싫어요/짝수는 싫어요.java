import java.util.stream.*;

class Solution {
    public int[] solution(int n) {
        
        return IntStream.rangeClosed(1, n).filter(i -> i % 2 != 0).toArray();
//         int index = 0;
//         for (int i = n; i >= 0; i--) {
//             if (i % 2 != 0) index++; 
//         }
        
//         int[] answer = new int[index];
//         return answer;
    }
}