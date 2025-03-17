class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int x = bill[0];
        int y = bill[1];
        
        int result = 0;
        int b = bill[0];
        int a = bill[1];
        
        while (wallet[0] < x || wallet[1] < y) {
            if (x > y) {
                x /= 2;
            } else {
                y /= 2;
            }
            
            answer++;
        }
        
        while (wallet[0] < a || wallet[1] < b) {
            if (a > b) {
                a /= 2;
            } else {
                b /= 2;
            }
            
            result++;
        }
        
        
        answer = answer > result ? result : answer;
        return answer;
    }
}