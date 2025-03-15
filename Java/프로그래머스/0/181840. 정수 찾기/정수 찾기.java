import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] num_list, int n) {
        int answer = Arrays.stream(num_list).boxed().collect(Collectors.toList()).contains(n) ? 1 : 0;
        return answer;
    }
}