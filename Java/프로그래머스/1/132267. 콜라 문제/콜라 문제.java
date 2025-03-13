class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        // a 콜라를 먹기 위해 주는 객수
        
        // b 가져다 주면 콜라 주는 갯수
        
        // n 빈 병 갯수
         int mid = 0; 
        
        while (n >= a) {
        
            int value = (n / a) * b;
            answer += value;
            mid = n % a;
            n = value + mid;
            
        }
        
        return answer;
    }
}