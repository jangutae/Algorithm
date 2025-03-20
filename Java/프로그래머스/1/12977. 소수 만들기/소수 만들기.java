import java.util.*;

class Solution {
    // 소수 판별 함수
    public boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public int solution(int[] nums) {
        int count = 0;
        int n = nums.length;

        // 3개 숫자의 조합을 선택하여 합을 구함
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}