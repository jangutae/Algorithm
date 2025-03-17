class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int x = wallet[0];
        int y = wallet[1];
        int a = bill[0];
        int b = bill[1];
        
        int result = 0;
        int s = bill[0];
        int t = bill[1];
        
        while (x < a || y < b) {
            if (a > b) {
                a /= 2;
            } else {
                b /= 2;
            }
            
            answer++;
        }
        
         while (x < t || y < s) {
            if (s > t) {
                s /= 2;
            } else {
                t /= 2;
            }
            
            result++;
        }
        
        
        answer = answer > result ? result : answer;
        
        
        return answer;
    }
}