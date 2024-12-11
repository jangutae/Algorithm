import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int mod = 0;
        
        while (n > 0) {
            mod = n % 10;
            answer += mod;
            n /= 10;
        }
        
        // 123 % 10 = 3 
        // 123 / 10 = 12.3 > int 변환 12 % 10 = 2 12 / 10 1.2
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}