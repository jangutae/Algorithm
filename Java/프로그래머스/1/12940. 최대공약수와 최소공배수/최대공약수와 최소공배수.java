class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int multi = n * m;
        while (m > 0) {
          int mod = m;
            m = n % m;
            n = mod;
        }
        answer[0] = n;
        answer[1] = multi / n; 
        return answer;
    }
}