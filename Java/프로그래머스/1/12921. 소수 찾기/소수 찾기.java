import java.util.*;

class Solution {
    public int solution(int n) {
//         int answer = 1; // n 
        
//         for (int i = 3; i <= n;  i+=2) {
//              int cnt = 1;
            
//             for (int j = 3; j <= i; j+=2) {
//                 if (i % j == 0) { 
//                     cnt++;
//                     if (cnt > 2) break;
//                 } 
//             }
            
//             if (cnt == 2) answer++;
//         }
        
//         return answer;
        
        if (n < 2) return 0; // 1은 소수가 아님

        boolean[] isPrime = new boolean[n + 1];
        int count = 0;

        // 초기값 설정: 모든 수를 소수(true)로 가정
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체 적용
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) { 
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false; // 배수는 소수가 아님
                }
            }
        }

        // 소수 개수 세기
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) count++;
        }

        return count;
    }
}