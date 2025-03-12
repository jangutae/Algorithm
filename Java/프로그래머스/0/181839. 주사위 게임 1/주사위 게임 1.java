class Solution {
    public int solution(int a, int b) {
        int answer = (a % 2 == 1 && b % 2 ==1) ? a * a + b * b 
            : (a % 2 == 1 || b % 2 ==1) ? 2 *(a +b)
            : (a % 2 != 1 || b % 2 !=1) ? Math.abs(a - b) : null;
        return answer;
    }
}