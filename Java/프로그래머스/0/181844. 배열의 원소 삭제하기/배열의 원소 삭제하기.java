import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        Set<Integer> set = new HashSet<>();
        
        for (int j : delete_list) {
            set.add(j);
        }
        
        
        int[] intArr = new int[arr.length];
        int index = 0;
        
        for (int i : arr) {
            if (!set.contains(i)) {
                arr[index++] = i;
            }
        }
        
        
        return Arrays.copyOf(arr, index);
    }
}