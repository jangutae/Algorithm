import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;

        int maxNum = Arrays.stream(array).max().orElse(0);
        int[] count = new int[maxNum + 1]; // 숫자 범위만큼 카운트 배열 생성

        // 2. 각 숫자의 빈도수 저장
        for (int num : array) {
            count[num]++;
        }
       int maxFreq = 0;
        int mode = -1;
        boolean multipleModes = false;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxFreq) {
                maxFreq = count[i];
                mode = i;
                multipleModes = false; // 새로운 최빈값이 나오면 단일 모드로 설정
            } else if (count[i] == maxFreq) {
                multipleModes = true; // 최빈값이 여러 개면 true
            }
        }

        return multipleModes ? -1 : mode;
    }
}