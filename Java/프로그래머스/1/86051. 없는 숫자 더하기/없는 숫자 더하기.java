import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        
        for (int i : numbers) {
            sum -= i;
        }
        
        System.out.println(sum);
        return sum;
    }
}