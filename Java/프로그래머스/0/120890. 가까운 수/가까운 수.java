import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
//         int answer = 0;
//         int[] clone = array.clone();
        
//         Arrays.sort(clone);
        
//         Map<Integer, Integer> map = new HashMap<>();
        
//         for (int i = 0; i < array.length; i++) {
//             int abs = Math.abs(clone[i] - n);
//             map.put(clone[i], abs);
//         }
        
//         for (int i = 0; i < array.length; i++) {
            
//             int close = map.get(array[i]);
//             int min = map.get(array[0]);;
//             System.out.println(close);
//             System.out.println(min);
//             if (close < min || close == min) {
//                 min = close;
//             }
//             answer = array[i];
//         }
        int closest = array[0]; // 첫 번째 요소를 초기값으로 설정
        int minDiff = Math.abs(n - closest); // 초기 최소 차이값

        for (int num : array) {
            int diff = Math.abs(n - num);

            // 더 작은 차이를 찾거나, 차이가 같다면 더 작은 수를 선택
            if (diff < minDiff || (diff == minDiff && num < closest)) {
                closest = num;
                minDiff = diff;
            }
        }
        return closest;
        // return answer;
    }
}