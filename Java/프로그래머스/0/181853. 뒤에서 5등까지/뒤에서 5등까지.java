import java.util.*;

class Solution {
    public int[] solution(int[] numList) {
        
        Arrays.sort(numList);
        
        return Arrays.copyOfRange(numList, 0, 5);
    }
}