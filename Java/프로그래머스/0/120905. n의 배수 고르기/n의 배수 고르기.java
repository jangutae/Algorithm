import java.util.Arrays;
import java.util.stream.*;

class Solution {
    public int[] solution(int n, int[] numList) {

        return Arrays.stream(numList).filter(i -> i % n == 0).toArray();
        
    }
}