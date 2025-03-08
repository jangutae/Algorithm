import java.util.*;

class Solution {
    public int solution(int[] numList) {
        int sum = Arrays.stream(numList).sum();
        int multi = Arrays.stream(numList).reduce(1, (a, b) -> a * b);
        int answer = (numList.length > 10) ? sum : multi;
        return answer;
    }
}