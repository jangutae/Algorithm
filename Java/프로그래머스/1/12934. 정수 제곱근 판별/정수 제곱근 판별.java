class Solution {
    public long solution(long n) {
        long answer = 0;
        
        for (long x = 1; x <= n / x; x++) {
            answer = (n == x*x) ? (x + 1) * (x + 1) : -1;
        }
        
        return answer;
    }
}