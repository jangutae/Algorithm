import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] num_list) {
        int sum = IntStream.of(num_list).sum();
        int multi = IntStream.of(num_list).reduce(1, (a, b) -> a * b);
        int answer = (multi > sum * sum)? 0 : 1;
        return answer;
    }
}