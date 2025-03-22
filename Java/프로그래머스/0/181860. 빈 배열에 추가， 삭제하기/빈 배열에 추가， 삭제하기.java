import java.util.*;
import java.util.stream.*;


class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (flag[i] == true) {
                for (int n = 1; n <= arr[i] * 2; n++) {
                    answer.add(arr[i]);
                }
            } else if (flag[i] == false) {
                for (int m = 1; m <= arr[i]; m++) {
                    answer.remove(answer.size() - 1);
                
                }
            }
        }
        
        int[] result = new int[answer.size()];
        
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}