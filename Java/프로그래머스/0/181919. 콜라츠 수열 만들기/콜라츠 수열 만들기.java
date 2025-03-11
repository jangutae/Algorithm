class Solution {
    public int[] solution(int n) {
        int cnt = 1;
        int clone = n;
        
        while (clone != 1) {
            clone = (clone % 2 == 0) ? clone / 2 : clone * 3 + 1;
            cnt++;
        }
        
        int[] answer = new int[cnt];
        
        for (int i = 0; i < cnt; i++) {
            answer[i] = n;
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1; 
        }
        return answer;
    }
}