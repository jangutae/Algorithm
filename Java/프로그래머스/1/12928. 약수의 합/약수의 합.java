class Solution {
    public int solution(int n) {
        int answer = 0;
        // 12 약수 {1, 2, 3, 4, 6, 12} 각 수는 12를 나누었때 떨어짐
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}