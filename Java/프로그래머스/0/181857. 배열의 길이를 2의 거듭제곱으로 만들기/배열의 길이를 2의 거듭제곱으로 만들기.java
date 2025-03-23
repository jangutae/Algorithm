import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        
        int pow = 1;
        
        while (len > pow) {
            pow *= 2;
        }
        
        
        return Arrays.copyOf(arr, pow);
    }
}