import java.util.*;

class Solution {
    public int[] solution(int[] numList, int n) {
        return Arrays.stream(numList)
                .boxed() // int[] -> Integer[] 변환
                .sorted(Comparator.comparingInt((Integer num) -> Math.abs(num - n)) // 1. 거리 기준 정렬
                        .thenComparing(Comparator.reverseOrder())) // 2. 거리가 같다면 큰 수 우선
                .mapToInt(Integer::intValue) // Integer[] -> int[] 변환
                .toArray();
    }
}